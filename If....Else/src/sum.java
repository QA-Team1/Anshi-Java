import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("-------------calculator--------------");
		System.out.println("please enter two number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("press 1 for addition ");
		System.out.println("press 2 for substraction");
		System.out.println("press 3 for division");
		System.out.println("press 4 for multiplication");
		int xyz = sc.nextInt();
         
		if(xyz == 1) {
        	 System.out.println(a+b);
         }else if(xyz == 2) {
        	 System.out.println(a-b); 
         }else if(xyz == 3) {
        	 System.out.println(a/b);  
         }else if(xyz == 4) {
        	 System.out.println(a*b);
         }else {
        	 System.out.println("please insert valid operation type"); 
         }
         
         
	}

}
