#include<iostream>
using namespace std;

class demo{
    private:
    int pvt ;
    protected:
    int prot;

    public:
    demo(){
        pvt = 10;
        prot = 20;
    }
    friend class demo1;
};

class demo1{
    public:
    void display(demo &t){
        cout<<"\nPrivate value is : "<<t.pvt;
        cout<<"\nProtected value is : "<<t.prot;
    }

};


int main(){
    demo d;
    demo1 d1;
    d1.display(d);
}
