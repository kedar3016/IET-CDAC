#include<stdio.h>
int main()
{
    int n;
printf("how many number you wan to add");
scanf("%d",&n);
int a[n];
for(int i =0;i<n;i++)
{
scanf("%d",&a[i]);
}
for(int i =0;i<n;i++)
{
printf("%d ",a[i]);
}


}