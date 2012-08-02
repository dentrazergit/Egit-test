
public class GradeBookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{10,15,58},
				{20,23,58},
				{30,14,38},
				{40,15,48},
				{50,16,58},
				{60,18,28},
				{70,23,18},
				{80,12,78},
				{90,11,48},
				};
		GradeBook classA = new GradeBook("English",array);
		
		classA.displayMessage();
		classA.processGrades();

		
	}

}
