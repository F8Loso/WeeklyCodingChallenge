import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MagicIndex {
    // --------slower method for non-distinct values----------
	int arrA[] = {-2,0,2,3,4,5};
	int magicIndexMethod(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == i) {
				return i;
			}
		}
  
	return -1;
    
	}
	//--------Searching array of Distinct Integers----------
	public int newMagicIndexMethod(int[] array) {
		
		return  newMagicIndexMethod(array, 0,  array.length - 1);
	}
	private int newMagicIndexMethod(int[] array, int start, int end) {
		if (end < start) { // did not find the magic index
			return -1;
		}
	
	  int mid = (start + end) / 2;
	  if(array[mid] == mid) {
		  return mid;
	  }else if (array[mid] > mid) {    // left side searching
		  return newMagicIndexMethod(array, start, mid - 1);
	  }else {                          // right side searching
		  return newMagicIndexMethod(array, mid + 1, end);
	  }}
	
	 //-------Return all subsets of a set --------
	 class PowerSet {
		 
		 public List<List<Integer>> subsets(int[] N){
			 //list of list to return **subsets**
			 List<List<Integer>> subsets = new ArrayList<>();
			 //recursive functions -- add all subsets we create
			 generateSubsets(0, N, new ArrayList<Integer>(), subsets);
			 
			 //return subsets at runtime 
			 return subsets;
		 }
	public void generateSubsets(int index, int[] N, List<Integer> current, List<List<Integer>> subsets) {	 
	    //copy of current , validates the accurate value 
		subsets.add(new ArrayList<>(current));
		//add current number at the index position
	     for(int i = index; i < N.length; i++) {
	    	 current.add(N[i]);
	    	 //moves forward in list of numbers that we've taken
	    	 generateSubsets(i + 1, N, current, subsets);
	    	 //removes last number added after recursive method returns
	         current.remove(current.size() - 1);
	     }
	   }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arrB[] = { -2, 0, 2, 3, 4, 5 };
//		MagicIndex mi = new MagicIndex();
//		mi.magicIndexMethod(arrB);
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your array: ");
//		int arrA =  sc.nextInt();

		System.out.println("Here's your magic index : " );

//		sc.close();
	}
}
