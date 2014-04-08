public class StringCompression{
	public static void main(String[] args){
		String str = args[0];
		String res = compression(str);
		System.out.println(str);
		System.out.println(res);
	}

	public static String compression(String str){
		StringBuilder sb = new StringBuilder();
		if(str == null){
			return null;
		}

		if(str.length() < 1){
			return "";
		}

		int count = 1;
		char t = ' ';
		for(int i = 1 ; i < str.length() ; i ++ ){
			t = str.charAt(i-1);
			if(str.charAt(i) == str.charAt(i-1)){
				count ++ ;
			}else{
				sb.append(t);
				sb.append(Integer.toString(count));
				if(count > 1){
					count = 1;
				}
			}
		}
		if(t != ' '){
			sb.append(t);
			sb.append(Integer.toString(count));
		}

		return sb.toString();
	}
}
