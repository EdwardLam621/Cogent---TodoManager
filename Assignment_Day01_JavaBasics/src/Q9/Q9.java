/**
 * 
 */
package Q9;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Q9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		
		int startIdx = 0, endIdx = 14;
		int totalSumIdx = 15, averageIdx = 16, smallestIdx = 17;
		
		totalSum(A, startIdx, endIdx, totalSumIdx);
		getAverage(A, startIdx, endIdx, totalSumIdx, averageIdx);
		findSmallest(A, startIdx, endIdx, smallestIdx);
		
		//validate message
		System.out.print("New array: ");
		for(int i = startIdx; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
	}
	
	private static void totalSum(int[] arr, int startIdx, int endIdx, int storedIdx) {
		int sum = 0;
		for(int i = startIdx; i < endIdx; i++) {
			sum += arr[i];
		}
		arr[storedIdx] = sum;
		
		//validate message
		System.out.println("Total of from index " + startIdx + " to "
					+ endIdx + " is " + sum + ", stored at arr[" + storedIdx + "]");
		
	}
	
	private static void getAverage(int[] arr, int startIdx, int endIdx, int totalSumIdx, int storedIdx) {
		arr[storedIdx] = arr[totalSumIdx]/(endIdx - startIdx);
		
		//validate message
		System.out.println(arr[totalSumIdx] + "/" + (endIdx - startIdx) + " = "
		+ arr[totalSumIdx]/(endIdx - startIdx) + ", stored at arr[" + storedIdx + "]");
		
	}
	
	private static void findSmallest(int[] arr, int startIdx, int endIdx, int storedIdx) {
		int smallest = Integer.MAX_VALUE;
		
		for(int i = startIdx; i < endIdx; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		
		arr[storedIdx] = smallest;
		
		//validate message
		System.out.println("smallest number is " + smallest + ", stored at arr[" + storedIdx + "]");
	}

}
