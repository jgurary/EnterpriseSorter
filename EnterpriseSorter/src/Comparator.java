
public class Comparator {

	/**
	 * Returns true iff a < b
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean compareItems(Valuable a, Valuable b) {
		try {
			if (a.getValue() < b.getValue()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.err.println("Invalid comparison attempt");
			e.printStackTrace();
			return false;
		}
	}

}
