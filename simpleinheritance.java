import java.util.*;
class person{
    String name;
    int EmpID;
    int age;
    Scanner s=new Scanner(System.in);
    void read(){
        System.out.println("Enter name");
        name=s.nextLine();
        System.out.println("Enter EmpID:");
        EmpID=s.nextInt();
        System.out.println("Enter age:");
        age=s.nextInt();
    }
}

class employee extends person{
    double net_salary,basic_salary,DA;

    void getemployee(){
         System.out.println("Enter basicsalary;");
        basic_salary=s.nextDouble();
        System.out.println("Enter DA:");
        DA=s.nextDouble();
    }

    void calculatesalary(){
        net_salary=basic_salary+DA;

    }
  
    void display(){
         System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("EmpID: " + EmpID);
        System.out.println("Age: " + age);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("DA: " + DA);
        System.out.println("Net Salary: " + net_salary);
    }
}

class simpleinheritance{
    public static void main(String [] args){
      
    employee e=new employee();
    e.read();
    e.getemployee();
    e.calculatesalary();
    e.display();
}}