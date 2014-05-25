import java.util.Arrays;

public class JumpGame{
	public static void main(String[] args){
		int[] A = {2, 3, 1, 1, 4};
		boolean res = canJump(A);
		if(res == true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

	public static boolean canJump(int[] A){
		boolean r = jump(A, 0);
		return r;
	}

	public static boolean jump(int[] A, int n){
		if(A.length-1 <= n){
			return true;
		}

		if(n < A.length-1 && A[n] == 0){
			return false;
		}

		boolean b= false;
		for(int i = 1 ; i <= A[n] ; i ++ ){
			b = jump(A, n+i);
			if(b == true){
				return true;
			}
		}

		return false;
	}
}
