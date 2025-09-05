#include<iostream>
using namespace std;
int main(){
    int* ptr,n;
    
    // ptr = (int*)malloc(sizeof(int)); //Dynamic memory allocation to integer
    cout<<"\nEnter the Size of the array: ";
    cin>>n;
    ptr = (int*)malloc(n*sizeof(int));
     cout<<"\nEnter the No. ";
     for(int i = 0;i<n;i++){
        cin>>ptr[i];
     }
     cout<<"\nArray Element are : ";
     for(int i  = 0;i<n;i++){
        cout<<ptr[i]<<" ";
     }
     
   //  cout<<"The Entered Number is : "<<*ptr;
}