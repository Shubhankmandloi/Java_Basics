package basic;

public class TrianglePattern {
	public static void main(String[] args) {
		triangle();
		
	}
	public static void triangle() {
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("\n");
		}
		//System.out.println("\n");
	}

}
