#include<stdio.h>

#define true 1
#define false 0
typedef int BOOL;

BOOL checkAlpha(char ch)
{ 
    if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    char cValue = '\0';
    BOOL bRet = false;

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    bRet = checkAlpha(cValue);

    if(bRet == true)
    {
        printf("%c is a character",cValue);
    }
    else
    {
        printf("%c is NOT a character",cValue);
    }

    return 0;
}