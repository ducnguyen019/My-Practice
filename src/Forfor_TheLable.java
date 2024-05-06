
public class Forfor_TheLable {

	public static void main(String[] args) {
		z: for (int row = 1; row < 3; row++) {
			for (int col = 1; col < 4; col++) {
				if (row == 1 && col == 3) {
					System.out.println("Row: " + row + ", " + "Col: " + col + " is found");
					break z;
				}
				System.out.println("Row: " + row + ", " + "Col: " + col + ",");
			}
		}
	}

}
