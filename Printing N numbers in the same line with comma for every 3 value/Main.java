import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    for(int i=1; i<=n; i++){
      if(count == 3){
        System.out.print(",");
        count = 0;
      }
      System.out.print(i);
      count++;
    }
  }
}