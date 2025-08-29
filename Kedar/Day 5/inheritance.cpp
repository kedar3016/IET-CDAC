#include <iostream> 
using namespace std; 
  
class Base { 
private: 
    int pvt = 1; 
protected: 
    int prot = 2; 
public: 
    int pub = 3; 
  
    
    int getPVT() { return pvt; } 
}; 
  
class Derived : public Base { 
public: 
    
    int getProt() { return prot; } 
}; 
  
int main() 
{ 
    Derived object1; 
    cout <<"\nPrivate = " << object1.getPVT() <<endl; 
    cout << "\nProtected = " << object1.getProt() << endl; 
    cout << "\nPublic = " << object1.pub << endl; 
//cout << "Public = " << object1.prot<< endl; //error

    return 0; 
}