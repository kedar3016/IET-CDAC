#include<iostream>
using namespace std;
int main(){
    int a,n;
    cout<<"\nEnter the number: ";
    cin>>a;
    cout<<"\nEnter the power";
    cin>>n;
    int pow =1;
    for(int i = 0;i<n;i++){
        pow = pow*a;
    }
    cout<<"\nThe Power of "<<a<<" is "<<pow;


    
}