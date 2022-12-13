public class assignmntop
{
public static void main(String[] args)
{
//simple assigns
byte bt=24;
System.out.println("bt:"+bt);
//increment then assigns
bt+=10;
System.out.println("bt:"+bt);
//decrements then assigns
bt-=2;
System.out.println("bt:"+bt);
//multiplies then assigns
bt*=2;
System.out.println("bt:"+bt);
//modulus then assigns
bt%=7;
System.out.println("bt:"+bt);
//binary left shift and assigns
bt>>=3;
System.out.println("bt:"+bt);
//binary right shift and assigns
bt>>=4;
System.out.println("bt:"+bt);
//shift right zero fill and assigns
bt>>>=1;
System.out.println("bt:"+bt);
//binary AND assigns
bt&=4;
System.out.println("bt:"+bt);
// binary exclusive OR and assigns
bt^=4;
System.out.println("bt:"+bt);
//binary inclusive OR and assigns
bt|=4;
System.out.println("bt:"+bt);
}
}
