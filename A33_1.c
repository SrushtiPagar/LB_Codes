#include<stdio.h>

#define True 1
#define False 0

typedef int BOOL;

BOOL ChkChar(char *str, char ch)
{
    BOOL bFlag = False;

    while(*str != '\0')
    {
        if(*str == ch )
        {
            bFlag = True;
            break;
        }
        str++;
    }

    return bFlag;
}

int main()
{
    char Arr[50] = {'\0'};
    char ch = '\0';

    printf("Enter The string : \n");
    scanf("%[^'\n']s",&Arr);

    printf("Enter the character to search for: \n");
    scanf(" %c", &ch);

    BOOL bRet = ChkChar(Arr, ch);
    if(bRet == True)
    {
        printf("String contains the character '%c'\n", ch);
    }
    else
    {
        printf("String does not contain the character '%c'\n", ch);
    }                                                                                                                                                              
    return 0;
}