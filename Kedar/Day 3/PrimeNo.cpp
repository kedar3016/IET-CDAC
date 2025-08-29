#include<iostream>
using namespace std;

int isPrime(int num){
        for(int i = 2;i<num-1;i++){
            if(num % i == 0){
                return 0;
            }
            else{
                return 1;
            }
        }
}

int main(){
    int n;
    cout<<"\nEnter the Number : ";
    cin>>n;
    int res = isPrime(n);
    if(res){
        cout<<"\n"<<n<<" is a prime Number ";
    }
    else{
        cout<<"\n"<<n<<" is Not a prime Number ";
    }
}