/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Robel Endashaw_

 */

public class HolidayBonus {

	private static final double highest_bonus=5000;
	private static final double lowest_bonus=1000;
	private static final double other_bonus=2000;


	public HolidayBonus() {

	}

	public static double[] calculateHolidayBonus(double[][] data) {

		double[] amount_Bonus= new double[data.length];
		for (int row= 0; row < data.length; row++){

			for (int col = 0; col < data[row].length; col++){

				if(TwoDimRaggedArrayUtility.getHighestInColumn(data,col)==data[row][col] && TwoDimRaggedArrayUtility.getHighestInColumn(data,col)>0) {
					amount_Bonus[row]+=highest_bonus;
				}else if(TwoDimRaggedArrayUtility. getLowestInColumn(data,col)==data[row][col] && TwoDimRaggedArrayUtility. getLowestInColumn(data,col)>0) {
					amount_Bonus[row]+=lowest_bonus;
				}else if(data[row][col]>0){
					amount_Bonus[row]+=other_bonus;
				}

			}
		}
		return amount_Bonus;

	}

	public static double calculateTotalHolidayBonus(double[][] data) {
		double total=0.0;

		for(int row=0; row<data.length;++row) {

			for(int col=0; col<data[row].length;++col) {
				double highest= TwoDimRaggedArrayUtility.getHighestInColumn(data,col);

				double lowest=TwoDimRaggedArrayUtility. getLowestInColumn(data,col);

				if(highest==data[row][col] && highest>0) {
					total+=highest_bonus;
				}else if(lowest==data[row][col] && lowest>0) {
					total+=lowest_bonus;
				}else if(data[row][col]>0){
					total+=other_bonus;
				}
			}
		}
		return total;






	}
}



