#include<stdio.h>

#define True 1
#define False 0
typedef int BOOL;

BOOL ChkSpecial(char ch)
{
    char cCnt = '\0';
    if((ch>= 'A' && ch<= 'Z') || (ch>= 'a' && ch<= 'z') || (ch>= '0' && ch<= '9') )
    {
       return False; 
    }    
    else
    {
        return True;
    }
}    

int main()
{
    char cValue = '\0';
    BOOL bRet = False;

    printf("Enter a Character : \n");
    scanf("%c",&cValue);

    bRet = ChkSpecial(cValue);

    if(bRet == True)
    {
        printf("It is Special Character");
    }
    else
    {
        printf("It is NOT a Special Character");
    }

    return 0;
}