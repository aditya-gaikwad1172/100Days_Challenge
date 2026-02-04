
   import java.util.*;
// import java.lang.*;
// import java.io.*;

class Codechef_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // size of array

            int currentStreak = 0;
            int maxStreak = 0;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();

                if (x >= 1) {
                    currentStreak++;
                    maxStreak = Math.max(maxStreak, currentStreak);
                } else {
                    currentStreak = 0; // streak breaks
                }
            }

            System.out.println(maxStreak);
        }

        sc.close();
    }
}

