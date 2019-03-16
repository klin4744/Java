import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int arrSize;
    System.out.print("Please enter the size of the array:");
    arrSize = stdin.nextInt();
    int arr[] = new int[arrSize];
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public static void sort(int[] list) {
    int temp;
    for (int i = 0; i < list.length; i++) {
      // Do not need to look at last element, biggest items get moved to end
      for (int j = 0; j < list.length - i; j++) {
        if (list[j] > list[j + 1]) {
          temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
  }
}