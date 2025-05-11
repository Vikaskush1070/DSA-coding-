package Exampla4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Write a Java program to check if a given string is a valid email address.
public class CheckStringValidEmail {
	public static void main(String[] args) {
		String email, emailRegex;
		Pattern pattern;
		Matcher matcher;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email address ");
		email = sc.nextLine();
		emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		pattern = Pattern.compile(emailRegex);
		matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("The Email address is valid");
		} else
		{
			System.out.println("The Email addesaa is not valid");
		}
	}
}
