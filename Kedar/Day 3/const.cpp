#include<iostream>
#include<string.h>
using namespace std;

class Student{
    
    int rollno = 0;
    char name[10];

    public:
    Student();
    Student(int,char*);
};


Student::Student() const{
    rollno = 10;
    strcpy(name,"Kedar");
}
Student::Student(int r,char* n){
    rollno = r;
    strcpy(name,n);
}

int main(){
    Student s1;
    // cout<<"\nStudent Roll no is "<<s1.rollno<<" and name of the Student is "<<s1.name;

}