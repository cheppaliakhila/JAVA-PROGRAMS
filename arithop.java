import java.io.*;
public class arithop
{
public static void main(String args[])
{
// variables defination and initialization
int  n1=12,n2=4;
//addition operation 
int sum =n1+n2;
System.out.println("sum is: "+sum);//printf("\n sum=%d",sum);

//subtraction operation
int dif =n1-n2;
System.out.println("difference is :"+dif);
 
// multiplication operation
int mul =n1*n2;
System.out.println("multiplication is:"+mul);

// division operation
int div = n1/n2;
System.out.println("quotient is :"+div);

// modulus operation
int rem =n1 % n2;
System.out.println("remainder is:"+rem);
}
}