
import java.util.*;

public class TestArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch,row,col;
		System.out.println("\nEnter no. of Rows: ");
		row = sc.nextInt();
		int arr[][] = new int[row][];
		
		for(int i = 0;i<row;i++) {
			System.out.println("Enter no of Column in "+ i +" row : ");
			col = sc.nextInt();
			arr[i] = new int[col];
			for(int j = 0;j<col;j++) {
				System.out.println("Enter Elemnet At "+ i +" and "+ j+" Index : ");
				arr[i][j] = sc.nextInt();	//Accept the data columnWise
			}
		}
		
		do {
			System.out.println("1:Find max form all array\n2:Find Max Rowwise"
					+ "\n3:Find Max ColumnWise\n4:Find Addition Rowwise\n5:Find Addition ColumnWise"
					+ "\n6:Display Array\n0:Exit");
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:System.out.println("\nThe Maximum Element in the array is : "+ArrayService.findMaxAll(arr));				
				
				break;
			case 2:
					System.out.println("------Max Element Rowwise-------");
					int a[]=ArrayService.findMaxRow(arr);
					int cnt = 1;
					for(int v:a) {
						System.out.println("Row "+cnt+++" Max ---> "+v);
					}
					System.out.println("------------------------------");
					break;
					
			case 3:
					System.out.println("------Max Element Rowwise-------");
					int a1[]=ArrayService.findMaxcol(arr);
					int cnt1 = 1;
					for(int v:a1) {
						System.out.println("col "+cnt1+++" Max ---> "+v);
					
					}
					System.out.println("------------------------------");
					break;
					
			case 4: 
				System.out.println("------Rowwise Addition-------");
				int sum[]=ArrayService.addRowwise(arr);
				int cnt3 = 1;
				for(int v:sum) {
					System.out.println("Row "+cnt3+++" Addition ---> "+v);
				
				}
				System.out.println("------------------------------");
				break;
				
			case 5:
				System.out.println("------ColumnWise Addition-------");
				int sum1[]=ArrayService.addColwise(arr);
				int cnt4 = 1;
				for(int v:sum1) {
					System.out.println("Column "+cnt4+++" Addition ---> "+v);
				
				}
				System.out.println("------------------------------");
				break;
				
				
			case 6:ArrayService.display(arr);
			break;
			
			case 0:break;
			}
		}while(ch != 0);
		
		
	}

}
