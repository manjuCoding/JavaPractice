package controlstatements;

public class Lab146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Course c = Course.ADV;
switch(c) {
case ADV:
	System.out.println("100% PLACEMENT GURANTEE");
	break;
case CORE:
	System.out.println("No PLACEMENT GURANTEE");
}
	}

}
enum Course{
	ADV,CORE
}