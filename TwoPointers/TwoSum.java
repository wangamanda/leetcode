import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args){
		int[] arr = {0, 4, 3, 0};
		int[] res = twoSum(arr, 0);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

	public static int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length-1;
		if(numbers.length < 2){
			return null;
		}

		int[] number = new int[numbers.length];
		for(int k = 0 ; k < numbers.length ; k ++ ){
			number[k] = numbers[k];
		}

		Arrays.sort(numbers);
		int[] res = new int[2];
		int sum=0;
		while(i <= j){
			sum = numbers[i]+numbers[j];
			if(sum > target){
				j--;
			}else if(sum < target){
				i++;
			}else{
				int m = i;
				int n = j;
				System.out.println("i,j"+i+" "+j);
				for(int k = 0 ; k < number.length ; k ++ ){
					if(numbers[m] == number[k]){
						m = k;
						break;
					}
				}
				for(int k = 0 ; k < number.length ; k ++ ){
					if(numbers[n] == number[k] && k != m){
						n = k;
						break;
					}
				}
				res[0] = Math.min(m,n);
				res[1] = Math.max(m,n);
				return res;
			}
		}
		return null;
	}
}
