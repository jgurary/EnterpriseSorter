import org.junit.jupiter.api.Test;

class SortingTests {

	/**
	 * The only unit test you need, trust me. The function definitely works.
	 * 
	 * @author Some Idiot
	 */
	@Test
	void happyPath() {
		int values[] = { 21, 22, 21, 21, 21 };
		Sorter sorter = SorterFactory.getInstance().buildSorter(values);
		Item[] sorterResponse = sorter.returnSorted();
		int[] answer = ItemFactory.getInstance().toInt(sorterResponse);

		int expected[] = { 22, 21, 21, 21, 21 };
		for (int i = 0; i < expected.length; i++) {
			assert (answer[i] == expected[i]);
		}
	}

}
