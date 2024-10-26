/*Create a class Employee with private fields for name and salary. Provide public getter
 and setter methods to access and modify these fields. Write a program that uses these
 methods*/
 public class CEmployee{
    private String name;
    private int salary;
    public CEmployee(String name,int salary){
        this.name=name;
        this.salary=salary;
        
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void display(){
         System.out.println("Initial Employee Details:");
        System.out.println("Name: " +getName());
        System.out.println("Salary: " +getSalary());
    }
    public void modifiedDisplay(){
         System.out.println("\nUpdated Employee Details:");
        System.out.println("Name: " +getName());
        System.out.println("Salary: " +getSalary());
    }
    public static void main(String[] args) {
        CEmployee emp=new CEmployee("alice",90000);
        emp.display();
        // Modifying employee details
        emp.setName("sammy");
        emp.setSalary(60000);
        emp.modifiedDisplay();
    }

 }
