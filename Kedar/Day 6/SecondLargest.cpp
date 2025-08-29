#include<iostream>
using namespace std;
void accept(int arr[],int n){
    cout<<"\nEnter the Elements:-";
    for(int i=0;i<n;i++){
            cin>>arr[i];
    }
}
void display(int arr[],int n){
    cout<<"\nElements of array is:-";
    for(int i=0;i<n;i++){
            cout<<arr[i]<<" ";
    }
}

int sec_large(int a[],int n){
    int max=a[0];
    int sec=-1;
    for(int i= 1;i<n;i++){
        if(a[i]>max){
            sec=max;
            max=a[i];
        }

    }
    for(int i =0;i<n;i++){
        if(a[i]< max && a[i]>sec){
            sec=a[i];
        }
    }
    return sec;
}

int third_lar(int arr[],int n){
    int sec = sec_large(arr,n);
    int third =-1;
    for(int i =0;i<n;i++){
        if(arr[i]< sec && arr[i]>third){
            third=arr[i];
        }
    }
    return third;


}

int main(){
    int n;
    cout<<"\n Enter the Length of the Array:";
    cin>>n;
    int arr[n];
    accept(arr,n);
    display(arr,n);
    cout<<"\n The secound largest element is:  "<<sec_large(arr,n);
    cout<<"\n The third largest element is  :"<<third_lar(arr,n);

}
