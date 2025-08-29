#include<iostream>
using namespace std;

class Cdate{
    int dd,mm,yy;

    public:
    	Cdate();
    	Cdate(int,int,int);
    void accept();
    void display() const;
    void setDate(int);
    int getDate() const;
    void setMonth(int);
    int getMonth() const;
    void setYear(int);
    int getYear() const;
    
};

Cdate::Cdate()
{
	dd = 5;
	mm = 10;
	yy = 2026;
	cout<<"\n in No Argument Constructor";
	
}
Cdate::Cdate(int d,int m,int y)
{
	dd = d;
	mm = m;
	yy = y;
	cout<<"\n in Parameterized Constructor";
}

void Cdate::accept(){
    cout<<"\nEnter the date month and year: ";
    cin>>dd>>mm>>yy;
}
void Cdate::display() const
{
	cout<<"\nThe Date is :  "<<dd<<"/"<<mm<<"/"<<yy;
}
void Cdate::setDate(int d){
	dd = d;
}
int Cdate::getDate() const{
	return dd;
}

void Cdate::setMonth(int m){
	mm = m;
}
int Cdate::getMonth() const{
	return mm;
}
void Cdate::setYear(int y){
	yy = y;
}
int Cdate::getYear() const{
	return yy;
}

int main(){

    const Cdate d1;
//    d1.accept();
    d1.display();
    
//    d1.setDate(12);
    cout<<"\n Date is : "<<d1.getDate();
    
//    d1.setMonth(5);
    cout<<"\n Month is : "<<d1.getMonth();
	
//	d1.setYear(2025);
	cout<<"\n Year is : "<<d1.getYear();
	
	Cdate d2(10,5,2025);
	d2.display();
	    
    
}
