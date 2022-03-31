
public class Item implements Valuable {

	private int value;

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
