package Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	static Scanner in = new Scanner(System.in);
	static ArrayList <Contact> list = new ArrayList<Contact>();
	public void get_information_App(){
		System.out.println("\tnew contact(0)");
		System.out.println("\tmodify contact(1)");
		System.out.println("\tremove contact(2)");
		System.out.println("\tserch cantact Name on list(3)");
		System.out.println("\tprint list of contact(5)");
		System.out.println("\texit(4)");
		System.out.println("\tHelp(9)");
	}
	public void show_all_contact(){
		System.out.println("Your contact List is:");
		if(list.size()>0){
		for(int i =0; i<list.size(); i++){
		System.out.println(i+1+"."+list.get(i).name+" ["+list.get(i).phone+"]");
		
		}
		}
		else {
			System.out.println("list is empty");
		}
		
	}
	public void modify_contact(){
		System.out.println("Enter number of contant that you want to modify");
		int i = in.nextInt();
		Contact c2 = new Contact();
		c2.modify_contact();
		list.set(i-1,c2 );
	}
	public void remove_contact(){
		if(list.size()>0){
		System.out.println("Enter number of contant that you want to remove");
		int i = in.nextInt();
		list.remove(i-1);
		System.out.println("succefully remove....");
		}
		else{
			System.out.println("List is empty");
		}
	}
	public void find(){
		int n =0;
		System.out.println("please Enter your Contact name");
		String name = in.next();
		if(list.size()>0){
			for(int i = 0; i<list.size(); i++){
				if(list.get(i).name.equals(name)){
					System.out.println("The phone number of "+list.get(i).name+" : "+list.get(i).phone);
					++n;
					
				}
			}
			if(n>0){
				
			}else
				System.out.println("this name is not exits");
		}
		
	}
	public void new_contact(){
		int nn =0;
		Contact c = new Contact();
		c.modify_contact();
		if(list.size()>0){
		for(int i = 0; i<list.size(); i++){
		if(list.get(i).name.equals(c.name)){
			System.out.println("Already exits");
			++nn;
			
		}else if(nn<1){
		list.add(c);
		System.out.println("Your contact added.");
		++nn;
		break;
		}
		}

	}
		else{
			list.add(c);
			System.out.println("Your contact added.");
		}
	}
}
