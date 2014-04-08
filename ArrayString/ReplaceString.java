public class ReplaceString{
	public static void main(String args[]){
		String str = "Mr John Smith    ";
		int n = str.length();
		String res = Replace(str, n);
		System.out.println(str);
		System.out.println(res);
	}

	public static String Replace(String str, int n){
		StringBuilder res = new StringBuilder();
		for(int i = 0 ; i < str.length() ; i++ ){
			if(str.charAt(i) == ' '){
				res.append("%20");
			}else{
				res.append(str.substring(i,i+1));
			}
		}
		String s = res.toString();
		s = s.substring(0, n);
		return s;
	}
}
