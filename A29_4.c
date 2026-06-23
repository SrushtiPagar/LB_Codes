#include<stdio.h>

#define true 1
#define false 0
typedef int BOOL;

BOOL checkSmall(char ch)
{ 
    if((ch >= 'a' && ch <= 'z') )
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

    bRet = checkSmall(cValue);

    if(bRet == true)
    {
        printf("%c is a Small character",cValue);
    }
    else
    {
        printf("%c is NOT a Small character",cValue);
    }

    return 0;
}