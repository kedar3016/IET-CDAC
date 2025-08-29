#include<iostream>
using namespace std;
int main(){
    int n,p,ans =1;
    cout<<"\nEnter the Number: ";
    cin>>n;
    cout<<"\nEnter the Power of the Number: ";
    cin>>p;
    for(int i = 0;i<p;i++){
         ans = ans * n;
    }
    cout<<"\nPower Of the Number :- "<<ans;
}