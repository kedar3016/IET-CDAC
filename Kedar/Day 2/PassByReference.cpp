#include<iostream>
using namespace std;


void swap(int& p,int& q)
{
    int temp = p;
    p = q;
    q = temp;
    cout<<"\nIn a Swap function\n";
    cout<<"p = "<<p<<"\t"<<"q = "<<q;
}
int main(){
    int a = 10,b = 20;
    cout<<"Before Swapping : \n";
    cout<<"a = "<<a<<"\t"<<"b = "<<b;
    swap(a,b);
    cout<<"\nAfter Swapping: \n";
    cout<<"a = "<<a<<"\t"<<"b = "<<b;

}

