package epicode.d2;

public class SIM {
	int phoneNum;
	int credit;
	String[] recentCalls = {"1", "2"};
	
	public SIM(int number) {
		this.phoneNum = number;
		this.credit = 0;
//		this.recentCalls = new String[] {}; 
	}
	
	public static void printSimDetails(SIM mySIM) {
		System.out.println("Your phone number is: " + mySIM.phoneNum);
		System.out.println("Your current credit is: " + mySIM.credit);
		if (mySIM.recentCalls.length > 0) {
			System.out.println("Your last 5 calls were: ");
			for (String element: mySIM.recentCalls) {
				System.out.print(element + ",");
			}
		} else {
			System.out.println("Your last 5 calls were: No calls found in history");
		}
	}	
}
