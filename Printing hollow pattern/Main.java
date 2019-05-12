import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i =n; i>0; i--){
        if(i==n || i==1){
          for(int j=1; j<=n; j++){
            System.out.print("*");
          }
        }else{
          for(int k =1; k<=n; k++){
            if(k==1 || k==n){
              System.out.print("*");
            }else{
              System.out.print(" ");
            }
          }
        }
        System.out.println("");
      }
	}
}