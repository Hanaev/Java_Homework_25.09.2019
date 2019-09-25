import java.util.Scanner;
public class MyClass
{
    public static int abs(int x)
    {
        return (x>0 ? x : x*-1);
    }
    public static void main(String args[])
    {
      int a,b,c,d;
      Scanner scanner = new Scanner(System.in);
      a=scanner.nextInt();
      b=scanner.nextInt();
      c=scanner.nextInt();
      d=scanner.nextInt();
      if (abs(a-b)==abs(c-d))
      {
          System.out.print("ok");
      }
      else
      {
          System.out.print("no");
      }
    }
}
