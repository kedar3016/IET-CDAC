#include<iostream>
using namespace std;

class Employee{

    int id;

    public:
    Employee();
    Employee(int);
    virtual int CalculateSal();
    virtual void display();

};

Employee::Employee(){
    id = 0;
    cout<<"\ndefault Constructor in  Base Class";
}
Employee::Employee(int i){
    id = i;
    cout<<"\nPara Constructor in  Base Class";
}
int Employee::CalculateSal()
{
    return 0;
}
void Employee::display(){
    cout<<"\nId Of the Employee is "<<id;
}


class WageEmployee:public Employee{

    int hrs,rate;

    public:
    WageEmployee();
    WageEmployee(int,int,int);
    int CalculateSal();
    void display();

};

WageEmployee::WageEmployee(){
    hrs = 2;
    rate = 1000;
    cout<<"\ndefault Constructor in  WageEmployee Class";
}
WageEmployee::WageEmployee(int i1,int hr,int r):Employee(i1){
    hrs = hr;
    rate = r;
    cout<<"\npara Constructor in  WageEmployee Class";
}
int WageEmployee::CalculateSal()
{
    return hrs*rate;
}
void WageEmployee::display(){
    Employee::display();
    cout<<"\nhrs Of the Employee is "<<hrs;
    cout<<"\nRate Of the Employee is "<<rate;
    cout<<"\nSalary of the Wage Employee is "<<CalculateSal();
}

class SalesPerson:public WageEmployee{

    int sales,comm;

    public:
    SalesPerson();
    SalesPerson(int,int,int,int,int);
    int CalculateSal();
    void display();

};

SalesPerson::SalesPerson(){
    sales = 10;
    comm = 8000;
    cout<<"\ndefault Constructor in  SalesPerson Class";
}
SalesPerson::SalesPerson(int i1,int hr,int r,int s,int com):WageEmployee(i1,hr,r){
    sales = s;
    comm = com;
    cout<<"\npara Constructor in  SalesPerson Class";
}
int SalesPerson::CalculateSal()
{
    return WageEmployee::CalculateSal() + sales*comm;
}
void SalesPerson::display(){
    WageEmployee::display();
    cout<<"\nsales Of the Employee is "<<sales;
    cout<<"\ncommision Of the Employee is "<<comm;
    cout<<"\nSalary Of the Sales Person is "<<CalculateSal();
}



int main(){

    Employee *ptr;
    SalesPerson s1(1,5,500,50,10000);
    ptr = &s1;
    ptr->CalculateSal();
    ptr->display();
    return 0;
}