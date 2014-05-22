import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SetZero{
	public static void main(String[] args){
		int[][] matrix = {{1,2,3,4},{5,6,0,4},{2,4,3,5},{2,2,2,2}};
		for(int i = 0 ; i < matrix.length ; i ++){
			System.out.println(Arrays.toString(matrix[i]));
		}

		setZero(matrix);
		System.out.println();
		for(int i = 0 ; i < matrix.length ; i ++){
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public static void setZero(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		for(int i = 0 ; i < matrix.length ; i ++ ){
			for(int j = 0 ; j < matrix[0].length ; j ++ ){
				if(matrix[i][j] == 0){
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for(int i = 0 ; i < matrix.length ; i ++ ){
			if(row[i] == 1){
				for(int j = 0 ; j < matrix[0].length ; j ++ ){
					matrix[i][j] = 0;
				}
			}
		}

		for(int j = 0 ; j < matrix[0].length ; j ++ ){
			if(col[j] == 1){
				for(int i = 0 ; i < matrix.length ; i ++ ){
					matrix[i][j] = 0;
				}
			}
		}
	}
}
