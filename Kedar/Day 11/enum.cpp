#include<iostream>
using namespace std;

enum days{
    sunday=1,monday,tuesday,wednesday,thursday,friday,saturday
};

int main(){

    enum days d;

    d = monday;
    cout<<d;

    for(int  i = sunday;i<saturday;i++){
        cout<<i<<" ";
    }


    return 0;
}