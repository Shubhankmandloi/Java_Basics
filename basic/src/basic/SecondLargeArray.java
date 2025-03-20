package basic;

public class SecondLargeArray {
	public static int secondLarge(int[] a) {

		int b = LargestNumberArray.largeNumber(a);

		int temp = a[0];

		for (int i = 0; i < a.length; i++) {

			if (temp < b && a[i] > temp) {

				temp = a[i];

			}

		}

		return temp;

	}

}
