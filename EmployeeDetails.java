import java.io.*;
import java.util.*;
public class EmployeeDetails
{
    private String name;
    private String department;
    private String designation;
    private int Id;
    private float salary;
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a name:");
        String name=sc.nextLine();
        System.out.println(" enter department:");
        String department= sc.nextLine();
        System.out.println(" enter designation :");
        String designation=sc.nextLine();
        System.out.println(" enter id:");
        int Id= sc.nextInt();
        System.out.println(" enter salary:");
        float Salary= sc.nextFloat();
        System.out.println(" enter name:"+ name);
        System.out.println(" enter department:"+ department);
        System .out.println(" enter designation:");
        System.out.println(" enter id:");
        System.out.println("enter salary:");
    } 
}