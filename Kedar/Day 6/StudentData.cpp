//  Write a student class and use it in your program. Store the data of 10 students and display
//  the sorted data according to their roll numbers, dates of birth, and total marks.

#include<iostream>
using namespace std;

class Student{

    public:
    int rollNo;
    int dd,mm,yy;
    int totalMarks;
   
    
    void accept();
    void display();
    Student()
    {
        rollNo=0;
        dd=mm=yy=0;
        totalMarks=0;
    }

};


void Student::accept()
{
    cout<<"Enter the roll no\n";
    cin>>rollNo;
    cout<<"Enter the Birth Date\n";
    cin>>dd>>mm>>yy;
    cout<<"Enter the total marks\n";
    cin>>totalMarks;
}

void Student:: display()
{
    
    cout<<" \nThe roll no is printing is\n"<<rollNo;
    
    cout<<"\nThe Birth Date\n"<<dd<<mm<<yy;
    
    cout<<"\nThe total marks\n"<<totalMarks;

    
    
}

int main()
{
    Student *s=new Student[10];
    for(int i=0;i<3;i++)
    {

        s[i].accept();
    }

    for (int i = 0; i < 2; i++) {
    for (int j = i + 1; j < 3; j++) {
        if (s[i].rollNo > s[j].rollNo) {
            Student temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}

for (int i = 0; i < 3; i++) {
    s[i].display();
}
    return 0;
}