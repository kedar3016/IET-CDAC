#include<iostream>
using namespace std;


class Demo{
    public:
    Demo(){
        cout<<"\nConstructor was Called!";
    }
    ~Demo(){
        cout<<"\nDestructor was Called";
    }

};

int main(){
    cout<<"\nObject created by using new keyword";
    Demo* ptr = new Demo(); // when new keyword uses then the constructor will be called!!!
    
    delete ptr; //when delete keyword uses then destructor will be callled

    cout<<"\nObject created by using malloc";
    Demo* ptr1 = (Demo*)malloc(sizeof(Demo));
    
    free(ptr);



}