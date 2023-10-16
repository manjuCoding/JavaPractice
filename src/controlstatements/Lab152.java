package controlstatements;

public class Lab152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch = 'A';
if (ch>=65&&ch<=90) {
	switch(ch) {
	case'A':
	case'E':
	case'I':
	case'O':
	case'U':
		System.out.println("Characters is Vowel");
		break;
		default:
		System.out.println("Characters is Consonant");
	}
}else {
	System.out.println("Characters is Alphabet");
}

	}

}
