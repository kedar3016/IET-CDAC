//  Write different C++ programs to
//   Print Hello World
//   Add two numbers/binary numbers/characters
//   Calculate compound interest
//   Calculate power of a number
//   Swap two numbers
//   Calculate area of rectangle

#include<iostream>
using namespace std;
int main(){
    // int a = 10,b = 20;
    // int c = a + b;
    // cout<<"Addition of "<<a<<" and "<<b<<" is "<<c;

    // char C = 'A' + 'B';
    // cout<<"\nCharcter Addition is: "<<C;

    
    string a1 = "0010";
    string b1 = "0100";
    char res[4] = {'0','0','0','0'};

    cout<<"Binary "<<a1[2];
    for(int i = 0;i<'\0';i++){
        if(a1[i] == 0 && b1[i] == 0){
            res[i] = 0;
        }
        else if(a1[i] == 0 && b1[i]==1 )
        {
            res[i] = 1;
        }
        else if(a1[i] == 1 && b1[i]==0  ){
            res[i] = 1;
        }
        else if(a1[i] == 1 && b1[i] == 1){
            res[i] = 1;
        }
    }

    for(int i = 0;i<4;i++){
        cout<<res[i];
    }
  
    
}