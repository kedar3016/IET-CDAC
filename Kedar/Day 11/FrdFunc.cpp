#include<iostream>
using namespace std;
class demo{
    private:
    int a = 10;
    friend void add(demo&);
    protected:
    int b = 40;


};

void add(demo& a){
    cout<<"\nAddition pvt and protected : "<<a.a + a.b;
}

int main(){

    demo  d;
    add(d);

}