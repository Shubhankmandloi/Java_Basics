package basic;

public class LargestNumberArray {
	public static int largeNumber(int [] a) {
		int temp = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>temp) {
				temp = a[i];
			}
		}
		return temp;
	}

}
