#include<stdio.h>

void Display(char ch)
{
    char cCnt = '\0';
    if(ch>= 'A' && ch<= 'Z')
    {
        for (cCnt = ch ; cCnt <= 'Z' ; cCnt++)
        {
             printf("%c\n",cCnt);   
        }
    }
    else if(ch>= 'a' && ch<= 'z')
    {
        for (cCnt = ch ; cCnt >= 'a' ; cCnt--)
        {
             printf("%c\n",cCnt);   
        }
    }     
    else
    {
        printf(" ");
    }
}    

int main()
{
    char cValue = '\0';

    printf("Enter a Character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}