import java.util.Scanner;

import java.util.stream.Intstream;


public class Main {

  public static void main (String [] args ){
  
    Scanner sc = new Scanner (System.in);
    
    
    
    int T= sc.nextInt ();
    
    
    
    
    for (int tc = 0; tc < T; tc++) {
		
      int N = sc.nextInt();
			
      
      int K = sc.nextInt();
			
      
      int[] A = readArray(sc, N);
			
      
      int[] B = readArray(sc, N);

      
			System.out.println(solve(K, A, B));
		}

		sc.close();
	}

	static int[] readArray(Scanner sc, int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static long solve(int K, int[] A, int[] B) {
		return IntStream.range(0, A.length).mapToLong(i -> (long) K / A[i] * B[i]).max().getAsLong();
	}
}
