#include<iostream>
using namespace std;
int main()
{
int n,i;
cout<<"\nEnter the number of elements:\n";
cin>>n;
int* ptr= new int[n];
cout<<"\nAccepting elements:\n";
for(i=0;i<n;i++)
{
    cin>>*(ptr+i);
}
for(i=0;i<n;i++)
{
    cout<<*(ptr+i)<<" ";
}

}