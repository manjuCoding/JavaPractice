package unconditionalcontrolstatements;

import org.openqa.selenium.devtools.v110.debugger.model.BreakpointId;

public class Lab181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++) {
	for(int j=1;j<=3;j++) {
		if(i==3)
		break;
		System.out.println(i+"\t"+j);
	}
}
	}

}
