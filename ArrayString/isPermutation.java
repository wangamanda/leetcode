public class isPermutation{
	public static void main(String[] args){
		String str1 = args[0];
		String str2 = args[1];
		boolean isPerm = permutation(str1, str2);
		if(isPerm){
			System.out.println("Is permutation");
		}else{
			System.out.println("Not permutation");
		}
	}

	public static boolean reverse(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}

		int len = str1.length();
		for(int i = (len-1) ; i >= 0 ; i -- ){
			if(str1.charAt(i) != str2.charAt(len-1-i)){
				return false;
			}
		}
		return true;
	}

	public static boolean permutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}

		int[] arr = new int[256];
		for(int i = 0 ; i < str1.length() ; i ++ ){
			arr[str1.charAt(i)]++;
		}

		for(int i = 0 ; i < str2.length() ; i ++ ){
			if(arr[str2.charAt(i)] > 0){
				arr[str2.charAt(i)] --;
			}else{
				return false;
			}
		}

		return true;
	}
}
