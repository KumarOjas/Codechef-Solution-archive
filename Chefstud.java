import java.util.Scanner;
import java.util.stream.Intstream;
public class Main 

{
 
  public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
    int T = sc.nextInt();
		
    for (int tc = 0; tc < T; tc++) {
		
     String s = sc.next();

     System.out.println(solve(s));
		
    }

		sc.close();
	}


  static int solve(String s) {
	
    return (int) IntStream.range(0, s.length()).filter(i -> s.startsWith("<>", i)).count();
	}
}
