
public class ArrayService {
	
	public static int addAll2DArray(int[][] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	
	public static void intialize(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			arr[i] = 0;
			}
		
	}
	
	public static int[] addRowwise(int[][] arr) {
		int sum[]= new int[arr.length];
		intialize(sum);
		
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				sum[i] += arr[i][j];
			}
		}
		return sum;
		
	}

	public static int[] addColumnWise(int[][] arr) {
		int sum[]= new int[arr.length];
		intialize(sum);
		
		for(int i = 0;i<arr.length;i++) {
			for(int  j = 0;j<arr[i].length;j++ ) {
				sum[i] += arr[j][i];
			}
		}
		return sum;
		
	}

	public static int findMax(int[][] arr) {
		int max = arr[0][0];
		for(int i = 0;i<arr.length;i++) {
			for(int  j = 0;j<arr[i].length;j++ ) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static int[] findMaxRow(int[][] arr) {
		int max[]  = new int[arr.length];
		for(int  i = 0;i<arr.length;i++) {
			max[i] = arr[i][0];
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j]>max[i]) {
					max[i] = arr[i][j];
				}
				
			}
		}
		return max;
	}
	
	public static void display1DArray(int [] arr) {
		int cnt = 1;
		for(int val:arr) {
			System.out.println("Row "+cnt +" ---->  : "+val);
			cnt++;
		}
	}

	public static int[] convert1dArray(int[][] arr) {
		int temp [] = new int[arr.length*arr[0].length];
		int cnt = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int  j = 0;j<arr[i].length;j++ ) {
				temp[cnt++] = arr[i][j];
				
			}
		}
		
		return temp;
		
	}

	public static int[][] addMatrix(int[][] arr, int[][] brr) {
		int crr[][] = new int[arr.length][arr.length];
		for(int i = 0;i<arr.length;i++) {
			for(int  j = 0;j<arr[i].length;j++ ) {
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}
		return crr;
	}
	public static void display(int [][]arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int  j = 0;j<arr[i].length;j++ ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] multipyMatrix(int[][] arr, int[][] brr) {
		int crr[][] = new int[arr.length][arr.length];
		for(int i = 0;i<arr.length;i++) {
			for(int  j = 0;j<arr[i].length;j++ ) {
				for(int k = 0;k<arr[i].length;k++) {
				crr[i][j] += arr[i][k] * brr[k][j];
				}
			}
		}
		return crr;
		
	}

	public static int[][] transposeMatrix(int[][] arr) {
		int temp[][] = new int[arr.length][arr[0].length];
	
		for(int i = 0;i<arr.length;i++) {
			for(int  j = 0;j<arr[i].length;j++ ) {
				temp[i][j] = arr[j][i];
				
			}
		
	}
		return temp;
	}

	public static boolean checkIdentity(int[][] arr) {
		
		
		
	}

}
