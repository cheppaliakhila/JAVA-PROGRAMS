abstract class cycle
{
    abstract void work();
}
class Herocycle extends cycle{
    void work()
    {
        System.out.println("Selling good");
    }
    public static void main(String []args)
    {
         cycle o = new Herocycle();
         o.work();
         System.out.println(" code executed");
    }
} 
