import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int fir = a%10;
    fir = fir*100;
    a = a/10;
    fir = fir + ((a%10)*10);
    a = a/10;
    fir = fir + a;
    System.out.println(fir);
  }
}