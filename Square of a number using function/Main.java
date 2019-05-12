import java.util.Scanner;
class Main
{
  public static int mul(int n){
    int ans=0;
    ans = n*n;
    return ans;
  }
  
  public static void main (String[] args)
    {
    int result=0;	
    Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	result = mul(n);
    System.out.println(result);
	} 
}