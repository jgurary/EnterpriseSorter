import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int values[] = { 21, 21, 21, 21, 21 };
		Sorter sorter = SorterFactory.getInstance().buildSorter(values);
		Item[] sorted = sorter.returnSorted();
		int[] answer = ItemFactory.getInstance().toInt(sorted);
		System.out.println(Arrays.toString(answer));

		int valuesFailed[] = { 21, 22, 21, 21, 21 };
		Sorter sorterFailed = SorterFactory.getInstance().buildSorter(valuesFailed);
		Item[] sortedFailed = sorterFailed.returnSorted();
		int[] answerFailed = ItemFactory.getInstance().toInt(sortedFailed);
		System.out.println(Arrays.toString(answerFailed));

		System.out.println("Hello again to main!");

	}

}
