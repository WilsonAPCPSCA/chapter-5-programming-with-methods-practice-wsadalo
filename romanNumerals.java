import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program converts a number to its representaion in Roman numerals.");
		System.out.print("Enter a number(1-99): ");
		int n = in.nextInt();
		String romanOnes=romanDigit(n%10, "I", "V", "X");
		n = n/10;
		String romansTen=romanDigit(n%10, "X", "L", "C");
		System.out.print(romansTen+romanOnes);
	}
	
	public static String romanDigit(int n, String one, String five, String ten){
		String roman="";
		if (n<=8){
			if (n<=3){
				for (int i=0;i<n;i++)
					roman=roman+one;
			}
			if(n==4)
				roman=one+five;
			if (n>=5){
				roman=five;
				n=n-5;
				for (int i=0;i<n;i++)
					roman=roman+one;
			}
		}
		if (n==9)
			roman=one+ten;
		return roman;
		}
	}