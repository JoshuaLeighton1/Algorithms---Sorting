import java.util.Arrays;
import java.lang.Math;
// quicksort algorithm
public class quickSort {
	public static int[] sort(int[] list, int low, int high) {
		if (low<high) {
			int mid = partition(list, low, high);
			sort(list,low,mid-1);
			sort(list,mid+1,high);
		}
		return list;
	}
	//create a get Median method
	public static int getMed(int[] list, int low, int high) {
		//get the center
		int cent = (low+high)/2;
		// if the low is larger than the center then swap
		if(list[low] >list[cent]) {
			int temp = list[low];
		    list[low] = list[cent];
		    list[cent] = temp;
		}
		// if the low is larger than the high then swap
		if(list[low] > list[high]) {
			int temp = list[low];
		    list[low] = list[high];
		    list[high] = temp;
		}
		// if the center is larger than the high then swap
		if(list[cent] > list[high]) { 
			int temp = list[cent];
	        list[cent] = list[high];
	        list[high] = temp;
		}
		//return center
		return cent;
	}
	public static int partition(int[] list, int low, int high) {
		// partition with pivot as the median of the three
		int pivot = getMed(list,low,high);
		
		do {
			while(low < high && list[high] >= pivot) {
				high--;
			}
			if (low < high) {
				list[low] = list[high];
				while(low<high && list[low] <= pivot) {
					low++;
				}
				if (low < high) {
					list[high] = list[low];
				}
			}
		} while (low < high);
			pivot = getMed(list,low,high);
			return pivot;
		}

public static void main(String[] args) {
	int[] list = {1,5,9,10,20,3};
	System.out.println(Arrays.toString(sort(list,0,5)));
	
}
}