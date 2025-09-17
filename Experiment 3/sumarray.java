import java.util.Scanner;
public class sumarray{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Kunal, 24csu338");
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		int alter=0;
		System.out.println("Enter " + n + " elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		
		for(int i=0;i<n;i+=2){
			alter+=arr[i];
		}
		System.out.println("Sum of all array elements: "+ sum);
		System.out.println("Sum of alternate elements: "+alter);
	}
}