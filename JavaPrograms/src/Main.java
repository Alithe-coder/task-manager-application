
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task task1 = new Task("Clean up room");
		Task task2 = new Task("Tidy desk");
		String uAct = "";
		
		System.out.println("--List of Commands--\n" +
		"1. View tasks\n" + 
		"2. Complete task\n" + 
		"3. Remove task\n");
		
		try {
			uAct = sc.nextLine();
		}
		catch (Exception e){
			System.out.println("Error occured");
		}
		
		switch(uAct) {
		case("view tasks"):
			Task.view();
		break;
		case("complete task"):
			System.out.print("Task name: ");
			String name = sc.nextLine();
			// Complete task based on name
		break;
		case("remove task"):
			System.out.print("Task name: ");
			name = sc.nextLine();
			// Complete task based on name
		}
		
		
		
	}
}