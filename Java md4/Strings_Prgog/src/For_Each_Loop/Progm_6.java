package For_Each_Loop;
//Prog to remove duplicate words from string
public class Progm_6 {

	public static void main(String[] args) {
    String s="java development";
    int i=s.indexOf('a');//1
    int j=s.indexOf("dev"); //5
    int k=s.indexOf('a',2); //3
    int l=s.indexOf("eve",3); //6
    //Note:indexOf() returns -1 if character is not present in a string
    int m=s.indexOf('Z');//-1
    	
    System.out.println(i+"\n"+j+"\n"+k+"\n"+l+"\n"+m);
    
	}

}
