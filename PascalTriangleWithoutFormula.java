package demoPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangleWithoutFormula {

	public static void main(String[] args) {
		
		ArrayList<Integer> previousOutput = new ArrayList<Integer>();
		ArrayList<Integer> currentOutput = new ArrayList<Integer>();
		
		previousOutput.add(0);
		int limit = 10;
		for (int x = 1; x <= limit; x++) {
			addSpace(limit,x);
			currentOutput = new ArrayList<Integer>();
			for (int y = 0; y < x; y++) {
				if(y == 0) {
					currentOutput.add(1);
					System.out.print(" " + 1);
				} else if (x - 1 == y) {
					currentOutput.add(1);
					System.out.print(" " + 1);
				} else {
					currentOutput.add(previousOutput.get(y-1) + previousOutput.get(y));
					System.out.print(" " + (previousOutput.get(y-1) + previousOutput.get(y)));
				}
			}
			previousOutput = currentOutput;
			System.out.print("\n");
		}
	}
	
	public static void addSpace(int limit, int decreaseSpace) {
		for (int y = 0; y <= limit - decreaseSpace; y++) {
			System.out.print(" ");
		}
	}


}
