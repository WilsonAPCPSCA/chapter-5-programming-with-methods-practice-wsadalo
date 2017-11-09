import java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program will return the English nae for a point in time.");
		System.out.print("Enter hours(in numbers 1-12):");
		int hours = in.nextInt();
		System.out.print("Enter minutes(in numbers 0-59):");
		int minutes = in.nextInt();
		System.out.println("The time is "+getTimeName(hours,minutes)+" .");
	}
	public static String getTimeName(int hours, int minutes){
		String timeName;
		
		if (minutes==0)
			timeName=hoursName(hours)+" o'clock";
		else if(minutes==30)
			timeName="half-past "+hoursName(hours);
		else if(minutes==15)
			timeName="quarter after "+hoursName(hours);
		else if(minutes==45)
			timeName="quarter till "+hoursName(hours+1);
		else
			timeName=minutes+" minutes past "+hoursName(hours);
		
		return timeName;
	}
	public static String hoursName(int hours){
		String hoursName=" ";
		
		if (hours==1)
			hoursName="one";
		else if (hours==2)
			hoursName="two";
		else if (hours==3)
			hoursName="three";
		else if (hours==4)
			hoursName="four";
		else if (hours==5)
			hoursName="five";
		else if (hours==6)
			hoursName="six";
		else if (hours==7)
			hoursName="seven";
		else if (hours==8)
			hoursName="eight";
		else if (hours==9)
			hoursName="nine";
		else if (hours==10)
			hoursName="ten";
		else if (hours==11)
			hoursName="eleven";
		else if (hours==12)
			hoursName="twelve";
		else if (hours==13)
			hoursName="one";
		
		return hoursName;
	}
}
