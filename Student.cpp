#include<iostream>
#include <vector>
#include<fstream>
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
    int getrollNo(){
        return rollNo;
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
                    if(marks[i]<0 || marks[i]>100){
                        throw invalid_argument("Negative Marks and above 100 marks not Allowed!!!");
                    }
                }
                loadFile();
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
            if(this->getAverage() > s.getAverage()){
                return true;
            }
        }
        void loadFile(){
        
            fstream fout("gradebook.txt",ios::app);
            fout<<"\n--------------Students Details--------------";
            fout<<"\nRoll No : "<<rollNo;
            fout<<"\nName Of the Student : "<<name;
            for(int i = 0;i<3;i++){
                fout<<"\nMark of the "<<i+1<<" Subject : "<<marks[i];
            }
            fout<<"\nToatal Marks : "<<getTotal();
            fout<<"\nAverage : "<<getAverage();
            fout<<"\n----------------------------------------------";
        
        }
    


};

class GradeBook{
    vector<Student> stud;
    public:
    void addStudent(Student& s){
        for(auto &st : stud){
            if(st.getrollNo() == s.getrollNo()){
                throw runtime_error("\nDuplicate Roll no are not Allowed!!");
            }

        }
        stud.push_back(s);
        
    }
    void display(){
        if(stud.empty()){
            throw runtime_error("\nGrade Book is Empty!!!!!");
        }
        else{
        for(auto s : stud){
            s.display();
        }
        }
    }
};

int main(){
    int n;
    
    GradeBook gb;

    cout<<"\nEnter the no. Of Student : ";
    cin>>n;
    Student s1;
    Student s2;
        s1.accept();
        gb.addStudent(s1);
        s2.accept();
        gb.addStudent(s2);
    
    
    gb.display();
    s1.display();
    s2.display();

    cout<<"\nGreater than \n";
    s1++;


    // cout<<"\n\n > operator value :  ";
    if(s1>s2){
        cout<<"\nS1 Marks are Max";
    }
    else{
        cout<<"\nS2 Marks is Max";
        
    }
  

    


}