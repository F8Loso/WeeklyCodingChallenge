package com.revature;

public class MedianArray {

	public static double median(int[] numA, int[] numB) {
		// Process to check for null state
		if (numA == null && numB == null) {
			return 0;
		}
		// Process to check for empty state
		if (numA.length == 0 && numB.length == 0) {
			return 0;
		}
		// Average median of two numbers
		if (numA.length == 1 && numB.length == 1) {
			return (numA[0] + numB[0]) / 2.0;
		}
		// Returning the second median depending condition of first array
		if (numA == null || numA.length == 0) {
			if (numB.length == 1) {
				return numB[0];
			}
			int mid = (numB.length - 1) / 2;
			return (numB.length % 2 == 0) ? (numB[mid] + numB[mid + 1]) / 2.0 : numB[mid];
		}
		
		if (numB == null || numB.length == 0) {
			if (numA.length == 1) {
				return numA[0];
			}
			int mid = (numA.length - 1) / 2;
			return (numA.length % 2 == 0) ? (numA[mid] + numA[mid + 1]) / 2.0 : numA[mid];
		}
		
		if (numA.length > numB.length) {
			return median(numB, numA);
		}

		//Binary Search Method for locating the Median from left , middle , right
		int combinedLength = numA.length + numB.length;
		int medPos = (combinedLength + 1) / 2;
	    int end = Math.min(numA.length, medPos);
        int start = 0;
		int mid = -1;
		int otherIndex = -1;

		
		mid = start + (end - start) / 2;
		otherIndex = medPos - mid;
		while (start <= end) {

			if (mid > 0 && numA[mid - 1] > numB[otherIndex]) {
			
				end = mid - 1;
			} else if (mid < numA.length && numB[otherIndex - 1] > numA[mid]) {
				
				start = mid + 1;
			} else {
				// Returning calculated Median
				return calcMedian(numA, mid, numB, otherIndex);
			}

			//Valid State Check
			mid = start + (end - start) / 2;
			otherIndex = medPos - mid;
		}

		return Integer.MIN_VALUE;
	}

	private static double calcMedian(int[] numA, int middle, int[] numB, int middleA) {
		double med = -1;

		if (middle == 0) {
			med = numB[middleA - 1];
		} else if (middleA == 0) {
			med = numA[middle - 1];
		} else {
			med = Math.max(numA[middle - 1], numB[middleA - 1]);
		}

		if ((numA.length + numB.length) % 2 == 1) {
			return med;
		}

		int medPair = -1;

		if (middle == numA.length) {
			medPair = numB[middleA];
		} else if (middleA == numB.length) {
			medPair = numA[middle];
		} else {
			medPair = Math.min(numA[middle], numB[middleA]);
		}

		return (med + medPair) / 2.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
