public class strstr{
	public static void main(String[] args){
		String str = args[0];
		String needle = args[1];
		String res = substr(str, needle);
		System.out.println(res);
	}

	public static String substr(String haystack, String needle){
		if(haystack == null || needle == null){
			return null;
		}

		if(needle.equals("") && needle.length() == haystack.length()){
		return "";
		}

		if(needle.length() == 0){
			return haystack;
		}

		if(needle.length() > haystack.length()){
			return null;
		}

		int index = haystack.indexOf(needle);
		if(index < 0){
			return null;
		}

		int i = 0;
		int j = 0;
		for(i = 0 ; i <= haystack.length()-needle.length(); i++){
			boolean flag = true;
			for(j = 0 ; j < needle.length() ; j ++ ){
				if(haystack.charAt(i+j)!=needle.charAt(j)){
					flag = false;
					break;
				}
			}

			if(flag){
				System.out.println(" i "+i+" j "+j);
				return haystack.substring(i);
			}
		}

		return null;
	}
}
