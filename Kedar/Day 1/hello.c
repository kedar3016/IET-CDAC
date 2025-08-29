#include<stdio.h>
void main()
{
    int e_sum=0,o_sum=0;
    int n;
    printf("enter the number");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        if(i % 2 ==0)
        e_sum=e_sum+i;
        else
        o_sum=o_sum+i;
    }
    printf("sum of even number is %d\n",e_sum);
 printf("sum of odd number is %d",o_sum);







}