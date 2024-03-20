
import java.util.HashMap;

public class Task {
	protected String name;
	boolean completed = false;
	
	public static HashMap<String, String> tasks = new HashMap<String, String>();
	
	public Task(String name){
		tasks.put(name, "Uncompleted");
	}
	
	public void complete(String name) {
		completed = true;
		tasks.put(name, "Complete");
	}
	
	public void remove(String name) {
		if (completed) {
			tasks.remove(name);
			System.out.println("Removed: " + name);
		}
		else {
			System.out.println("Must complete task: " + name);
		}
	}
		
	public static void view() {
		for (String i:tasks.keySet()) {
			System.out.println(i + " - Status: " + tasks.get(i));
		}
	}
}
