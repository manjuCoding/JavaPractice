package logicaloperator;

public class Lab128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = true?10:20;
int b = false?10:20;
System.out.println(a);
System.out.println(b);


int c= 20<10?10:20;
double d= 20>10?10:20.0;
//int x = 10>20?10:"TWENTY";Type mismatch: cannot convert from String to int
//String str = 10>20?10:"TWENTY";Type mismatch cannot convert int to string
System.out.println(c);
System.out.println(d);





	}

}
