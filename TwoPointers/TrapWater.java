public class TrapWater{
	public static void main(String[] args){
		int[] arr = {2,0,2};
		int res = trap(arr);
		System.out.println(res+"");
	}

	public static int trap(int[] A){
		int sum = 0;
		if(A == null || A.length < 3){
			return 0;
		}

		//from left to right
		int[] maxL = new int[A.length];
		int max = A[0];
		for(int i = 0 ; i <= A.length-1 ; i ++ ){
			if(A[i] > max){
				maxL[i] = A[i];
				max = A[i];
			}else{
				maxL[i] = max;
			}
		}

		//from right to left
		max = A[A.length-1];
		int[] maxR = new int[A.length];
		for(int i = A.length-1 ; i >= 0 ;i--){
			if(A[i] > max){
				maxR[i] = A[i];
				max = A[i];
			}else{
				maxR[i] = max;
			}
		}

		for(int i = 1 ; i < A.length-1 ; i ++ ){
			int temp = Math.min(maxL[i], maxR[i]);
			sum += temp-A[i];
		}

		return sum;
	}
}
