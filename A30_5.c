#include<stdio.h>

void Display(char ch)
{
    printf("ASCII Value are:\n");

    printf("Decimal : %d\n",ch);
    printf("Hexadecimal : %x\n", ch);
    printf("Octal : %o\n", ch);
    
}    

int main()
{
    char cValue = '\0';

    printf("Enter a Character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}