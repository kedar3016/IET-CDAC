#include<iostream>
#include <vector>
#include<string>
using namespace std;

class Student{
    int rollNo;
    string name;
    int marks[3];
    public:
    Student(){};
    Student(int rn,string nm,int m1,int m2,int m3){
        {
            rollNo = rn;
            name = nm;
           
                marks[0] = m1;
                marks[1] = m2;
                marks[2] = m3;
           
        }
    }
        void accept(){
                cout<<"\nEnter the Roll No : ";
                cin>>rollNo;
                cin.ignore();
                cout<<"\nEnter the Name of Student : ";
                getline(cin,name);
                for(int i = 0;i<3;i++){
                    cout<<"\nEnter "<<i+1<<" Subject Marks: ";
                    cin>>marks[i];
                }
            }
        

        void display(){
            cout<<"\n--------------Students Details--------------";
            cout<<"\nRoll No : "<<rollNo;
            cout<<"\nName Of the Student : "<<name;
            for(int i = 0;i<3;i++){
                cout<<"\nMark of the "<<i+1<<" Subject : "<<marks[i];
            }
            cout<<"\nToatal Marks : "<<getTotal();
            cout<<"\nAverage : "<<getAverage();
            cout<<"\n----------------------------------------------";
        }
        int getTotal(){
            return marks[0] +marks[1]+marks[2];
        }
        double getAverage(){
            return getTotal()/3;
        }
        Student operator++(int){
            for(int i = 0;i<3;i++){
                marks[i] = marks[i] +1;
            }
            return *this;
        }
        bool operator>(Student& s){
            return this->getAverage() >s.getAverage();
        }
    


};

class GradeBook{
    vector<Student> stud;
    public:
    void addStudent(Student& s){
        stud.push_back(s);
    }
    void display(){
        for(auto s : stud){
            s.display();
        }
    }
};

int main(){
    int n;
    
    GradeBook gb;

    cout<<"\nEnter the no. Of Student : ";
    cin>>n;
    Student s[n];
    for(int i = 0;i<n;i++){
        s[i].accept();
        gb.addStudent(s[i]);
    }
    gb.display();

    s[1]++;
    s[1].display();

    cout<<"\nGreater than \n";
    if(s[1]>s[2]){
        cout<<"\nS1 Marks are Max";
    }
    else{
        cout<<"\nS1 Marks is Max";
        
    }


}