import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = n;
      for(int i = 0; i <= count; i++){
        if(i%2 != 0){
          System.out.println(i);
          count++;
        }
      }
	}
}