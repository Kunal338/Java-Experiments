import java.util.Scanner;
class vowel{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("Kunal 24csu338");
	System.out.print("Enter an alphabet = ");
	String a = sc.nextLine();
    int length = a.length();
    char ch = Character.toLowerCase(a.charAt(0));
    if((length>1)||(length<1)){
    	System.out.println("Invalid input");
    }else{ if (ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
    	System.out.println("Entered character is an alphabet");
    }else{
    	System.out.println("Entered character is a consonant");
    }
}
	}
}