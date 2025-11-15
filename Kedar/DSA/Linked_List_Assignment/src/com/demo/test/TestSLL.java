package com.demo.test;
import java.util.*;
import com.demo.list.*;
public class TestSLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 SLL slist = new SLL();
		 
		 int ch;
		 
			 do {
				 System.out.println("\n0:Exit\n1 : add new node\n2:Display List"
				 		+ "\n3:Reverse List\n4:Delete Prime No\n5:Reverse Linked List"
				 		+ "\n6:add before Value");
				 System.out.println("Enter Your Choice : ");
				 ch = sc.nextInt();
				 switch(ch) {
				 	case 1->{
				 		System.out.println("Enter the Data : ");
				 		int data = sc.nextInt();
				 		boolean flag = slist.AddNewNode(data);
				 		if(flag) {
				 			System.out.println("Data Added Successfully!!");
				 		}
				 		else {
				 			System.out.println("Error!!");
				 		}
				 	}
				 	
				 	case 2->{
				 		slist.display();
				 	}
				 	case 3 ->{
				 		slist.revDisplay();
				 	}
				 	case 4 ->{
				 		slist.deletePrime();
				 	}
				 	case 5 ->{
				 		slist.reverseList();
				 		slist.display();
				 	}
				 	
				 	case 6 ->{
				 		System.out.println("Enter next value : ");
				 		int num = sc.nextInt();
				 		System.out.println("Enter the Value");
				 		int val = sc.nextInt();
				 		slist.addBeforeValue(val,num);
				 	}
				 
				 }
			 
	
		}while(ch != 0);

	}
}
