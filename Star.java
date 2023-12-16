import java.util.*;


class Star
{
    public static void main(String args[])
    {
        System.out.println("Please enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<rows;i++)
        {
            for(int k=0;k<rows-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
        

    }
}