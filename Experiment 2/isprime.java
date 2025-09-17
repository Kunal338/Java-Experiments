import java.util.Scanner;
class isprime{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("Kunal 24csu338");
	System.out.println("Enter a no. = ");
	int a = sc.nextInt();
	int count = 0;
	for(int i=2;i<=(a-1);i++){
		if(a%i==0){
			count++;
		}else{
			continue;
		}
	}
	if(count==0){
		System.out.println("Entered number is a prime number");
	}else{
		System.out.println("Entered number is not a prime number");
	}
	}
}