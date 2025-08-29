#include<iostream>
using namespace std;

void  fibo(int n){
    int x1 = 0,x2 = 1,x3 = 0,i=0;

    cout<<"fibo Series : 0 1 ";
    while(i<n-2){
        x3 = x1 + x2;
        cout<<x3<<" ";
        x1 = x2;
        x2 =x3;
        i++;
    }
}

int main(){
    int n;
    cout<<"\nEnter the No of Element want to display: ";
    cin>>n;
    fibo(n);
}