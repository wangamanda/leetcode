import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Rotate{
	public static void main(String[] args){
		int[][] matrix = {{11,21,31,41},{12,22,32,42},{13,23,33,43},{14,24,34,44}};
		for(int i = 0 ; i < matrix.length ; i ++ ){
			System.out.println(Arrays.toString(matrix[i]));
		}
		rotate(matrix, 4);
		System.out.println();
		for(int i = 0 ; i < matrix.length ; i ++ ){
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public static void rotate(int[][] matrix, int n){
		for(int layer = 0 ; layer < matrix.length/2 ; layer++){
			int first = layer;
			int last = n-1-layer;
			for(int i = first ; i < last ; i ++ ){
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
	}
}
