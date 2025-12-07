#include<stdio.h>
#include<conio.h>
int main(){
    int physics , chemistry , math , hindi,english;
    float percentage, total;
    printf("enter marks of physics: ");
    scanf("%d", & physics);
    printf("enter marks of chemistry: ");
    scanf("%d", & chemistry);
    printf("enter marks of math: ");
    scanf("%d", &math);
    printf("enter marks of hindi: ");
    scanf("%d", &hindi);
    printf("enter marks of english: ");
    scanf("%d", & english);
    percentage = (physics + chemistry + math + hindi + english) /500.0;
    total = percentage *100;
    printf("total percentage is : %2f", total);
    printf("\n adtiya sir");
    return 0;
}
