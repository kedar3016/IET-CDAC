#include<iostream>
using namespace std;
class complex
{
    int real, img;
    public:
    complex();
    complex(int , int);
    void display();
};

void complex :: display()
{
cout<<"\ncomplex number is "<<real<<"+"<<img<<"i";
}

complex:: complex()
{
    this->real=2;
    this->img=3;
}

complex :: complex (int real, int img)
{
    this->real=real;
    this->img=img;
}

int main()
{
    complex c1;
    c1.display();
    complex c2(1,2);
    c2.display();
}