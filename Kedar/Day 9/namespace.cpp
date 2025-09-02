#include<iostream>
using namespace std;
namespace add{
     void cal(int a, int b){
        cout<<"\nAddition is :"<<a+b;
     }
}
namespace mul{
    void cal(int a, int b){
        cout<<"\nMultiplication is :"<< a*b;
    }
}

int main(){
    int a, b;
    cout<<"\nEnter two numbers: ";
    cin>>a>>b;
    add::cal(a,b);
    mul::cal(a,b);
    
}