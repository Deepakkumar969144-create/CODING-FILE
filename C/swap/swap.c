#include<stdio.h>
#include<conio.h>
int main (){
    int a, b, c;
    printf ("enter number: ");
    scanf( "%d",&a );
    scanf( "%d" , &b);
    scanf("%d", &c);
    a=b;
    b=c;
    c=a;

    printf (" swaping is a : %d",a);
    return 0;

}