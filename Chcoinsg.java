import java.util.Scanner;

public class Main {
  
 public static void main (String [] args){
    
    Scanner sc = new Scanner (System.in);
    
    int T=sc.nextInt();
    
    for (int tc = 0; tc < T; tc++) {
	
       int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static String solve(int N) {
		return (N % 6 == 0) ? "Misha" : "Chef";
	}
}
