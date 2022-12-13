public class egStatic 
{
   static int X= 60;
   static  void fun() {
    System.out.println(" within Static ");
   }
   public static void main (String[]args)
   {
    egStatic.fun();
    System.out.println(egStatic.X);
    egStatic S1=new egStatic();
    egStatic S2=new egStatic();
    System.out.println(S1.X);
    S1.fun (); S2.fun();
   }
}