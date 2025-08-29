#include<iostream>
using namespace std;

class complex{
    int real,img;
    public:
    complex();
    complex(int,int);
    void display();
    complex operator+(complex);
    complex operator-(complex);
    complex operator++();
    complex operator++(int);
    complex operator-();
};

complex::complex(){
    real = 3;
    img = 4;
}
complex::complex(int r,int i){
    real= r;
    img = i;
}
void complex::display(){
    if(img>0)
    cout<<"\nThe Complex Number is :- "<<real<<" + "<<img<<"i";
    else
    cout<<"\nThe Complex Number is :- "<<real<<""<<img<<"i";
}

complex complex::operator+(complex c){

    complex temp;
    temp.real = this->real+c.real;
    temp.img = this->img+c.img;
    return temp;
}
complex complex::operator-(complex c){

    complex temp;
    temp.real = this->real-c.real;
    temp.img = this->img-c.img;
    return temp;
}
complex complex::operator++(){

    complex temp = *this;
    this->real = this->real + 1;
    this->img = this->img +1;
    return *this;

}
complex complex::operator-(){

    complex temp;
     temp.real = -this->real;
    temp.img = -this->img;
    return temp;
}

complex complex::operator++(int){

    complex temp = *this;
    this->real = this->real + 1;
    this->img = this->img +1;
    return temp;

}


int main(){

    complex c1;
    c1.display();

    complex c2(4,5);
    c2.display();
    cout<<"\n\nAddition: ";
    complex c3 = c1 + c2;
    c3.display();

    complex c4 = c1 -c2;
    cout<<"\n\nSubstraction : ";
    c4.display();

    cout<<"\n\nPre Increment: ";

    complex c5 = ++c1;
    c1.display();
    c5.display();
    cout<<"\n\nPost Icreament: ";
    complex c7 = c2++;
    c7.display();
    c2.display();
    
    cout<<"\n\nAssign Negative sign : ";
    complex c6 = -c2;
    c2.display();
    c6.display();
    return 0;
}