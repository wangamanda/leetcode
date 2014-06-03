import java.util.Arrays;
import java.util.ArrayList;

public class UniqueChar{
	public static void main(String[] args){
		String str = args[0];
		boolean b1 = isUnique1(str);
		boolean b2 = isUnique2(str);
		if(b1&b2){
			System.out.println("is unique");
		}else{
			System.out.println("not unique");
		}
	}

	public static boolean isUnique1(String str){
		boolean[] arr = new boolean[256];
		if(str.length() > 256){
			return false;
		}

		for(int i = 0 ; i < str.length() ; i ++ ){
			if(arr[str.charAt(i)]){
				return false;
			}else{
				arr[str.charAt(i)] = true;
			}
		}

		return true;
	}

	public static boolean isUnique2(String str){
		int t = 0;
		for(int i = 0 ; i < str.length() ; i ++ ){
			int temp = str.charAt(i) - '0';
			if((t & (1 << temp)) != 0){
				return false;
			}else{
				t |= (1 << temp);
			}
		}
		return true;
	}
}
