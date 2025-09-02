#include <iostream> 
using namespace std; 
  
int main() 
{ 
    int a = 10; 
    int b = 20; 
   
    typedef int* Pointer; 
  
    Pointer ptr_a = &a; 
    Pointer ptr_b = &b; 
  
    cout << "a is: " << *ptr_a << "\n"; 
    cout << "b is: " << *ptr_b << "\n"; 
  
}