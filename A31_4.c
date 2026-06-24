#include<stdio.h>

#define True 1
#define False 0

typedef int BOOL;

BOOL CountSmall(char *str)
{
    BOOL bAns = False;
    while(*str != '\0')
    {
        if(*str == 'A' || *str == 'E' ||*str == 'I'||*str == 'O'||*str == 'U'||
            *str == 'a'||*str == 'e'||*str == 'i'||*str == 'o'||*str == 'u')
        {
            bAns = True;
            break;
        }
        str++;
    }
    return bAns;
}

int main()
{
    char Arr[20] = {'\0'};
    BOOL bRet = False;

    printf("Enter a String : \n");
    scanf("%[^'\n']s",&Arr);

    bRet = CountSmall(Arr);
    
    if(bRet == True)
    {
        printf("String Contains Vowel");
    }
    else
    {
        printf("String do NOT Contain Vowel");
    }
    

    return 0;
}