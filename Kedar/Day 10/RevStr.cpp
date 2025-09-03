#include<iostream>
#include<string.h>
using namespace std;
int main(){

    int i = 0;
    string str = "ABBA";
    string cpy;
    cpy = str; 

    int st = 0;
    int end = str.length()-1;

    while(st<end){  
        char temp = cpy[end];
        cpy[end]= cpy[st]; 
        cpy[st] = temp; 
        st++; 
        end--; 
    }
    if(str == cpy)
    {
        cout<<"\nPalindrome";
    }


    
    cout<<"str  : "<<str<<endl;
    cout<<"Copy   : "<<cpy<<endl;
    //cout<<rev;
    

}