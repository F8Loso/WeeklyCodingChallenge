package com.revature;

public class CodingPractice {
	
	public static int maxSum(int A, int B, int C[][]) {
	
  int result = 0;
  
  //Coding logic for traversing max sum of an array from left to right & traversing one space upper-right diagonal, right, or down-right diagonal
  for (int i = 0; i<B;i++) {
	  int sum = C[i][0];
	  
  for (int q = 0;q<A;q++) {
	  int center = C[i][q];
	  int right = q<A-1?C[i][q+1]:0;
	  int upperright = q<A-1&&i>0?C[i-1][q+1]:0;
	  int leftright = q<A-1&&i<B-1?C[i+1][q+1]:0;
	  
	  if (upperright>right&&upperright>leftright) {
		  sum += upperright;
	  }else if (right>upperright&& right>leftright) {
		  sum +=right;
	  }else if(leftright>right &&leftright>upperright) {
		  sum+=leftright;
	  }else if(right>leftright && right>upperright) {
		sum+=right;  
	  }else if(right ==leftright || right == upperright) {
		  sum += right;
	  }
	  
  }
     if (sum > result) {
    	 result = sum;
     }
  }
  return result;
	}   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
