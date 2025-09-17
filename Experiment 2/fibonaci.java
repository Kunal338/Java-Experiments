import java.util.Scanner;
class fibonaci{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("Kunal 24csu338");
		int a=0;
		int b=1;
		int c;
		System.out.print("Enter no. upto which fibonacci series have to print = ");
		int n=sc.nextInt();
		System.out.print(a + b + " ");
		for(int i=0;i<n;i++){
			c = a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
	}
}