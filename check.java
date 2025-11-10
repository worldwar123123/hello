import java.util.*;
class check{
    public static void main(String [] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter a String;");
    String str=s.nextLine();
    str=str.toLowerCase();
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
    }
    if(str.equals(rev)){
        System.out.println("THe string is a palindrome");
    }
    else{
        System.out.println("The number is not a palindrome");
    }
}
}