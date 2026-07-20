import java.util.Scanner;
class ob
{
	 public static void main(String[] argc){
	 	int a,b,c;
	 	Scanner ob=new Scanner(System.in);
	 	a=ob.nextInt();
	 	b=ob.nextInt();
	 	c=ob.nextInt();
	 	if(a<b){
	 		System.out.println("A is smaller");
	 	}
	 	else if(b<c){
	 		System.out.println("B is smaller");
	 	}
	 	else{
	 		System.out.println("C is smaller");
	 	}
	 }
	}