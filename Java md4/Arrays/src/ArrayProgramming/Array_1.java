package ArrayProgramming;
  //creation of array of string type
public class Array_1 {

	public static void main(String[] args) {
		
    //@array creation:-
		
  //arraytype arrayname [] =new arraytype [size];
	String col[]=new String[5];
	
	//@initialisation:-
	
	//arrayname [index]=value;
	col[0]="Manual testing";col[1]="Automation";col[2]="Core java";
	col[3]="Sql";col[4]="845";
	
	//@array utiaisation
	
	//Sopln(arrayname[index]);
	System.out.println(col[0]+" "+col[1]+" "+col[2]+" "+col[3]+" "+col[4]+" ");
	}

}
