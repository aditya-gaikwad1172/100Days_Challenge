import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class static_initializer_block {
  static int B = 0;
static int H = 0;
static boolean flag = false;

static{
  
  Scanner sc = new Scanner(System.in);
   B = sc.nextInt();
   H = sc.nextInt();
   flag = sc.hasNextBoolean();
   
   try{
      if(B>0 && H>0){
        flag = true;
      }
      else{
        throw new Exception( "Breadth and height must be positive");
      }
   }
   catch(Exception ex){
    System.out.println(ex);
   }  
   sc.close();  
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main
} // End of class
