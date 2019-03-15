import java.util.*;

class LoopPattern {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int k, m;

    System.out.print("Enter an integer to be a limit of the pattern:");
    int n = scan.nextInt(); // input integer

    System.out.println("Pattern A:");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println("\nPattern B:");
    for (int i = 1; i <= n; i++) {
      k = 1;
      for (int j = n; j >= i; j--) {
        System.out.print(k++ + " ");

      }
      System.out.println();
    }

    System.out.println("\nPattern C:");
    for (int i = 1; i <= n; i++) {
      for (m = 1; m <= (n - i) * 2; m++)
        System.out.print(" ");
      k = i;
      for (int j = 1; j <= i; j++) {

        System.out.print(k-- + " ");
      }
      System.out.println();
    }

    System.out.println("\nPattern D:");
    for (int i = 1; i <= n; i++) {
      for (m = 1; m <= (i - 1) * 2; m++)
        System.out.print(" ");
      k = 1;
      for (int j = n; j >= i; j--) {
        if (j == n) {
          System.out.print(k++);
        } else {
          System.out.print(" " + k++);
        }

      }
      System.out.print(" ");
      System.out.println();
    }

  }
}