import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = a%100;
      b = b/10;
      System.out.println(b);
	}
}