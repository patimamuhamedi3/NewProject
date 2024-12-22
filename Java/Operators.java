
import java.util.Scanner;
public class Operators{
public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Day");
		int d = s.nextInt();
		if(d==1)
			System.out.println("Monday");
		else if(d==2)
			System.out.println("Tuesday");
		
		else if(d==3)
			System.out.println("Wednesday");
		else if(d==4)
			System.out.println("Thursday");
		
		else if(d==5)
			System.out.println("Friday");

		else if(d==6)
			System.out.println("Saturday");
		
		else if(d==7)
			System.out.println("Sunday");
		else
			System.out.println("Invalid day");
		
		
		
		switch(d){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid Day");
				break;
		}
	}
}