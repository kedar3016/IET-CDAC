#include<iostream>
using namespace std;
class circle{
protected:
int radius;
public:
circle();
circle(int);
float area();
};

float circle::area(){
    float area= float(3.14 * radius *radius);
    return area;
}

circle::circle()
{
    radius=10;
}

circle::circle(int r)
{
    radius=r;
}

int main(){
    circle c1(8);
    cout<<c1.area();

}