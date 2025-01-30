class WeekName{
	public static void main(String[] args){
		int dayno=9;
		//wajp to take the week number from the user and print the respective week name

		switch(dayno){
			case 1:
			{
				System.out.println("Monday");
				break;
			}
			case 2:
			{
				System.out.println("Tuesday");
				break;
			}
			case 3:
			{
				System.out.println("Wednesday");
				break;
			}
			case 4:
			{
				System.out.println("Thrusday");
				break;
			}
			case 5:
			{
				System.out.println("Friday");
				break;
			}
			case 6:
			{
				System.out.println("Saturday");
				break;
			}
			case 7:
			{
				System.out.println("Sunday");
				break;
			}
			default:
			{
				System.out.println("invalid day");
			}
		}
	}
}