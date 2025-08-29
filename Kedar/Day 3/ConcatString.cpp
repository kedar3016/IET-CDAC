#include<iostream>
using namespace std;

void user_concat(char* s1,char* s2){
    while(*s1 != '\0'){
        s1++;
    }
    while(*s2 != '\0'){
        *s1 = *s2;
        s1++;
        s2++;

    }

    *s1 = '\0';
}

int main(){
    char str1[20] = "hello";
    char str2[10] = "Bye";
    cout<<str1;
    user_concat(str1,str2);
    cout<<"\nConcat String is = "<<str1;

}