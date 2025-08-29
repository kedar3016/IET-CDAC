#include<iostream>
using namespace std;

// void accept(int a[3][3]){
//      for(int i = 0;i<3;i++){
//         for(int j=0;j<3;j++){
//             cin>>a[i][j];
//         }

//          }    
//     }

int main(){
    int a[3][3];
    int b[3][3];


    
    cout<<"\nEnter the 1st Matrix : ";
    for(int i = 0;i<3;i++){
        for(int j=0;j<3;j++){
            cin>>a[i][j];
        }
    }
    
    
    for(int i = 0;i<3;i++){
        for(int j=0;j<3;j++){
            b[i][j] = a[j][i];
        }
    }

    cout<<"\nEnter the Transpose Matrix : ";
    for(int i = 0;i<3;i++){
        for(int j=0;j<3;j++){
            cout << b [i][j]<<" ";
        }
        cout<<"\n";
    }



}