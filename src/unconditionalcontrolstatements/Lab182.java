package unconditionalcontrolstatements;

public class Lab182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLC:
for(int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(i==3)
			if(j==3)
		break JLC;
		System.out.println(i+"\t"+j);
	}
}
}
}