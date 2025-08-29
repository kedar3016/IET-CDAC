#include<iostream>
#include<cmath>
using namespace std;


int armstrong(int n){
    
    int num = n; //153
    
    int ans = 0; //0
    int cnt = 0; //0

    while(num != 0){ //0  153
        cnt++;       //3
        num = num/10;  // 0
    }
    cout<<"\nCount : "<<cnt;
    num =n; //153

    while(num != 0){ //153
        int rem = num%10; //1
        ans = ans + pow(rem,cnt);//125+27 = 152 
        num = num/10; //1
        cout<<"\nRem : = "<<rem;
        cout<<"\nNum := "<<num;

    }
    
    cout<<"\nAnwser"<<ans;
    if( n == ans){
        return 1;
    }
    else{
        return 0;
    }
}

int main(){
    int num;
    cout<<"\nEnter the Number: ";
    cin>>num;
    int res = armstrong(num);
    cout<<"\nResult  "<<res;
    if(res){
        cout<<"\n"<<num<<" is a Armstrong Number";
    }       
    else{
        cout<<"\n"<<num<<" is  not a Armstrong Number";
    }
}
