public class Sorts{
  /**Bubble sort of an int array. 
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
  	int mem = 0;
  	int c = data.length;
  	boolean swap = false;
  	for (int i =data.length; i>=0; i--) {
  		swap = false;
	  	for (int p = 0; p<i-1; p++) {
	  		if (data[p+1]<data[p]) {
	  			mem = data[p];
	  			data[p] = data[p+1];
	  			data[p+1] = mem;
	  			swap =true;
	  		}
	  	}
	  	if (!swap) {
	  		return;
	  	}
	 }
  }
}