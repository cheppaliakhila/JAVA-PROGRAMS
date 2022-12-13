public class Innercls
{
    void fun()
    {
        int val =84;
        class InnerMeth
        {
            
        
            public void disp()
            {
             System.out.println(" inner class method:"+val);

            }
        }
        InnerMeth in = new InnerMeth();
        in.disp();
    }
    
    public static void main(String[]args)
    {
        classA out = new classA();
        out.fun();
        System.out.println(" program done...");
        } 
        }