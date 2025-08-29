#include<iostream>
#include<cstring>
using namespace std;

void accept(char* str){
    cout<<"\nEnter the String: ";
    cin>>(str);
}
void display(char* str){
    cout<<puts(str);
}
void reverseStr(char* str){
    cout<<"\nThe Reverse String is :- "<<strrev(str);
}
void ConCatString(char* str1,char* str2){
    cout<<"\nString After Concat :- "<<strcat(str1,str2);
}
void CopyStr(char* str1,char*str2){
    cout<<"\nThe Copied String 2 Is: "<<strcpy(str2,str1);
}

int main(){

    char str1[20];
    char str2[20];
    int ch;

    do{
        cout<<"\n1: String Length";
        cout<<"\n2: String Reverse";
        cout<<"\n3: String Concat";
        cout<<"\n4: Copy String";
        cout<<"\n0: Exit";
        cout<<"\n\nEnter Your Choice:- ";
        cin>>ch;

        switch (ch)
        {
        case 1:
                accept(str1);
                
                display(str1);
                cout<<"\nLength of the string is:- "<<strlen(str1);
            
            /* code */
            break;

        case 2:
                accept(str1);
                display(str1);
                reverseStr(str1);
                display(str1);
                break;
        case 3:
            accept(str1);
            accept(str2);
            ConCatString(str1,str2);
            break;

        case 4:
            accept(str1);
            CopyStr(str1,str2);
            break;
        case 0:
            cout<<"\nThanks For Visiting!!";
            break;
        default:
        cout<<"\nInvalid Choice !!";
            break;
        }

    }while(ch != 0);



}
  
