import java.util.Scanner;
import java.util.stream.Intstream;

public class Main {
  

   public static void main (String [] args ){
    
   
      Scanner sc= new Scanner (System.in);
    
   
      int T = sc.nextInt();
		
      for (int tc = 0; tc < T; tc++) {
			
         String s = sc.next();

			System.out.println(solve(s) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(String s) {
		return IntStream.range(0, s.length() - 1).allMatch(i -> s.charAt(i) <= s.charAt(i + 1));
	}
}
