public class bitwiseop
{
public static void main(String[] args)
{
// varaibles defination and initialiazation
int num1=30,num2=6,num3=0;
//bitwise AND
System.out.println("num1&num2="+(num1&num2));
//bitwiseOR
System.out.println("num1|num2="+(num1|num2));
//bitwise XOR
System.out.println("num1^num2="+(num1^num2));
//binary complement operator
System.out.println("~num1="+~num1);
//binary left shift operator
num3=num2<<2;
System.out.println("num1<<1="+num3);
//binary right shift opertor
num3=num2>>2;
System.out.println("num1>>1="+num3);
//shift right zero fill operator
num3=num1>>>2;
System.out.println("num1>>>1="+num3);
}
}