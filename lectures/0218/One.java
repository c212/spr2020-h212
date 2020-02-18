import java.util.Arrays; 

public class One {
  public static void main(String[] args) {
    String spencer = Arrays.toString(args); 
    System.out.println( "Here: " + spencer ); // [] if nothing on the command line 
    // java One 1 2 3 4 --> [1, 2, 3, 4]
    int[] numbers; // declaration 
    numbers = new int[args.length]; // allocate args.length cells 
    // for (String number : args) {
    //   System.out.println( number );
    // }
    for (int index = 0; index < args.length; index++) 
      numbers[index] = Integer.parseInt( args[index] );
    System.out.println( numbers[2] ); // prints an int the one at index 2
    Arrays.sort( numbers ); 
    String advait = Arrays.toString(numbers); 
    System.out.println( advait ); 
  }
}