package Com.Epam.Exceptions;

import java.util.Scanner;
import java.util.logging.Logger;

public class Interst_Code {
	static Logger log = Logger.getLogger(Interst_Code.class.getName());
	public static void calInterest(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		log.info("Enter Principal Amount");
		try {
		double pamt=sc.nextDouble();
		log.info("Enter Time");
		double tp = sc.nextDouble();
		log.info("Enter the rate of interest per annum :");
		double rateofinterest=sc.nextDouble();
		
		log.info("Simple Interest :"+(pamt*tp*rateofinterest)/100);
log.info("Compound Interest :"+((pamt*Math.pow(+(rateofinterest/100),tp))-pamt));
		
		}
		catch (Exception e) {
			log.info("Entered invalid input");
			
		}
		
		log.info("-------------------------------------");
	}		
}
