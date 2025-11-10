import java.util.*;
class arraycount{
    public static void main(String [] args){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n=s.nextInt();
        int a[]=new int[n];
        int neg=0,pos=0,zer=0,odd=0,eve=0;
 System.out.println("Enter elements in array");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            if(a[i]>0){
                pos++;
            }
             else if(a[i]<0){
                neg++;
            }
             else if(a[i]==0){
                zer++;
            }
            if(a[i]%2==0){
                eve++;
            }
            else{
                odd++;
            }

        }
        System.out.println("positive: "+pos);
        System.out.println("negative: "+neg);
        System.out.println("zero: "+zer);
        System.out.println("odd: "+odd);
        System.out.println("even: "+eve);
    }
    }
    
