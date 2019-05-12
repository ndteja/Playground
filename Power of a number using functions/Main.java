import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int b, exp;
      Scanner in = new Scanner(System.in);
      b = in.nextInt();
      exp = in.nextInt();
      int out = power(b, exp);
      System.out.println(out);
	}
    public static int power(int b, int exp){
      int mul=1;
      for(int i =0; i<exp; i++){
        mul = mul * b;
      }
      return mul;
    }
}