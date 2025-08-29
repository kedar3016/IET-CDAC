#include<iostream>
using namespace std;
void swap(int p ,int q)
{
int temp;
temp=p;
p=q;
q=temp;
cout<<"\n after swapping in swap function \n:";
cout<<"p="<<p<<"\t"<<"q="<<q;
}
int main()
{
int a=20,b=40;
cout<<"before swapping \n";
cout<<"a="<<a<<"\t"<<"b="<<b;
swap(a,b);
cout<<"\nafter swapping in main function \n:";
cout<<"a="<<a<<"\t"<<"b="<<b;
}

