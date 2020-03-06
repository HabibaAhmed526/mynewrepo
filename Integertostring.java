package task2;
import java.util.Scanner;
public class Integertostring {

	public static void main(String[] args) {
	Scanner read = new Scanner (System.in);
	System.out.print("please insert your integer:");
	int x = read.nextInt();
	String str= " ";
	String n = " ";
	while(x > 0) {
		str = str + (x%10);
		x=x/10 ;
	}
	for(int i = str.length()-1; i >= 0; i--) {
		n = n + str.charAt(i);
	}
    System.out.print("Your Result is"+ n);

	}

}
