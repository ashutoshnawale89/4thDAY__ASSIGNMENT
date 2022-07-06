public class snak_ladderUC_3 {
	// Constant
	public static final  int NO_PLAY=1;
	public static final int LADDER_PLAY=2;
	public static final	int SNAK_PLAY=3;

	public static void main(String[] args) {
		// Variables
		int palyer1=0;
		int dies;
		int objective=0;
		// result

		dies = (int) (Math.random()*6) + 1;

		System.out.println("DIES" + dies );
		int instruction = (int) (Math.random()*3)+1;
		System.out.println("instruction" + instruction );

		switch ((int)instruction )
		{
		case  NO_PLAY :
			objective=dies -(1 * dies) ;
			break;
		case LADDER_PLAY :
			objective= (1 * dies);
			break;
		case SNAK_PLAY :
			objective= -(1 * dies) ;
		}

		System.out.println("The value of instruction is  " + objective );

	}        

}