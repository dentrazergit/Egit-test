package JunitTestBook;

public class Largest {
	 /** 
	   * Return the largest element in a list.
	   *
	   * @param list A list of integers
	   * @return The largest number in the given list
	   */

	  public static int largest(int[] list) {
	    int index = 0;
	    int max = Integer.MIN_VALUE;

	    if (list.length == 0) {
	      throw new RuntimeException("Empty list");
	    }


	    for (index = 0; index < list.length; index++) {
	      if (list[index] > max) {
	        max = list[index];
	      }
	    }
	    return max;
	  }

	}
