#include<stdio.h>
float area(int);
float area(int r)
{float area;
area=3.14f*r*r;

return area;
}

int main()
{
    float a;
int r;
printf("enter radius for required circle");
scanf("%d",&r);
a=area(r);
printf("Area of circle is %f",a);
}

