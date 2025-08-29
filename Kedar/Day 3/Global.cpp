#include<iostream>
using namespace std;
static int x; //Global Varible

void show(){
    
    cout<<"\nValue of x in show function "<<x;
    x++;
}

int main(){
    static int y  =  20;   //local varible;
    cout<<"\nGlobally declare variable x in Main Function: "<<x;
    x++;
    show();
    cout<<"\nAfter Show Function calling value of x "<<x;

}