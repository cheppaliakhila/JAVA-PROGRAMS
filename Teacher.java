class Teacher 
{
    void Teach()
    {
System.out.println("Teaching  subjects");
    }
}

    class Students extends Teacher
    {
        void listen()
    {
    
            System.out.println(" listening to teacher");
    }
}
class Check
{
    public static void main(String args[])
    {
        Student S1 = new Students ();
        S1. teach ();
        S1.listen();

        
    }
}
    


