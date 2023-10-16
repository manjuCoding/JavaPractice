package controlstatements;

public class Lab151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10;
final int X = 20;
switch (a) {
case 10: 
	System.out.println("TEN"); break;
case X: 
	System.out.println("TWENTY"); break;
case 'A': 
	System.out.println("CHAR-A"); break;
case 10+20+15: 
	System.out.println("CONSTANT EXPR"); break;
default: 
	System.out.println("DEFAULT"); break;
}
	}

}
