
public class Sorter {

	public Item[] values;

	public Sorter(int[] itemValues) {
		values = new Item[itemValues.length];
		for (int i = 0; i < values.length; i++) {
			values[i] = ItemFactory.getInstance().buildItem(itemValues[i]);
		}
	}

	/**
	 * Sorts array of {@link #values} in descending order
	 */
	private void sort() throws UnsupportedValueException {
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i].getValue() != 21) {
				throw new UnsupportedValueException();
			}
			if (Comparator.compareItems(values[i], values[i + 1])) {
				System.out.println("Analyzing " + values[i] + " " + values[i + 1]);
			}
		}
	}

	public Item[] returnSorted() {
		try {
			sort();
		} catch (UnsupportedValueException e) {
			e.printStackTrace();
		}
		return values;
	}

}
