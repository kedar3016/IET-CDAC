#include<iostream>
#define MAX(a,b) (a>b)?a:b

using namespace std;
int main(){
    int a = 10,b =20;
    int max = MAX(a,b);

    cout<<"\nThe max Element is : "<<max;
    
}