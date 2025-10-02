import java.util.Scanner;

class Max3Number{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Num : - ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second Num : - ");
        int n2 = sc.nextInt();
	    System.out.println("Enter the Third Num : - ");
        int n3 = sc.nextInt();
        if(n1 == n2 && n2 == n3){
            System.out.println("Number Are Equals !!");
        }
        else{
            if(n1>n2 && n1>n3){
                
                System.out.println("First Number is Max!");
            }
            else if(n2>n1 && n2>n3){
                
                System.out.println("Second Number is Max!");
            }
            else{
                System.out.println("Third Number is Max!");
    
            }
        }
        
        

        
    }
}