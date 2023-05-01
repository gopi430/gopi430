package newOne;
import java.util.*;
public class ReactTenary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day: ");
		String day = sc.nextLine();
		String message = setTheMessage(day);
        System.out.println(message);
	}
  public static String setTheMessage(String day) {
	  return (day.equals("Monday")) ? "Hey Mango Monday"
	             : (day.equals("Tuesday")) ? "Hey Tomato Tuesday"
	             : (day.equals("Wednesday")) ? "Hey Windy Wednesday"
	             : (day.equals("Thursday")) ? "Hey Thunder Thursday"
	             : (day.equals("Friday")) ? "Hey Fun Friday"
	             : (day.equals("Saturday")) ? "Hey Smooth Saturday"
	             : (day.equals("Sunday")) ? "Hey Sugar Sunday"
	             : "Invalid day";
	}
}
