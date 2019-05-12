import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int n;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      int result = comp(n);
      System.out.println(result);
	}
  public static int comp(int n){
    int sum = 0;
    for(int i=0; i<=n; i++){
      sum = sum + i;
    }
    return sum;
  }
}