#include<iostream>
using namespace std;
class complex{
    int real;
    int img;
    public:
    complex(){
        real = 3;
        img = 4;
    }
    complex(int r,int i){
        real = r;
        img = i;
    }
    void accept(){
        cout<<"\nEnter the complex number (real & Img no): ";
        cin>>real>>img;
    }
    void display(){
        if(img<0){
            cout<<"\nComplex No : "<<real<<" "<<img<<"i";
        }
        else{

        cout<<"\nComplex No : "<<real<<" + "<<img<<"i";
        }
    }

    complex operator++(){
        this->real++;
        this->img++;
        return *this;
    }
    complex operator++(int){
        complex temp = *this;
        this->real++;
        this->img++;
        return temp;
    }

    complex operator--(){
        this->real--;
        this->img--;
        return *this;
    }
    complex operator--(int){
        complex temp = *this;
        this->real--;
        this->img--;
        return temp;

    }
    complex operator+(complex& c){
        complex temp;
        temp.real =this->real + c.real;
        temp.img=this->img + c.img;
        return temp;
    }
    complex operator-(complex& c){
        complex temp;
        temp.real =this->real - c.real;
        temp.img=this->img - c.img;
        return temp;
    }
    
    

};



int main(){
    int ch;
    complex c1,c2,c3;
    do{

        cout<<"\n1: PreIncrement";
        cout<<"\n2: PostIncrement";
        cout<<"\n3: PreDecrement";
        cout<<"\n4: PostDecrement";
        cout<<"\n5: Addition";
        cout<<"\n6: Substraction";
        cout<<"\n0: Exit";
        cout<<"\n\nEnter your choice: ";
        cin>>ch;

        switch(ch){
            case 1:
                c1.accept();
                ++c1;
                c1.display();
                break;
            case 2: c1.accept();
                    c1++;
                    // c2.display();
                    c1.display();
                    break;

            case 3: c1.accept();
                    --c1;
                    c1.display();
                    break;
            case 4: c1.accept();
                    c1--;
                    // c3.display();
                    c1.display();
                    break;
            case 5:c1.accept();
                    c2.accept();
                    c3 = c1 +c2;
                    cout<<"\nThe Addition Is:";
                    c3.display();
                    break;
            case 6:c1.accept();
                    c2.accept();
                    c3 = c1-c2;
                    c3.display();
                    break;

            

            case 0:
                    break;
            default:
                cout<<"\nInvalid Choice!!!";
        }
    }while(ch != 0);



    return 0;

}