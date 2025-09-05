#include<iostream>
#include <algorithm>
using namespace std;
int main(){
    string str,rev;
    cout<<"\nEnter the string : ";
    getline(cin,str);
    rev = str;
    reverse(rev.begin(), rev.end());
    if(str == rev){
        cout<<"\nString is Palindrome!!";
    }
    else{
        cout<<"\nString is Not a Palindrome!!";
    }
}