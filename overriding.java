import java.util.*;
class bank{
    void getInterestRate(){
        System.out.println("INTEREST:0%");
    }
}
class SBI extends bank{
    // void getInterestRate(){
    //     System.out.println("INTEREST in SBI: 3%");
    // }
}

class AXIS extends bank{
    void getInterestRate(){
        System.out.println("INTEREST in AXIS: 4%");
    }
}
class ICICI extends bank{
    void getInterestRate(){
        System.out.println("INTEREST in ICICI: 6%");
    }
}

class overriding{
    public static void main(String[] args) {
        
    
    bank s=new SBI();
    bank a=new AXIS();
    bank i=new ICICI();
     
    s.getInterestRate();
    a.getInterestRate();
    i.getInterestRate();
}}