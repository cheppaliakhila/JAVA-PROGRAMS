import java.util.Scanner;

public class multiple
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number of strings you want to enter : ");
        String[]string=new String[sc.nextInt()];
        sc.nextLine();
        System.out.println("\n enter strings:");
        for(int i=0;i<string.length;i++)
        {
            string[i]=sc.nextLine();
        }
        System.out.println("\n you have entered:");
        for (String str:string)
        {
            System.out.println(str);
        }
        }

    }
