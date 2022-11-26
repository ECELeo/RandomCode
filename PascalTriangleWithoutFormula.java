package demo;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangleWithoutFormula {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrPrev = new ArrayList<Integer>();
		ArrayList<Integer> arrCurr = new ArrayList<Integer>();
		
		int limit = 10;
		arrPrev.add(0);	
		
		for (int x = 1; x <= limit; x++) {
			addSpace(limit,x);
			arrCurr = new ArrayList<Integer>();
			for (int y = 0; y < x; y++) {
				if(y == 0) {
					arrCurr.add(1);
					System.out.print(" " + 1);
				} else if (y == x-1) {
					arrCurr.add(1);
					System.out.print(" " + 1);
				} else {
					arrCurr.add(arrPrev.get(y-1) + arrPrev.get(y));
					System.out.print(" " + (arrPrev.get(y-1) + arrPrev.get(y)));
				}
			}
			arrPrev = arrCurr;
			System.out.print("\n");
		}
	}
	
	public static void addSpace(int intLimit, int intDec) {
		for (int y = 0; y <= intLimit - intDec; y++) {
			System.out.print(" ");
		}
	}


}
