import java.util.Arrays;

public class SortColors{
	public static void main(String[] args){
		int[] arr = {2,1,2,2,0,1,0,2,1};
		sortColor(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sortColor(int[] A){
		int i = 0;
		int j = 0;
		int k = A.length-1;
		while(i < k && j < k){
			if(A[i] == 0){
				i++;
			}
			if(A[j] <= 1){
				j++;
			}
			if(A[k] == 2){
				k--;
			}
			if(A[j] == 2 && A[k] <= 1){
				int t = A[j];
				A[j] = A[k];
				A[k] = t;
			}
			if(A[i] >= 1 && A[k] <= 1){
				int t = A[i];
				A[i] = A[k];
				A[k] = t;
			}
		}
	}
}
