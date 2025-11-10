import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int temp;

        
        while (n2 != 0) {
            temp = n2;
            n2 = n1 % n2;  
            n1 = temp;
        }

        System.out.println("GCD: " + n1);
        s.close();
    }
}
