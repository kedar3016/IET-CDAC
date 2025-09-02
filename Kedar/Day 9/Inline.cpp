#include<iostream>
using namespace std;

inline int cube(int n){ return n*n*n;}

int main(){
    int a;
    cout<<"\nEnter the Number: ";
    cin>>a;
    cout<<"\nCube is: "<<cube(a);
}