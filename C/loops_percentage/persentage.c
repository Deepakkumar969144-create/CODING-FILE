#include <stdio.h>
int main() {
 float marks , sum= 0;
 printf("enter marks of physics , chemistry , biology , maath computer ");
 for(int i=0; i<5; i++){
    scanf("%f", & marks);
    sum += marks;
} }
// float persent = sum / 5 ;
// printf("persentage = %2f \n grade= ", persent );
// if ( persent >= 90 ){
//     printf("A");
// }
// else if ( persent >= 80 ){
//     printf("B");
// }
// else if ( persent >= 70 ){
//     printf("C");
// }
// else if ( persent >= 60 ){
//     printf("D");
// }
// else if ( persent >= 40 ){
//     printf("E");
// }
// else {
//     printf("F");
// }
//  return 0;
// }