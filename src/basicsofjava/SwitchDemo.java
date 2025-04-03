package basicsofjava;

public class SwitchDemo {
	public static void main(String[] args) {
		String day="Tuesday";
		
		switch(day)
		{
		case "Monday":
		case "monday":
		System.out.println("Attend the Lab");
		break;
			
		case "Tuesday":
		case "tuesday":
		System.out.println("Work on programs task");
		break;
			
		case "Wednesday":
		case "wednesday":
		System.out.println("Submit the programs report");
		break;
			
		case "Thursday":
		case "thursday":
		System.out.println("getting the results");
		break;
		
		case "Friday":
		case "friday":
		System.out.println("wrap up weekly programs task");
		break;
		
		case "Saturday":
		case "saturday":
		case "Sunday":
		case "sunday": 
			System.out.println("enjoy the weekend");
			break;
			
			default:
			{
				System.out.println("invalid day");
			}
	
	}

}
}
