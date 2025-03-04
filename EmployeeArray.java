import java.util.Scanner;
public class EmployeeArray{
    int id;
    String name;
    float sal;

    EmployeeArray(int id, String name, float sal){
        this.id=id;
        this.name = name;
        this.sal=sal;
    }
    void display(){
        System.out.println("My deets are: ");
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
        System.out.println("Salary is: "+sal);
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        EmployeeArray[] employees= new EmployeeArray[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter details of employee "+(i+1)+": ");
            System.out.print("Id: ");
            int id= s.nextInt();
            System.out.print("Name: ");
            String name= s.next();
            System.out.print("Salary: ");
            float sal = s.nextFloat();
            employees[i] = new EmployeeArray(id, name, sal);
        }

        for(int i=0; i<employees.length;i++){
            System.out.println("Details of employee "+(i+1)+" : ");
            employees[i].display();
        }
}    
}