#include<iostream>
using namespace std;

class A{
    int pvt = 10;
    protected:
    int prot = 20;

    friend class B;
};

class B{
    
    public:
    void add(A& a){
        cout<<"\nAddition of pvt and protected varible is  "<<a.pvt+a.prot;
    }

};

int main(){
    A a;
    B b;
    b.add(a);

}