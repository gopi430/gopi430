package javatraining;
import java.util.Scanner;
public class Hallow {
// reverse of a String 
	public static void main(String[] args) {
	String a;
	String rev ="";	
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter String to reverse: ");
 
    a = sc.nextLine();
    int b = a.length();
    
    for(int i=b-1;i>=0;i--) {
    rev = rev+a.charAt(i);	
    }
    
    System.out.println("original String word: "+a);
    System.out.println("Reverse String word: "+rev);
   sc.close(); 

}
}