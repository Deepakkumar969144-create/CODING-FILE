#include<stdio.h>
int main () {
    int a ;
    printf("enter a number : ");
    scanf("%d",&a);
    if (a>0 && a%5==0){
        printf("%d is positive and divisivle by 5\n" , a);

    }
    else {
        printf("%d is not satisfy the condition not divisible by 5\n",a);

    }
    printf("adtiya sir");
    return 0;
}
