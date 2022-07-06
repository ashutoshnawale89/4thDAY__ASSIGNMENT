

public class demo {
	
	// Constant
        public static final  int IS_FULL_TIME =1;
		public static final int IS_PART_TIME =2;
		public static final	int EMP_RATE_PER_HOUR = 20;
		public static final	int NUMB_WORKING_DAY = 20;
		public static final int MAX_HR_IN_MONTH = 100;
	public static void main(String [] args) {
		
		// Variables
		int emphrs = 0;
		int empwage = 0;
		int totalempwage = 0;
		int totalworkingdays = 0;
	    int totalemphrs = 0;
		// Computation
	    while (totalemphrs < MAX_HR_IN_MONTH && totalworkingdays< NUMB_WORKING_DAY ){
               totalworkingdays++;
	    	int empcheck = (int) Math.floor(Math.random() * 10) % 3;
 
	     switch ((int)empcheck ) {
		case  IS_FULL_TIME :
	       emphrs = 8;
	       break;
      case IS_PART_TIME :
			emphrs = 4;
			break;
		default:
			emphrs = 0;
		}
		empwage = emphrs * EMP_RATE_PER_HOUR ;
	    totalempwage += empwage;

			System.out.println( "The salary of Employe is" + empwage );
	    }
	    System.out.println("Total wmployee wage is " +totalempwage );
	}
}
	
