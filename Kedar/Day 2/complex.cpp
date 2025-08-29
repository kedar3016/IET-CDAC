#include<iostream>
using namespace std;
class Complex{
    int real;
    int img;

    public:
    	Complex();
    	Complex(int,int);
        void accept();
        void display() const;
        int getReal() const;
        void setReal(int);
        int getImg() const;
        void setImg(int);
        
};

Complex::Complex(){
	real = 3;
	img = 5;
	cout<<"\n in No Argument Constructor";
}

Complex::Complex(int r,int i){
	real = r;
	img = i;
	cout<<"\n in Parameterized Constructor";
	
}

void Complex::accept(){
    cout<<"Enter the real and imganary number: ";
    cin>>real>>img;
    
}
void Complex::display() const{
	cout<<"\nThe complex number is: "<<real<<"+"<<img<<"i";
}

void Complex::setReal(int r){
	real = r;
}
int Complex::getReal() const
{
	return real;
}

void Complex::setImg(int i){
	img = i;
}
int Complex::getImg() const
{
	return img;
}

int main(){
    Complex c1(5,8);
    c1.display();
    c1.setReal(2);
    c1.getReal();
    c1.display();
    
    const Complex c2;
    c2.display();
    cout<<"\nReal No : "<<c2.getReal();
   
    cout<<"\nImg No: "<<c2.getImg();
    
}
