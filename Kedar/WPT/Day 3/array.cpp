#include<iostream>
using namespace std;
int main(){

    int n;
    cout<<"Enter the size of the array :";
    cin>>n;
    int arr[n];
    for(int i = 0;i<n;i++){
        arr[i] = 0;
    }
    int cnt = 1;
    for(int i = 0;i<n;i++){
        if(cnt % 2 == 0 && arr[i] == 0){
            cin>>arr[i];
            cnt++;
        }
        else{
            if(arr[i] == 0){
                for(int j=i;j>0;j--)
                {
                    arr[j] ==arr[j-1];
                }
                cin>>arr[0];
                cnt++;
            }
        }

    }
    for(int i = 0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}