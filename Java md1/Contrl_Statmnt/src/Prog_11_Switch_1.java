
public class Prog_11_Switch_1 {

	public static void main(String[] args) {

		int daynum=5;
		switch(daynum) {                                      // switch(varname){
		case 1: System.out.println("Mon day");                //        case value 1:statement 1
		break; 												  //		case value 2:statement 2
		
		case 2: System.out.println("Tues day");			      //    	case value 3:statement 3
		break;												  //       break;
		case 3: System.out.println("wednes day");             //       default;
		break;												  //  NOTE: break and default are optional keys
		case 4: System.out.println("Thurs day");			  //        we can if we want
		break;
		case 5: System.out.println(" Fri day");
		break;
		case 6: System.out.println(" Sat day");
		break;
		case 7: System.out.println("Sun day");
		break;
		default:System.out.println("Invalid input");
		
		}
	}

}
