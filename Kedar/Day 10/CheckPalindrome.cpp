#include<iostream>
#include<string.h>
using namespace std;

void accept(int* n){
    cout<<"\nEnter the number: ";
    cin>>*n;

}

void NumPalind(int n){
    int rev = 0;
    int num = n;
    while(num != 0){
        int temp = num%10;
        rev = rev*10+temp;
        num = num/10;
    }
    if(n == rev){
        cout<<"\n"<<n<<" is a Palindrome Number.\n";
    }
    else{
        cout<<"\n"<<n<<" is Not a Palindrome Number.\n";
    }
}
void StrPalin(string& str){
    int i = 0;
    string rev;
    rev = str; 

    int st = 0;
    int end = rev.length()-1;

    while(st<end){  
        char temp = rev[end];
        rev[end]= rev[st]; 
        rev[st] = temp; 
        st++; 
        end--; 
    }
    if(str == rev)
    {
        cout<<"\nString is Palindrome";
    }
    else{
        cout<<"\nString is Not a Palindrome";
    }

}


int main(){
    int ch,n;
    string str;

    do{
        cout<<"\n1: Check Number Palindrome";
        cout<<"\n2: Check String Palindrome";
        cout<<"\n0: Exit";
        cout<<"\n\nEnter your Choice: ";
        cin>>ch;
        switch (ch){
            case 1: accept(&n);
                    NumPalind(n);
                    break;
            case 2: 
                    cout<<"\nEnter the the string : ";
                    cin>>str;
                    StrPalin(str);
                    break;
            case 0:break;

        }
        

    }while(ch != 0);

    
}