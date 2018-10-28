#include<stdio.h>
int factorial(int n)
{ if(n==0)
    {
        return 1;
    }
    else{
     return n*factorial(n-1);
    }

}
int main()
{int n,r;
printf("enter the number");
scanf("%d",&n);
r=factorial(n);
printf("%d",r);
}
