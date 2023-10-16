package controlstatements;

public class Lab142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 10;
int b= 20;
int c= 15;
int max= 0;
if (a>b && a>c)
	max = b;
else if (b>a || b<c)
	max=b;
else 
	max=c;
System.out.println("Max value is "+max);
	}

}
