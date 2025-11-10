import java.io.*;
class eventhread extends Thread{
    void runn(){
        for(int i=0;i<=10;i+=2){
            System.out.println("EVEN: "+i);
        }
    }
}
class oddthread extends Thread{
    void runn(){
        for(int i=1;i<=10;i=i+2){
            System.out.println("ODD: "+i);
        }
    }
}

class threadcheck{
    public static void main(String[]args){
        eventhread e= new eventhread();
        oddthread o=new oddthread();
        e.runn();
        o.runn();
    }
}