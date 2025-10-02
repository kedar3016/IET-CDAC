import java.util.Scanner;

class Factorial{


    public int fact(int num){
        if(num <= 0){
            return 1;
        }
        else{
            int f = 1;
            for(int  i= 1;i<=num;i++){
                f =f*i;
            }
            return f;
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : -");
        int num = sc.nextInt();
        Factorial fc = new Factorial();


        int res = fc.fact(num);
        System.out.println("Factorial : -" + res);

    }
}