#include<stdio.h>
int main() {
    char ch;
    printf("enter a character: ");
    scanf("%c", &ch);
    if ((ch>='A'&& ch<='Z') || ( ch>='a' && ch<= 'z')) {
        printf("%c is an alphabet\n", ch);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch== 'o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch== 'O'|| ch=='U') {
            printf("%c is a vowel\n",ch);
        } else {
            printf("%c is a consonant\n",ch);
        }
    } 
    else {
        printf("%c is not an alphabet and Invalid input \n",ch);
    }

    return 0;
}
