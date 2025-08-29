#include<iostream>
using namespace std;
int main(){
	int r,c;
	cout<<"\nEnter the size of the 2D array: ";
	cin>>r>>c;
	int a[r][c];
	cout<<"\nEnter the "<<r*c<<" Element ";
	for(int i = 0;i<r;i++){
        for(int j = 0;j<c;j++){
		    cin>>a[i][j];
        }
	}
	cout<<"\nThe Array Value are using Subscript Notation: \n";
		for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
		     cout<<a[i][j]<<" ";
         }
         cout<<"\n";
	    }
	
	cout<<"\nusing Pointer Notataion";
    cout<<"\nEnter the "<<r*c<<" Element ";
	for(int i = 0;i<r;i++){
        for(int j = 0;j<c;j++){
		    cin>>*(*(a+i)+j);
        }
    }
	
	cout<<"\nThe Array Value are using Pointer: \n";
    for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
		     cout<<*(*(a+i)+j)<<" ";
         }
         cout<<"\n";
	    }

	
	return 0;

}
