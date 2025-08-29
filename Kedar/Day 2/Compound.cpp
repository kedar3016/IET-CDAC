#include<iostream>
#include<cmath>
using namespace std;

int main(){
    int p,r,t;
    float amount;
    cout<<"\nEnter the Principle Amount: ";
    cin>>p;
    cout<<"\nEnter the Intrest rate : ";
    cin>>r;
    cout<<"\nEnter the Time period: ";
    cin>>t;
    
    
     
    amount = p * ((pow((1 + r / 100), t)));

    cout<<"\nCompound Interset is : "<<amount;

    return 0;
}
