#include<stdio.h>
#include<conio.h>
// int main() {
//     int a,b,c;
//     printf("enter first number: ");
//     scanf("%d",&a);
//     printf("enter second number: ");
//     scanf("%d",&b);
//     printf("enter third number:");
//     scanf("%d",&c);
//     if (c>a&&b>a){
//         printf("%d first number is greatest",a);
//     }
//     if(b>c&&b>a){
//         printf("%d second number is greatest",b);

//     }
//     if(c>a&&c>b){
//         printf("%d third number is greatest",c);
//     }
//     return 0;
//     }


 int main() {
    int a, b, c;
    printf("enter first number: ");
    scanf("%d", &a);
    printf("enter second numver: ");
    scanf("%d", &b);
    printf("enter third number: ");
    scanf("%d", &c);
    if (a>b && a>c){
        printf("%d first number is greatest ", a);
    }
    if (b>a && b>c){
        printf("%d second number is greatest", b);

    }
    if (c>a && c>b) {
        printf( "%d third number is greatest", c);

    }

    return 0;
 }

 