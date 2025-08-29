#include<iostream>
using namespace std;


class a{
    int A;
    public:
    a();
    a(int);
    
};

a::a(){
    A = 10;
    cout<<"\nIn a Default construct of Parent class A";
}
a::a(int n){
    A = n;
    cout<<"\nIn a Para construct of Parent class A";
}

class  b{
    int B;
    public:
    b();
    b(int);
    
};

b::b(){
    B = 10;
    cout<<"\nIn a Default construct of Parent class B";
}
b::b(int n){
    B = n;
    cout<<"\nIn a Para construct of Parent class B";
}


class c:public a,public b{
    int C;
    public:
    c();
    c(int);
};

c::c(){
    C = 10;
    cout<<"\nIn a Default construct of Child class C";
}
c::c(int n){
    C = n;
    cout<<"\nIn a Para construct of Child class C";
}

int main(){

    c obj;
    
}