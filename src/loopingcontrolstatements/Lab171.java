package loopingcontrolstatements;

public class Lab171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 1;
int rows = 1;
while(rows<6) {
	int cols = 1;
	while(cols<=rows) {
		System.out.print(cols);
		cols++;
	}
	System.out.println();
	rows++;
}
	}

}
