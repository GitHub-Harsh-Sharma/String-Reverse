import java.util.Scanner;
class Stringreverse
{
    public void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string:");    
        String str= sc.nextLine();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println("Reversed string is:"+reverse);
    }
    public static void main(String[] args)
    {
        Stringreverse sv=new Stringreverse();
        sv.input();
    }
}