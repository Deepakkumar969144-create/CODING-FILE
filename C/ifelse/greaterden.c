#include<stdio.h>
#include<conio.h>
// int main() {
//     int a,b;
//     printf("enter the first number: ");
//     scanf("%d",&a);
//     printf("enter the second number: ");
//     scanf("%d", &b);
//     if(a>b){
//         printf("first number is greatest");
//     }

//     if(b>a){
//         printf("second number is greatest");
//     }
//     return 0;
// }
int main () {
    int a, b;
    printf("enter the first number: ");
    scanf("%d", &a);
    printf("enter the second number : ");
    scanf("%d", &b);
    if (a>b){
        printf("first number is greatest");

    }
    if(b>a) {
        printf("second number is greatest");
    }
    return 0;
}