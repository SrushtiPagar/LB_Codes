#include<stdio.h>

#define true 1
#define false 0
typedef int BOOL;

BOOL checkCapital(char ch)
{ 
    if((ch >= 'A' && ch <= 'Z') )
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

    bRet = checkCapital(cValue);

    if(bRet == true)
    {
        printf("%c is a Capital character",cValue);
    }
    else
    {
        printf("%c is NOT a Capital character",cValue);
    }

    return 0;
}