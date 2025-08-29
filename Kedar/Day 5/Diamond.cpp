#include<iostream>
using namespace std;

class A{
    public:
    A();
};
A::A(){
    cout<<"\nClass A";
}
class B:public A{
    public:
    B();
};
B::B(){
    cout<<"\nClass B";
}
class c:public A{
    public:
    c();
};
c::c(){
    cout<<"\nClass C";
}
class d:public B,public c{
    public:
    d();
};

d::d(){
    cout<<"\nClass D";
}


int main(){

    d obj;

    return 0;
}