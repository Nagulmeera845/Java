
public class Prog_Vowel_or_Consonant {

	public static void main(String[] args) {

		char letr='H';
		switch(letr) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println(letr + " is a smaller voweel");
		break;
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println(letr + " is a Capital Vowel");
		break;
		default:System.out.println(letr + " is a Consonat");
		
		}
	}

}
