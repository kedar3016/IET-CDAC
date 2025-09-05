#include<iostream>
using namespace std;
int main(){
    int  i = 0,space = 0,cnt =0,vowel = 0;
    
    char str[20];
    char *ptr = str;
    cout<<"/nEnter the String: ";
    gets(str);

    while(*ptr != '\0'){
        if(*ptr == ' '){
            space++;
        }
        if(*ptr == 'a' || *ptr == 'i' ||*ptr == 'o' ||*ptr == 'u' ||*ptr == 'e'){
            vowel++;
        }
        cnt++;
        ptr++;

    }

    cout<<"\nNo of Spaces in String is : "<<space;
    cout<<"\nNo of vowel in the String is : "<<vowel;
    cout<<"\nlength of the string : "<<cnt;
}