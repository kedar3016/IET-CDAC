#include<iostream>
using namespace std;

class temp{
int a ;

public:
     temp();
    temp add(temp&);
    void show();

};
temp::temp(){
    a =10;
}

temp temp::add(temp& b1){
    temp obj3;
    obj3.a = this->a + b1.a;
    return obj3;
}

void temp :: show(){

    cout<<"Value of a is "<<a;
}


int main()
{
    temp obj1;
    temp obj2;
    temp obj4 = obj1.add(obj2);
    obj4.show();
    


}