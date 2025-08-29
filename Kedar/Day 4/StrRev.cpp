#include<iostream>
#include <cstring>
using namespace std;
int main(){

    string str1=" ";
    
    cout<<"\nEnter the String: ";
    getline(cin,str1);

    string str2 = "";
    
    for(int i = str1.length()-1;i>=0;i--){

        str2 = str2 + str1[i];

    }

    cout<<"\nThe Reverse String Is: "<<str2;
}