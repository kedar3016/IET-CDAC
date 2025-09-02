#include<iostream>
using namespace std;
class A
{ int a;
    public:
    A(){
        cout<<"\nin A's constructor";
    }
    A(int i){
        a=i;
        cout<<"\nin A's para constructor";
    }


    
};
class B :virtual public A{
int b;
    public:
    B(){
        cout<<"\nin B's constructor";
    }
    B(int i):A(i){
        b=i;
        cout<<"\nin B's para constructor";
    }

};

class C :virtual  public A{
int c;
    public:
    C(){
        cout<<"\nin C's constructor";
    }
    C(int i):A(i){
        c=i;
        cout<<"\nin C's para constructor";
    }

};

class D : public B,public C{
int d;
    public:
    D(){
        cout<<"\nin D's constructor";
    }
    D(int i):A(i),B(i),C(i){
        d=i;
        cout<<"\nin D's para constructor";
    }

};

int main(){
    D d1(10);

}