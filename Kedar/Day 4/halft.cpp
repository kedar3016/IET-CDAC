#include<iostream>
using namespace std;
int main(){
    int n,c;
    cout<<"enter numbers of rows";
    cin>>n;
    // for(int i =1;i<=n;i++){
    //     for (int j =1;j<=i;j++)
    //     {
    //         cout<<i<<" ";
    //     }
    //     cout<<"\n";
    // }
    // int cnt = 1;
    
    // for(int i =1;i<=n;i++){
    //     for (int j =1;j<=i;j++)
    //     {
    //         cout<<cnt<<" ";
    //         cnt++;
    //     }
    //     cout<<"\n";
    // }

// char var = 'A';
//     for(int i =1;i<=n;i++){
            
//         for (int j =1;j<=i;j++)
//         {
//             cout<<var<<" ";
//         }
//         var++;
//         cout<<"\n";
//     }
char var = 'A';
 for(int i =1;i<=n;i++){
        for (int j =1;j<=i;j++)
        {
            cout<<var<<" ";
            var++;
        }
        cout<<"\n";
    }

}