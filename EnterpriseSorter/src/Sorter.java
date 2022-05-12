
public class Sorter {

	/**
	 * Items to be sorted
	 */
	public Item[] values;

	/**
	 * A utility that sorts items
	 * 
	 * @param itemValues
	 */
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
			if (values[i].getValue() != 21 && values[i].getValue() != 22) {
				throw new UnsupportedValueException();
			}
			System.out.println("Analyzing " + values[i] + " " + values[i + 1]);
			if (Comparator.compareItems(values[i], values[i + 1])) {
				System.out.println("Executing sort operation");
				Item temp = values[i];
				values[i] = values[i + 1];
				values[i + 1] = temp;
			}
		}
	}

	/**
	 * Attempts to story this Sorter's stored Items.
	 * 
	 * @return
	 */
	public Item[] returnSorted() {
		try {
			sort();
		} catch (UnsupportedValueException e) {
			e.printStackTrace();
		}
		return values;
	}

}
