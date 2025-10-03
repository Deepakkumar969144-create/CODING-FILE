#include<stdio.h>
#include<conio.h>
int main () {
    int a,b,c;
    printf("enter number: ") ;
    scanf("%d",&a);
    scanf("%d", &b);
    scanf("%d", &c);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("before swaping a:  %d", a);
    return 0;
}