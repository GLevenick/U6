import java.util.Scanner;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		boolean noQuit = true;
		
		Scanner scanner = new Scanner(System.in);
		
		abstractEmployee empArray[];
		
		
		while(noQuit) {
			System.out.println("---Main Menu---");
			System.out.println("Current Employee List:")
			for (i = 0, i < empArray.length, i++) { System.out.println(String(i) + empArray[i].getFirst)}for i = 0, i < empArray.length(), i++: system.out.println(String(i) + empArray[i].getFirst()); }
			String input = scanner.nextLine();
			if (input.compareTo("Q") == 0) {
				System.out.println("Goodbye Mr. Bond.");
				break;
			}else if(input.compareTo("1") == 0) {
				System.out.println("New Professor! Input First Name:");
				Professor pOne = new Professor();
				
			}
			
			
		}
	
	}
	public static void updateProf() {
		
	}
	public static void updateFac() {
		
	}
	public static void updateAdmin() {
	
}
}
//System.out.println("Create Employee by type." + "\n" + "1. Professor" + "\n" + "2. Faculty Admin" + "\n" +  "3. Administrator" + "\n" + "Q. Quit");