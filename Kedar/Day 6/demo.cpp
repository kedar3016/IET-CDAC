
//  Write a student class and use it in your program. Store the data of 10 students and display
//  the sorted data according to their roll numbers, dates of birth, and total marks.
#include <iostream>
using namespace std;

class student{
     public:
    int roll_no;
    string date_of_birth;
    int total_marks;
   
    student();
    student(int,string,int);
    int getRoll();
    void accept();
    void display(student);
    // void sortobj(student[],int);

};

student::student(){
    roll_no=0;
    date_of_birth='0';
    total_marks=0;
}

student::student(int r, string dob, int m){
    roll_no=r;
    date_of_birth=dob;
    total_marks=m;
}

int student::getRoll(){
    return roll_no;
}
void student::accept(){
    cout<<"\nEnter the roll no : ";
    cin>>roll_no;
    cout<<"\nEnter the DOB : ";
    cin>>date_of_birth;
    cout<<"\nEnter Total Marks : ";
    cin>>total_marks;
}

void student:: display(student s ){
    cout<<"\n Roll No : "<<s.roll_no;
    cout<<"\n Date of Birth : "<<s.date_of_birth;
    cout<<"\n Total Marks : "<<s.total_marks;
}
// void student::sortobj(int a[],int n){
//     student temp;
//     for(int i = 0;i<n;i++){
//         if(s[i].roll_no > s[i+1].roll_no){
//             temp = s[i];
//             s[i] =s[i+1];
//             s[i+1] = temp;

//         }

//     }
    
// }

int main(){
    int n = 4;
    student s1[n];
    student temp;

    for (int i=0;i<n;i++){
        cout<<"\n Enter data for student "<<i+1;
        s1[i].accept();
       
    }

    for(int i= 0;i<n;i++){
        if(s1[i].roll_no>s1[i+1].roll_no)
        {
            temp = s1[i];
            s1[i] =s1[i+1];
            s1[i+1] = temp;
        }
    }

    for (int i=0;i<n;i++){
            s1[i].display(s1[i]);
        }
    }
    


