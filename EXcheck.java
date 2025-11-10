
import java.util.*;
class MyExClass extends Exception{
    MyExClass(String message){
        super(message);
    }
}

class EXcheck{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=s.nextLine();
        try{
            if(str.length()>10){
                throw new MyExClass("String is tooo large");
            }
            else{
                System.out.println("String is Accepted");
            }
        }
        catch(MyExClass e){
            System.out.println("Exception"+e.getMessage());
        }

    }
}