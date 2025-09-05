#include<iostream>
#include<string.h>
using namespace std;
int main(){
    string str,str1;
    cout<<"\nEnter the String 1 : ";
    getline(cin,str);
    cout<<"\nEnter the String 2 : ";
    getline(cin,str1);
    int x = str.compare(str1);

    if(x==1)
   cout<<"string 1 is greater than string2\n";
   if(x==-1)
   cout<<"string 2 is greater than string1\n";
    if(x==0)
   cout<<"string 1 is equal to string2\n";


    cout<<str;
}