#include<iostream>
using namespace std;

static int x = 20;
void demo(){
    int a = x;
    x= 0;
    int y =2;
    cout<<"\nStatic Variable Value in demo Function: "<<a;
    x++;
    y++;
}

int main(){
    static int y = 10;
    cout<<"\nStatic Variable value in main :- "<<x;
    x++;
    demo();
    cout<<"\nAfter the demo function value of x in Main function: "<<x;

    cout<<"\n\nGlobal Variable : "<<y;
}