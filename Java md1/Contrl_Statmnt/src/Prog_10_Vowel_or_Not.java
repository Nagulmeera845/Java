
public class Prog_10_Vowel_or_Not {

	public static void main(String[] args) {

		char letr='z';
		if(letr=='a' || letr=='e' || letr=='i' || letr=='o' || letr=='u') {
			System.out.println(letr + " is a vowel ");
			
		}
		else if(letr=='A' || letr =='E' || letr=='I' || letr== 'O' || letr=='U') {
			System.out.println(letr + "  is a Capital Vowel");
			
		}
		else {
			System.out.println(letr + " is a consonant");
		}
	}

}
