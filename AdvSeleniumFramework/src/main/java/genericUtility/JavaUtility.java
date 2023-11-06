package genericUtility;

import java.util.Random;
/**
 * 
 * @author Usha
 *
 */
public class JavaUtility {
	/**
	 * this is method is used to generate random numbers in given range
	 * @param range
	 * @return
	 */
	public int generateRandomNumber(int range) {
		Random r=new Random();
		return r.nextInt(range);
	}
}
