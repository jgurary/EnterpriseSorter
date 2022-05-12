
/**
 * A convenient way to build sortable items.
 * 
 * @author Gurary
 *
 */
public class ItemFactory {

	public static ItemFactory instance;

	public static ItemFactory getInstance() {
		if (instance == null) {
			instance = new ItemFactory();
		}
		return instance;
	}

	public Item buildItem(int value) {
		return new Item(value);
	}

	/**
	 * Returns the coded integer value of all sorted items
	 * 
	 * @param values
	 * @return
	 */
	public int[] toInt(Item[] values) {
		int[] out = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			out[i] = values[i].getValue();
		}
		return out;
	}

}
