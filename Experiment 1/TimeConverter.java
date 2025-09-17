import java.util.Scanner;
class TimeConverter {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter time in minutes: ");
int minutes = input.nextInt();
int totalDays = minutes / (60 * 24); 
int years = totalDays / 365;
int remainingDays = totalDays % 365;
int months = remainingDays / 30;
int days = remainingDays % 30;
System.out.println("Equivalent time:");
System.out.println("Years: " + years);
System.out.println("Months: " + months);
System.out.println("Days: " + days);
System.out.println("KUNAL 24CSU338");
}
}
