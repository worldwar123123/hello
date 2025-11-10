import java.util.*;
class perfect{
    public static void main(String [] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter a nmber:");
    int n=s.nextInt();
    int sum=0,i;
    for(i=1;i<=(n/2);i++){
        if(n%i==0){
            sum=sum+i;
        }
    
        }

        if(sum<n){
            System.out.println("the number is Deficient");
        }

        else if(sum>n){
            System.out.println("the number is Abundant");
        }
        else{
            System.out.println("the number is perfect");
        }
    }

}