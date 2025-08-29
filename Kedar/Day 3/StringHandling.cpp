#include<iostream>
#include<string>
#include <cstring>
using namespace std;

void user_strcpy(char* s2,char* s1){
    while(*s1 != '\0'){
        *s2 = *s1;
        s1++;
        s2++;

    }
    *s2 = '\0';
}

int main(){
    char str1[] = "hello world";
    char str2[15];
     
    user_strcpy(str2,str1);
    cout<<"\nCopied String : "<<str2;

    cout<<"\nLength Of the String is : "<<strlen(str2);

    cout<<"\n\nSize of the String 1 : "<<sizeof(str1)/sizeof(char);


}