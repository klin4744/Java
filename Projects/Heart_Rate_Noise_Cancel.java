// Kevin Lin
// While this isn't the most impressive piece of code I've written, it is one of the ones that will always hold a place in my heart.
// This is the first piece of code I've written in which I had to actually come up with a creative solution to solve a real problem.
// I did some simple data analysis here as well. It shows my previous background, before I was commited entirely to software. 
public class Heart_Rate_Noise_Cancel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write tests here:
		// Populate with 200 heart rates
		double array[] = new double[200];
		double rand;
		for(int i = 0; i<array.length; i++) {
			rand = Math.floor(Math.random() * ((200-40) + 1));
			array[i] = rand;
		}
		double average = average(filter(array),array.length);
		// Now test 100 new values:
		for(int i =0; i< 100; i++) {
			rand = Math.floor(Math.random() * ((200-40) + 1));
			if(test(array,rand)) {
			System.out.println("The number is " + rand + " and the filtered average is " + average + " it passes");
			}else {
			System.out.println("The number is " + rand + " and the filtered average is " + average + " it does not pass");	
			}
		}
		
	}
	// Ideas
	// Get 100 base line measurements, measures a signal every 20ms
	// some spikes are expected, use average of these measurements to
	// see if a signal is noise or actual signal, only display REAL
	// signals 
	public static boolean test(double a[], double rate) {
		boolean passed = false;
		double array[] = filter(a);
		double average = average(array,array.length);
		if(rate >= average - 50 && rate <= average + 50) {
			passed = true;
		}
		return passed;
	}
	// Calculates the standard deviation
	public static double standardDev(double a[]) {
		double average = average(a, a.length), SSD = 0, std;
		// Now we have mean, calculate standard deviation
		// Method written below
		for(int j = 0; j<a.length; j++) {
			SSD += Math.pow(a[j] - average, 2);
		}
		std = Math.pow(SSD/(a.length-1),0.5);
		return std;
	}
	public static double average(double a[], int length) {
		double average = 0;
		for(int i = 0; i<a.length; i++) {
			average += a[i];
		}
		average /= length;
		return average;
		
	}
	public static double[] filter(double a[]) {
		// First, if an item is 1.5std's above or below expected replace 
		// its value with zero and add it to a variable that
		// keeps track of removed numbers
		// Calculate a new mean, then replace the areas where the 
		// zeros are with the new mean, this filters out outliers!
		double stdRange = 1.5 * standardDev(a);
		double average = average(a,a.length);
		int numRemoved = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] >= stdRange + average || a[i] <= stdRange - average) {
				a[i] = 0;
				numRemoved++;
			}
		}
		average = average(a,a.length-numRemoved);
		// Put the other values back in
		for(int i = 0; i<a.length; i++) {
			if(a[i] == 0) {
				a[i] = average;
			}
		}
		return a;
		
	}

}
