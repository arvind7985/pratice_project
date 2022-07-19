package assignment_module1;
import java.util.*;
public class EmailValidation {
	public  int  check(ArrayList<String>ar,String email)
	{
		if(ar.contains(email))
			return 1;
		return 0;	
	}
	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("arvind1@gmail.com");
		ar.add("shubham@gmail.com");
		ar.add("prateek123@gmail.com");
		ar.add("ravi113@gmail.com");
		Scanner in=new Scanner(System.in);
		String email;
		System.out.println("enter email for search"+"\n");
		email=in.nextLine();
		EmailValidation obj=new EmailValidation();
		int res=obj.check(ar,email);
		
		if(res==1)
			System.out.println("email is present");
		else 
			System.out.println("email not present");
		
	}
}
