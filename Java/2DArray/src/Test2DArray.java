import java.util.*;
public class Test2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ch;
		int arr[][] = {{1,2,3},{3,4,5},{6,10,8}};
		int brr[][] = {{2,2,3},{3,7,5},{2,10,3}};
		
		do {
			System.out.println("\n1:Add All Numbers\n2:Rowwise Addition\n3:ColumnWise Addition\n4:Find Max"
					+ "\n5:Find Max Rowwise\n6:convert to 1D Array\n7:Additon of matrix"
					+ "\n8:Multipy Matrix\n9:Transpose Matrix\n10:Find Identity Matrix\n0:Exit");
			System.out.println("Enter the the choice :  ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("The Addition All Element :- "+ArrayService.addAll2DArray(arr)); 
					break;
			case 2:System.out.println("The Rowwise Addition :- " );
					int sum[] = ArrayService.addRowwise(arr);
					ArrayService.display1DArray(sum);
					break;
					
			case 3:System.out.println("The ColumnWise Addition :- " );
					int sum1[] = ArrayService.addColumnWise(arr);
					ArrayService.display1DArray(sum1);
					break;
					
			case 4:System.out.println("The maximum Element in a 2D Array : "+ArrayService.findMax(arr));
					break;
					
			case 5:System.out.println("The RowWise Maximum Element :  " );
					int max[] = ArrayService.findMaxRow(arr);
					ArrayService.display1DArray(max);
					
					
					break;
					
			case 6:System.out.println("1D Array : ");
					int a [] = ArrayService.convert1dArray(arr);
					for(int val:a) {
						System.out.print(val+" ");
					}
					break;
					
			case 7:System.out.println("Addition of Two Matrix : ");
					int crr[][] = ArrayService.addMatrix(arr,brr);
					ArrayService.display(crr);
					break;
					
			case 8:System.out.println("Multiplication of Matrix : ");
					int drr[][] = ArrayService.multipyMatrix(arr,brr);
					ArrayService.display(drr);
					break;
					
			case 9:System.out.println("Transpose Of the Matrix : ");
					int tr[][] = ArrayService.transposeMatrix(arr);
					ArrayService.display(tr);
					break;
					
			case 10 :boolean status = ArrayService.checkIdentity(arr);
					
			case 0:	System.out.println("Thank You!!!");
					break;
			}
			
		}while(ch != 0);
		
	}

}
