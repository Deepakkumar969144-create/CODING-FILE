#include<stdio.h>
#include<conio.h>
int main(){
    int age , income;
    printf("enter your age : ");
    scanf("%d", & age );
    printf("enter your monthly income : ");
    scanf("%d", & income );
    if ( age>=21 ) {
        if ( income>= 30000 ){
            printf( " you are eligible for loan");

        }
        else {
            printf("you are not eligible for loan");
        }  
    }
    else {
        printf("you are not eligible for loan");
    }
    printf("\n adtiya sir");
    return 0;
}