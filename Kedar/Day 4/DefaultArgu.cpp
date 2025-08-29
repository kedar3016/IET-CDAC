#include<iostream>
using namespace std;

void add(int= 2,int=3);

int main(){
    add(5,2);
    return 0;
}
void add(int a,int b){
    int c = a+b;
    cout<<"c = "<<c;
}