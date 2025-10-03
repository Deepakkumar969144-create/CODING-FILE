
#include <stdio.h>
int main() {
    int a, b, c;
    printf("Enter first number: ");
    scanf("%d", &a);
    printf("Enter second number: ");
    scanf("%d", &b);
    printf("Enter third number: ");
    scanf("%d", &c);

    if (a >= b) {
        if (a >= c) {
            printf("max = %d\n", a);
        } else {
            printf("max = %d\n", c);
        }
    } else {
        if (b >= c) {
            printf("max = %d\n", b);
        } else {
            printf("max = %d\n", c);
        }
    }

    return 0;
}