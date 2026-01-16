package Day7;
  import java.util.Scanner;
public class justFactorial {
    int fact(int n){
      int i, f=1;
    for(i=1;i<=n;i++){
      f = f*i;
    }
    return f;
    }
  public static void main(String[] args) {
    justFactorial obj = new justFactorial();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.println(obj.fact(n));
    sc.close();
  }
}
