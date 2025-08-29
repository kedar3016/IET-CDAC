#include<iostream>
using namespace std;

int fact(int n){
    int fact = 1;
    for(int i = n ;i>0;i--)
    {
        fact = fact * i;
    }
    return fact;
}

int main(){
    int n;
    cout<<"\nEnter the Number : ";
    cin>>n;
    int ans = fact(n);
    cout<<"\nFactorial of "<<n <<" is = "<<ans;
}