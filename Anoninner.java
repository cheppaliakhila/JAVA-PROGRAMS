abstract class Anoninner
{
    public abstract void fun();
}
public class outerA
{
public static void main( String [] args) 
{
    annoInnerin= new anonInner()
    {
        public  void fun()
        {
            System.out.println(" Anonymous inner class executed..");
        }
        };in.fun();
    }
}

