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
    int c[3][3];
        int i,j, sum = 0;

    
    cout<<"\nEnter the 1st Matrix : ";
    for(int i = 0;i<3;i++){
        for(int j=0;j<3;j++){
            cin>>a[i][j];
        }
    }
    
    cout<<"\nEnter the 2nd Matrix : ";
    for(int i = 0;i<3;i++){
        for(int j=0;j<3;j++){
            cin>>b[i][j];
        }
    }
    
    for( i = 0;i<3;i++){
       
        for(j=0;j<3;j++){
            c[i][j] = 0;
            for(int k = 0;k<3;k++){
                c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
         
        }
        
        
    }

       cout<<"\nMultiplication Of Two matrix is : \n";
    for(int i = 0;i<3;i++){
        for(int j=0;j<3;j++){
            cout << c [i][j]<<" ";
        }
        cout<<"\n";
    }

  



}