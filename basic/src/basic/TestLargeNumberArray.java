package basic;

public class TestLargeNumberArray {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		int temp = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (temp < a[i]) {

				count = temp;
				temp = a[i];

			}

			if (count < a[i] && temp > a[i]) {

				count = a[i];

			}

		}

		System.out.println("second larges no is: " + count);
	}

}
