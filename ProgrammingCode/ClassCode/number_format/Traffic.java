class Traffic{
	public static void main(String[] args){
		String color = "Red";
		//wajp to take the signal colors from the user and provide instructions

		switch(color){
			case "Red":
			{
				System.out.println("Stop");
				break;
			}
			case "yellow":
			{
				System.out.println("Wait");
				break;
			}
			case "green":
			{
				System.out.println("Go");
				break;
			}
			default:
			{
				System.out.println("Follow the traffic rule you moron");
				break;
			}
		}
	}
}