// #include<stdio.h>
// int main () {
//     int a, b, c,;
//     printf("enter number");
//     scanf("%d", &d);
//     scanf("%d" , &d );
//     scanf("%d", &d)
//     a=a*b;
//     b=a/b;
//     a=a/b;
//     printf(" before swaping a: %d", );
//     return 0;
// }

#include<stdio.h>
int main () {
    int a, b;
    printf("Enter two numbers: ");
    scanf("%d", &a);
    scanf("%d", &b);

    // Swapping using multiplication and division
    a = a * b;
    b = a / b;
    a = a / b;

    printf("After swapping: a = %d, b = %d\n", a, b);
    return 0;
}