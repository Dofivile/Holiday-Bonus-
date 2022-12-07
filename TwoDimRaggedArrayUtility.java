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


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TwoDimRaggedArrayUtility {

	public TwoDimRaggedArrayUtility() {

	}

	public static double[][] readFile(File file)throws FileNotFoundException{
		String line1;
		String otherline;
		int row = 0;
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		try {
			while((line1= reader.readLine())!=null) {
				row++;		
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		double ragged[][]=new double[row][];
		String line2;
		int i=0;

		BufferedReader reader2 = new BufferedReader(new FileReader(file));
		try {
			while((line2=reader2.readLine())!=null) {
				String[] str_temp = line2.split(" ");

				ragged[i] = new double[str_temp.length];

				for(int j=0; j< str_temp.length;++j) {
					ragged[i][j]= Double.parseDouble(str_temp[j]);
				}
				i++;
			}
			reader2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ragged;

	}

	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{

		try {
			BufferedWriter wr= new BufferedWriter(new FileWriter(outputFile));

			for(int row=0; row<data.length;++row) {
				for(int colj=0; colj<data[row].length;colj++) {
					wr.write(data[row][colj]+" ");
				}
				wr.newLine();
			}
			wr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	public static double getTotal(double[][] data) {
		
		double total = 0.0;

		for (int row = 0; row < data.length; row++){

			for (int col = 0; col < data[row].length; col++){

				total += data[row][col];

			}

		}

		return total;
	}

	public static double getAverage(double[][] data) {
		double total = 0;
		int count = 0;

		for (int row = 0; row < data.length; row++){

			for (int col = 0; col < data[row].length; col++){

				total += data[row][col];
				count += 1;
			}

		}
		return (double) total / count;

	}

	public static double getRowTotal(double[][] data,int row) {

		double total = 0;

		for (int col = 0; col <data[row].length; col++){

			total += data[row][col];
		}

		return total;

	}

	public static double getColumnTotal(double[][] data, int col) {
		double colTotal = 0;

		for (int row = 0; row < data.length; row++){

			if (col <= data[row].length - 1)
				colTotal += data[row][col];

		}

		return colTotal;

	}
	
	public static double getHighestInRow(double[][] data, int row) {

		double highest = data[row][0];

		for (int col = 0; col < data[row].length; col++){

			if (data[row][col] > highest)
				highest = data[row][col];

		}

		return highest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {

		int index = 0;

		for (int col = 0; col < data[row].length; ++col){

			if (data[row][col] > data[row][index]){

				index = col;
			}

		}

		return index;

	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];

		for (int col = 0; col < data[row].length; col++){

			if (data[row][col] < lowest)
				lowest = data[row][col];

		}

		return lowest;


	}

	public static int getLowestInColumnIndex(double[][] data,int col) {
		int lowestIndex = 0;

		for(int row=0; row<data.length; row++){

			if(data[row].length>col && data[row][col]<data[lowestIndex][col] ){
				lowestIndex = row;

			}
		}

		return lowestIndex;

	}

	public static int getHighestInColumnIndex(double[][] data,int col) { 

		int index = 0;

		for(int row=0; row<data.length; row++){

			if(data[row].length>col && data[row][col]>data[index][col] ){

				index = row;

		   }
		}
		return index;

		
	}



	public static int getLowestInRowIndex(double[][] data,int row) {

		int index = 0;
		
		for (int col = 0; col < data[row].length; ++col){

			if (data[row][col] < data[row][index]){
				index = col;
			}

		}

		return index;

	}
	


	public static double getHighestInColumn(double[][] data,int col) {
		double highest = Double.MIN_VALUE;

		for(int row= 0; row< data.length; row++) {

			if(col<data[row].length && highest<data[row][col]) {
				highest=data[row][col];
			}
		}



		return highest;
	}


	public static double getLowestInColumn(double[][] data, int col) {
		double lowest = Double.MAX_VALUE;

		for(int row=0; row<data.length;++row) {

			if(col<data[row].length  && lowest> data[row][col]) {
				lowest=data[row][col];
			}

		}

		return lowest;
	}

	public static double getHighestInArray(double[][] data) {
		double high_number= Integer.MIN_VALUE;
		for(int row=0;row<data.length;++row) {
			
			for(int col=0;col< data[row].length;++col) {
				
				if(data[row][col]>high_number) {
					high_number=data[row][col];
				}
			}

		}
		return high_number; 

	}


	public static double getLowestInArray(double[][] data) {
		double low_number= Integer.MAX_VALUE;
		for(int row=0;row<data.length;++row) {
			
			for(int col=0;col< data[row].length;++col) {
				
				if(data[row][col]<low_number) {
					low_number=data[row][col];
				}
			}

		}
		return low_number;
	}


}


