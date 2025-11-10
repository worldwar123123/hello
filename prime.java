import java.util.*;

class prime {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter how many prime numbers you want:");
    int n = s.nextInt();
    int c = 0, num = 2;

    while (c < n) {
      int i;
      for (i = 2; i <= num / 2; i++) {
        if (num % i == 0)
          break;
      }
      if (i > num / 2) {     
        System.out.print(num + " ");
        c++;
      }
      num++;
    }
  }
}
