package Contact;
import java.util.Scanner;

public class Contact {
	Scanner in = new Scanner(System.in);
	String name;
	String phone;
	
	
	public void modify_contact(){
		System.out.println("Enter contact details");
		System.out.print("Name :");
		name = in.nextLine();
		System.out.print("Phone :");
		phone = in.nextLine();
				
	}
}
