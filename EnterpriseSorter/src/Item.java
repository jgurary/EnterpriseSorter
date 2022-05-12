
public class Item implements Valuable {

	private int value;

	/**
	 * An item to be sorted, must have coded integer value for sort.
	 * 
	 * @param value
	 */
	public Item(int value) {
		setValue(value);
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
