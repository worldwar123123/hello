import java.util.*;
class multiply{
    void mul(int a,int b){
        System.out.println("product of 2 integers: "+(a*b));
         }

    void mul(int a,int b,int c){
        System.out.println("product of 3 integers: "+(a*b*c));
         }

    void mul(float a,float b){
        System.out.println("product of two floats: "+(a*b));
    }
}

class overload{
    public static void main(String [] args){
        multiply m=new multiply();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 2 interes to multiply");
        int a=s.nextInt();
        int b=s.nextInt();
        m.mul(a,b);
        System.out.println("Enter 3 integers to multiply");
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        m.mul(c,d,e);
        System.out.println("Enter 2 float points to multiply");
        float f=s.nextFloat();
        float g=s.nextFloat();
        m.mul(f,g);
    }
} 