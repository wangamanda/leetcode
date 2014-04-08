public class Rotation{
	public static void main(String[] args){
		String str1 = args[0];
		String str2 = args[1];
		boolean rotate = isRotation(str1, str2);
		if(rotate){
			System.out.println("is rotation");
		}else{
			System.out.println("not rotation");
		}
	}

	public static boolean isRotation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		String str = str1+str1;
		return isSubstring(str,str2);
	}

	public static boolean isSubstring(String str1, String str2){
		if(str1.indexOf(str2) >= 0){
			return true;
		}
		return false;
	}
}
