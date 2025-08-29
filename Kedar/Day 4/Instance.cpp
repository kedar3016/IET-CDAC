#include<iostream>
#include <cstring>
using namespace std;

class College{
    char stud_name[10];
    int rollno;
    static char clg_name[20];

    public:
        College();
        College(char*,int);
        void display();


    };

College::College(){
    strcpy(stud_name,"Rohan");
    rollno = 101;
    strcpy(clg_name ,"IETPune");
}

College::College(char *st,int rn){
    strcpy(stud_name,st);
    rollno = rn;
    strcpy(clg_name ,"IET Pune");
}

 void College::display(){
    cout<<"\nStudent Name: "<<stud_name;
    cout<<"\nRoll No:"<<rollno;
    cout<<"\nCollege Name: "<<clg_name;
}

static char clg_name[20];
int main(){

    College c1;
    c1.display();
}