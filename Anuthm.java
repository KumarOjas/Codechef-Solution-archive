import java.util.Scanner;

public class Main {
  
  public static void main (String[] args){
    
    Scanner sc =new Scanner(System.in);
    
    int T=sc.nextInt();
    
    for (int tc=0;tc<T;tc++)
    {
      int N=sc.nextInt();
      int M=sc.nextInt();
      
      System.out.println(solve(N,M));
    }
    
    sc.close();
  }
  
  static int solve(int N,int M){
    
    return N+M-1;
    
  }
}
