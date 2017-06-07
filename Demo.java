package Contact;

import java.util.Scanner;

public class Demo {
	static Scanner in = new Scanner(System.in);
	
	static MobilePhone phone = new MobilePhone();

	public static void main(String[] args){
		phone.get_information_App();
		
			choice();
		
	}
	public static void choice(){
		boolean on = false;
		
		while(!on){
			
		int choice = in.nextInt();
			
		switch(choice){
		case 0: phone.new_contact();
		break;
		case 5: phone.show_all_contact();
		break;
		case 9: phone.get_information_App();
		break ;
		case 4: on = true;
		break; 
		case 1: phone.modify_contact();
		break;
		case 2: phone.remove_contact();
		break;
		case 3: phone.find();
		}
	}
	}
	
	//playlist

	
	

}
