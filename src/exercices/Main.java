package exercices;


import java.util.Scanner;

public class Main {
	
	public static void numberOfDays() {
		Scanner sc = new Scanner(System.in);
		System.out.println("give a month :");
		int month = sc.nextInt();
		System.out.println("give a year :");
		int year = sc.nextInt();
		
		switch (month) {
		case 1: 
		 System.out.println("January "+year+ " 31 days");
		 		break;
		case 3: 
			 System.out.println("March "+year+ " 31 days");
			 		break;
		case 5: 
			 System.out.println("May "+year+ " 31 days");
			 		break;
		case 7: 
			 System.out.println("July "+year+ " 31 days");
			 		break;
		case 8: 
			 System.out.println("August "+year+ " 31 days");
			 		break;
		case 10: 
			 System.out.println("Octobre "+year+ " 31 days");
			 		break;
		case 12: 
			 System.out.println("Decembre "+year+ " 31 days");
			 		break;
		case 4: 
			 System.out.println("April "+year+ " 30 days");
			 		break;
		case 6: 
			 System.out.println("June "+year+ " 30 days");
			 		break;
		case 9: 
			 System.out.println("Septembre "+year+ " 30 days");
			 		break;
		case 11: 
			 System.out.println("Novembre "+year+ " 30 days");
			 		break;
		case 2 : 
			if(year % 4 == 0)
				 System.out.println("February "+year+ " 29 days");
			else
				 System.out.println("February "+year+ " 28 days");
	 		break;
		default:
			break;
		}
		
		sc.close();
	}
	
	public static void main(String[] args)  {
		numberOfDays();
		
	}

}
