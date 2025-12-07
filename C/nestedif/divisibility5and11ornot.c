#include<stdio.h>
// int main() {
//     int a;
//     printf("entr a number  :");
//     scanf("%d",&a);
//     if(a%5==0){
//         printf("divisible by both 5 \n %d",a);

//     }
//     if(a%11==0){
//         printf("divisible by 11 ");
//     }
//     else{
//         printf(" not divisible by both 5 and 11");

//     }
//     return 0;
    
// }
int main() {
    int a;
    printf("enter a number : ");
    scanf("%d", &a);
    if (a%5==0){
    printf("divisible by 5 \n %d", a);
}
if (a%11==0 ){
    printf("divisible by 11 \n %d", a);

}
else{
    printf(" not divisible by both 5 and 11 ");
}
printf("\n adtiya sir");
return 0;
 
}

