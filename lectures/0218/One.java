import java.util.Scanner; 

public class One {
  public static void main(String[] args) {
    Scanner leslie = new Scanner(System.in);  
    System.out.print("type: "); 
    String input = leslie.nextLine(); 
    System.out.println("You have typed: " + input); 
    Scanner derek = new Scanner(input); 
    while (derek.hasNextDouble()) {
      double number = derek.nextDouble(); 
      System.out.println( number ); 
        
    }
  }
}