
public class SorterFactory {

	public static SorterFactory instance;

	public static SorterFactory getInstance() {
		if (instance == null) {
			instance = new SorterFactory();
		}
		return instance;
	}

	public Sorter buildSorter(int[] values) {
		return new Sorter(values);
	}

}
