#include<stdio.h>

#define true 1
#define false 0
typedef int BOOL;

BOOL checkDigit(char ch)
{ 
    if((ch >= '0' && ch <= '9') )
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

    bRet = checkDigit(cValue);

    if(bRet == true)
    {
        printf("%c is a Digit",cValue);
    }
    else
    {
        printf("%c is NOT a Digit",cValue);
    }

    return 0;
}