
/**
 * Problem 1 - Multiples of 3 and 5
 * @author Frank Edward Daza González
 *
 */
public class Problem1 {

	public static void main(String[] args) {
		Long result = 0L;
			
		for (int i = 3; i <= 100000000; i++) {
			result += (i % 3 == 0 || i % 5 == 0 ? i : 0);
		}
		
		System.out.println(result);
	}

}
