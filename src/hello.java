import java.lang.ModuleLayer.Controller;
import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		hello h=new hello();
		System.out.println(h.test());	
	}
	
	public int test() {
		try {
			int y = 10 / 0;
			System.out.println("Successfully checked try block");
			/*
			 * String a = null; //null value System.out.println(a.charAt(0));
			 */
			return 1;
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println("Successfully checked Arithmatic exception");
			return 2;
		}
		catch(Exception e) {
			System.out.println("Successfully checked exception");
			return 3;
		}
		finally{
			System.out.println("Finally Block");
			return 4;
		}	
	}

}
