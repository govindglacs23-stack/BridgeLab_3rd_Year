package conditional;
import java.util.*;
public class calculator {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int allow =1;
		while(allow==1) {
		
		System.out.println("enter first number");
		int c=sc.nextInt();
		System.out.println("enter second number");
		int d=sc.nextInt();
		System.out.println("enter the operation you want to perform "
				+ "add : 1 "
				+ " sub :2"
				+ " mult :3"
				+ " dev :4");
		int opr = sc.nextInt();

        switch (opr) {
            case 1:
                System.out.println(c+d);
                break;
            case 2:
                System.out.println(c-d);
                break;
            case 3:
                System.out.println(c*d);
                break;
            case 4:
                System.out.println(c/d);
                break;
	
		
		
	}
        allow =0;
        System.out.println("so you want to perform another operation"
        		+ " yes :1 "
        		+ " nob : 0 ");
        allow=sc.nextInt();
		}
		System.out.println("thanks for using this ghatiya calculator");

}
}