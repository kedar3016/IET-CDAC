#include<iostream>
using namespace std;
class circle{
public:
int radius;
circle();
circle(int);
};

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
    float area= float(3.14 * c1.radius *c1.radius);
    cout<<area;

}