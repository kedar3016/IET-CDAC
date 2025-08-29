
#include<iostream>
#include <cstring>
using namespace std;

void revstring(char* str)
{
    char* start = str;
    char* end = str+strlen(str)-1;

    while(start<end)
    {
        char temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }

    cout<<"\nReversed String is : - "<<str;

}
int main()
{
   char str1[50];
   cout<<"enter str";
   cin>>str1;
   revstring(str1);
   return 0;
}