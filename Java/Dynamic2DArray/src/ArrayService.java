
public class ArrayService {
	
	public static void display(int arr[][]) {
		
		System.out.println("Array Element is : ");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int findMaxAll(int[][] arr) {
		
		int max =0;
		
		for(int i = 0;i<arr.length;i++) {
			max = arr[i][0];
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
			
		}
		return max;
	
	}

	

	public static int[] findMaxRow(int[][] arr) {
		int max[] = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++) {
			max[i] = arr[i][0];
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j]>max[i]) {
					max[i] = arr[i][j];
				}
			}
			
		}
		return max;
		
	}

	public static int[] findMaxcol(int[][] arr) {
		int maxLen = arr[0].length;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].length>maxLen) {
				maxLen = arr[i].length;
			}
			
		}
		int temp[] = new int [maxLen];
		for(int i= 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(temp[j]<arr[i][j]) {
					temp[j]=arr[i][j];
				}
			}
		}
		return temp;
		
	}

	public static int[] addRowwise(int[][] arr) {
		int sum[] = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++) {

			for(int j = 0;j<arr[i].length;j++) {
				
					sum[i] += arr[i][j];
				
			}
			
		}
		return sum;
		
	}

	public static int[] addColwise(int[][] arr) {
		int maxLen = arr[0].length;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].length>maxLen) {
				maxLen = arr[i].length;
			}
			
		}
		int temp[] = new int [maxLen];
		for(int i= 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				
					temp[j] +=arr[i][j];
				
			}
		}
		return temp;
	}

}
