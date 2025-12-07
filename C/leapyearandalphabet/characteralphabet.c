#include<stdio.h>

int main() {
    char ch;
    printf("entr a character : ");
    scanf("%c",&ch);
    if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')){
        printf("%c is an alphabet\n",ch); 

    }
    else{
        printf("%c is not an alphabet\n",ch);

    }
    printf("adtiya sir");
    return 0;

}
