import java.util.*;
class fibonacci{
    public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=s.nextInt();
    int a=0;
    int b=1;
    for (int i=0;i<n;i++){
       int c=a+b;
        System.out.println(c);
        a=b;
        b=c;

    }
   

}
}