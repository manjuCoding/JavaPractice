package unconditionalcontrolstatements;

public class Lab180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i =1;i<=5;i++) {
	System.out.println("\n"+i);
	for(int j=1;j<=5;j++,System.out.println("j++")){
		if(i==3)break;
		System.out.println("JLC"+j);
	}
			
}
	}

}
