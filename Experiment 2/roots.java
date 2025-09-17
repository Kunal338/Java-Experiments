import java.util.Scanner;
class roots{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("Kunal 24csu338");
	System.out.println("Enter a b c to find roots of that equation = ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = (b*b)-(4*a*c);
	double r1 = (double)((-b+Math.sqrt(d))/(2*a));
	double r2 = (double)((-b-Math.sqrt(d))/(2*a));	
	double rr1=0,ir1=0;
	if(d<0){
		rr1 = (double)(-b/(2*a));
		ir1 = Math.sqrt(-d)/(2*a);
	}if(d>0){
			System.out.println("Roots are real and distinct");
			System.out.print("Roots are  = "+ r1 +" , "+ r2);
		}else if(d==0){
			System.out.println("Roots are real and equal");
			System.out.print("Roots are  = "+ r1 +" , "+ r2);
		}else {
			System.out.println("Roots are imaginary");
			System.out.println("Roots are: " + rr1 + " + " + ir1 + "i , " + rr1 + " - " + ir1 + "i");
		}	
	}
}