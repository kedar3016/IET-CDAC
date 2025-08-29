#include<iostream>
using namespace std;

class shape{
    public:
    shape();
    virtual int area() = 0;
    virtual int display() = 0;
};
shape::shape(){

    cout<<"\nin a shape class";
}

class circle:public shape{
    int r;
    public:
    circle();
    circle(int);
    int area(int);
};

circle::circle(){
    r= 5;
}
circle::circle(int r){
    r = r;
}
int circle::area(){
    return 3.14*r*r;
}

int main(){

}