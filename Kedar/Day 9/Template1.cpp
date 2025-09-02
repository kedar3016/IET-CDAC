#include <iostream>  
using namespace std;  
template<class X> 
void fun(X a,X b)  
{ 
	cout<<"execute1";
    std::cout << "\nValue of a is : " <<a<< std::endl;  
}  
template<class X,class Y> 
void fun(X b ,Y c)  
{  
    cout<<"execute2";
    std::cout << "\nValue of b is : " <<b<< std::endl;  
    std::cout << "Value of c is : " <<c<< std::endl;  
} 
template<class X,class Y,class Z> 
void fun(X b ,Y c,Z d)  
{  
    std::cout << "Value of b is : " <<b<< std::endl;  
    std::cout << "Value of c is : " <<c<< std::endl;
	std::cout << "Value of c is : " <<d<< std::endl;  
}   
int main()  
{  
   fun(10,12);  
   fun(20,30.5);
   fun(10,10,10);  
   return 0;  
}