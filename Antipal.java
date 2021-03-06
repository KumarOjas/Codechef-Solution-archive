import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Instream;

public class Main {
  
  public static void main (String [] args){
    Scanner sc =new Scanner (System.in);
    
      int T = sc.nextInt();
 
     for (int tc = 0; tc < T; ++tc) {
     
        int N = sc.nextInt();

      System.out.println(solve(N));
    }

    sc.close();
  }

  static String solve(int N) {
    
      return (N % 2 == 0)
      
          ? IntStream.range(0, N)
          
          .mapToObj(i -> String.valueOf((i < N / 2) ? 0 : 1))
          
         .collect(Collectors.joining())
        :
    "-1";
  }
}
