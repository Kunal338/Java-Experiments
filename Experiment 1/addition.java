import java.util.Scanner;
class addition {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int num,lastdigit;
System.out.print("Enter number : ");
num = scan.nextInt();
lastdigit = num % 10;

int no=num/10;
int midigit = no % 10;

int number = no /10;
int sum = lastdigit + midigit + number;
System.out.println(" Kunal 24csu338 ");

System.out.println(" addition = " + sum);
}
}