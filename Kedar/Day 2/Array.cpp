#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"\nEnter the size of the array: ";
	cin>>n;
	
	int a[n];
	
	for(int i = 0;i<n;i++){
		cin>>a[i];
	}
	cout<<"\nThe Array Value are using Subscript Notation: ";
	for(int i = 0;i<n;i++){
	cout<<a[i]<<" ";
	}
	
	cout<<"\nusing Pointer Notataion";
	cout<<"\nEnter the values of Array: ";
		for(int i = 0;i<n;i++){
			cin>>*(a+i);
		}
		cout<<"\nThe Array Value are using Pointer: ";
		for(int i = 0;i<n;i++){
			cout<<*(a+i)<<" ";
		}
	
	
	
	
	
	return 0;
}
