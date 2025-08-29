#include<iostream>
using namespace std;
int main(){
    int a[40][40];
    int n;
    cout<<"\nEnter No of Lines: ";
    cin>>n;

    for(int i = 0;i<n;i++){
        for(int j = 0;j<n-i-1;j++){
            cout<<" ";
        }
        for(int j = 0;j<=i;j++){
            if(j == 0 || j==i){
                a[i][j] = 1;
            }
            else{
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
            cout<<a[i][j]<<" ";
        }
        cout<<"\n";
    }
}
