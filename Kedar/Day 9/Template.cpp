#include<iostream>
using namespace std;

template<class T,class Y>
    T add(T a,Y b){
        return a+b;
    }



int main(){
    int a = 10,b=20;
    float i = 4.5,j = 2.5;
    cout<<"Addition of a and b is :"<<add(a,b); 
    cout<<"\nAddition of i and j is :"<<add(i,j); 
    char ch = 'A',ch1='B';
    cout<<"Addition of "<<ch<<" and "<<ch1<<" is :"<<add(ch,ch1); 

    return 0;
}