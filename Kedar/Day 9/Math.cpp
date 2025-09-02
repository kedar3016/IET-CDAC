#include<iostream>
#include<math.h>
using namespace std;
class math{
    
    public:
   
    void absolute(int n){
        cout<<"\nThe Absolute value is : ";
        cout<<abs(n);
    }
    void SquareRt(int n){
        cout<<"\nSquare Root is : ";
        cout<<sqrt(n);

    }
    void Power(int n,int pw){
        cout<<"\nPower of "<<n<<" is :  ";
        cout<<pow(n,pw);

    }
    void Ceil_value(float n){
        cout<<"\nCeil Value is :  ";
        cout<<ceil(n);

    }
    void floor_value(float n){
        cout<<"\nfloor Value is :  ";
        cout<<floor(n);

    }
    void rnd_value(float n){
        cout<<"\nRound Figure is :  ";
        cout<<round(n);

    }

};



int main(){

    int ch,n,pw;
    float f;
    math m;

    do{
        cout<<"\n1: Absolute value";
        cout<<"\n2: Square Root ";
        cout<<"\n3: Power";
        cout<<"\n4: Ceil";
        cout<<"\n5: Floor";
        cout<<"\n6: Round";

        cout<<"\n\nEnter your choice: ";
        cin>>ch;

        switch(ch){

            case 1:
                cout<<"\nEnter the Number: ";
                cin>>n;
                m.absolute(n);
                break;
            
            case 2:
                cout<<"\nEnter the Number: ";
                cin>>n;
                m.SquareRt(n);
                break;
            
            case 3:
                cout<<"\nEnter the Number: ";
                cin>>n;
                cout<<"\nEnter the Power of the Number: ";
                cin>>pw;
                m.Power(n,pw);
                break;

            case 4:
                cout<<"\nEnter the Number: ";
                cin>>f;
                m.Ceil_value(f);
                break;
            case 5:
                cout<<"\nEnter the Number: ";
                cin>>f;
                m.floor_value(f);
                break;
            
            case 6:
                cout<<"\nEnter the Number: ";
                cin>>f;
                m.rnd_value(f);
                break;
            case 0:
                break;
            default:
            cout<<"\nInvalid Choice";

        }

    }while(ch != 0);

    return 0;
}