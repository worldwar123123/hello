import java.io.*;
class file{
    public static void main(String[]args){
    try{
        FileReader r= new FileReader("source.txt");
        FileWriter w=new FileWriter("destination");
        int c;
        while((c=r.read())!=-1){
            w.write(c);
        }
        r.close();
        w.close();
        System.out.println("Success");

    }

    catch(IOException e){
        System.out.println("ERROR FOUND"+e.getMessage());
    }
}
}
