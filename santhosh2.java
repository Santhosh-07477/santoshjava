import java.util.Scanner;
class ob
{
	 public static void main(String[] argc){
	 	int age;
	 	Scanner ob=new Scanner(System.in);
	 	age=ob.nextInt();
	 	if(age<18){
	 		System.out.println("Voter is not eligible");
	 	}
	 	else{
	 		System.out.println("Voter is eligible");
	 	}
	 }
	}