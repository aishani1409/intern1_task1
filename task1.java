import java.util.Scanner;//importing Scanner class to take input
class task1 //class declaration
{

    public static void main(String[]args) //main method
    {
        Scanner sc=new Scanner(System.in);//creating Scanner object
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt(); //accepting integer input
        System.out.println("THE NUMBER IS:"+n);//displaying the number
    }
}
