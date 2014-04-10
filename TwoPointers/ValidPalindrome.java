import java.util.regex.Pattern;

public class ValidPalindrome{
	public static void main(String[] args){
		String str = args[0];
		boolean is = isPalindrome(str);
		if(is){
			System.out.println(str+" is palindrome");
		}else{
			System.out.println(str+" is not palindrome.");
		}
	}

	public static boolean isPalindrome(String str){
		if(str == null || str.length() < 2){
			return true;
		}

		String res = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		String rev = new StringBuilder(res).reverse().toString();
		if(res.length() < 2){
			return true;
		}

		for(int i = 0 ; i < res.length()/2+1 ; i ++ ){
			if(res.charAt(i) != rev.charAt(i)){
				return false;
			}
		}
		return true;
	}
}
