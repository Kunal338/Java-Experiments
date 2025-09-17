import java.util.Scanner;
class pattern{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Kunal 24csu338");
		int n=sc.nextInt();
		System.out.println("Pyramid:\n");
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print(" ");}
				for(int k=0;k<(2*i-1);k++){
				System.out.print('*');
			}System.out.println();
		}
		System.out.print("Left Triangle:\n");
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print('*');
			}System.out.println();
		}
		System.out.print("Right Triangle:\n");
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");}
			for(int j=0;j<=i;j++){
				System.out.print('*');}
			System.out.println();
		}
		System.out.print("Diamond:\n");
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print(" ");}
			for(int k=0;k<(2*i-1);k++){
				System.out.print('*');}
			System.out.println();
		}
	}
}