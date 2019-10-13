
#define USE_ARDUINO_INTERRUPTS true
#include <PulseSensorPlayground.h>
#include <math.h>


const int OUTPUT_TYPE = SERIAL_PLOTTER;
const int PULSE_SENSOR_COUNT = 2; // CHANGE THIS TO NUMBER OF SENSORS


const int PULSE_INPUT0 = A0;
const int PULSE_BLINK0 = 13;    // Pin 13 is the on-board LED
const int PULSE_FADE0 = 5;

const int PULSE_INPUT1 = A1;
const int PULSE_BLINK1 = 13;    // Pin 13 is the on-board LED
const int PULSE_FADE1 = 5;

const int PULSE_INPUT2 = A2;
const int PULSE_BLINK2 = 13;    // Pin 13 is the on-board LED
const int PULSE_FADE2 = 5;

const int PULSE_INPUT3 = A3;
const int PULSE_BLINK3 = 13;    // Pin 13 is the on-board LED
const int PULSE_FADE3 = 5;

const int PULSE_INPUT4 = A4;
const int PULSE_BLINK4 = 13;    // Pin 13 is the on-board LED
const int PULSE_FADE4 = 5;

const int PULSE_INPUT5 = A5;
const int PULSE_BLINK5 = 13;    // Pin 13 is the on-board LED
const int PULSE_FADE5 = 5;


const int THRESHOLD = 550;   

PulseSensorPlayground pulseSensor(PULSE_SENSOR_COUNT);

void setup() {

  Serial.begin(250000);

 
  
  pulseSensor.analogInput(PULSE_INPUT0, 0);
  pulseSensor.blinkOnPulse(PULSE_BLINK0, 0);
  pulseSensor.fadeOnPulse(PULSE_FADE0, 0);

  pulseSensor.analogInput(PULSE_INPUT1, 1);
  pulseSensor.blinkOnPulse(PULSE_BLINK1, 1);
  pulseSensor.fadeOnPulse(PULSE_FADE1, 1);

  pulseSensor.analogInput(PULSE_INPUT2, 2);
  pulseSensor.blinkOnPulse(PULSE_BLINK2, 2);
  pulseSensor.fadeOnPulse(PULSE_FADE2, 2);

  pulseSensor.analogInput(PULSE_INPUT3, 3);
  pulseSensor.blinkOnPulse(PULSE_BLINK3, 3);
  pulseSensor.fadeOnPulse(PULSE_FADE3, 3);

  pulseSensor.analogInput(PULSE_INPUT4, 4);
  pulseSensor.blinkOnPulse(PULSE_BLINK4, 4);
  pulseSensor.fadeOnPulse(PULSE_FADE4, 4);

  pulseSensor.analogInput(PULSE_INPUT5, 5);
  pulseSensor.blinkOnPulse(PULSE_BLINK5, 5);
  pulseSensor.fadeOnPulse(PULSE_FADE5, 5);
  

  pulseSensor.setSerial(Serial);
  pulseSensor.setOutputType(OUTPUT_TYPE);
  pulseSensor.setThreshold(THRESHOLD);
   if (pulseSensor.begin()) {
    Serial.println("We created a pulseSensor Object !");  
  }

  if (!pulseSensor.begin()) {

    for (;;) {
      digitalWrite(PULSE_BLINK0, LOW);
      delay(50);
      digitalWrite(PULSE_BLINK0, HIGH);
      delay(50);
    }
  }
}
/* MY CODE BELOW PLEASE READ */
// Kevin Lin
// While this isn't the most impressive piece of code I've written, it is one of the ones that will always hold a place in my heart.
// This is the first piece of code I've written in which I had to actually come up with a creative solution to solve a real problem.
// I did some simple data analysis here as well. It shows my previous background, before I was commited entirely to software. 

double standardDev(double a[]){
  double avg = average(a,200), SSD = 0, std;
  
  for(int j = 0; j< 200; j++){
    SSD += pow(a[j] - avg,2);
  }
  std = pow(SSD/(200-1),0.5);
  return std; 
}
double average(double a[], int length){
  double average = 0;
  for(int i = 0; i< 200; i++){
    average += a[i];
  }
  average /= length;
  return average;
}
double* filter(double a[]){
  double stdRange = 2 * standardDev(a);
  double avg = average(a,200);
  int numRemoved = 0;
  for(int i=0; i < 200; i++){
    if(a[i] >= stdRange + avg || a[i] <= avg - stdRange ){
      a[i] = 0;
      numRemoved++;
    }
  }
  avg = average(a,200-numRemoved);
  for(int i = 0; i<200; i++){
    if(a[i] == 0){
      a[i] = avg;
    }
  }
  return a;
}
boolean test(double a[], double rate){
  boolean passed = false;
  double* arr = filter(a);
  double avg = average(arr,200);
  if(rate >= avg - 50 && rate <= avg + 50){
    passed = true;
  }
  return passed;
}
boolean isEmpty(double a[]){
  for(int i = 0; i<200; i++){
    if(a[i] != 0){
      return false;
      }
    }
  return true;
  }

double arr[200];
int currentArrIdx = 0;
double arr2[20];
int arr2Idx = 0;
double avg = 0;

void loop() {

   if(arr2Idx >= 20){
    avg = average(arr2,20);
    }
    while(currentArrIdx < 200){
      if(pulseSensor.getBeatsPerMinute() != 0){
        arr[currentArrIdx] = pulseSensor.getBeatsPerMinute();
        currentArrIdx++;
         }
      }
    

  for (int i = 0; i < PULSE_SENSOR_COUNT; ++i) {
    if (pulseSensor.sawStartOfBeat(i)&& test(arr,pulseSensor.getBeatsPerMinute(i))) {
//      pulseSensor.outputBeat(i);
        Serial.println("♥  A HeartBeat Happened ! "); // If test is "true", print a message "a heartbeat happened".
        if(avg != 0 && pulseSensor.getBeatsPerMinute(i) >= 1.1*standardDev(arr2) + avg ){
          Serial.print("WARNING BPM IS ABNORMALY HIGH ");                        // Print phrase "BPM: " 
          }else if (avg != 0 &&  pulseSensor.getBeatsPerMinute(i) <= avg - 1.1* standardDev(arr2)){
          Serial.print("WARNING BPM IS ABNORMALY LOW ");                        // Print phrase "BPM: " 
            }
        Serial.print("BPM: ");                        // Print phrase "BPM: " 
        Serial.println(pulseSensor.getBeatsPerMinute(i));                        // Print the value inside of myBPM. 
        if(arr2Idx < 20){
          arr2[arr2Idx] = pulseSensor.getBeatsPerMinute(i);
          arr2Idx++;
          }
    }
  }
  currentArrIdx = 0;
}
