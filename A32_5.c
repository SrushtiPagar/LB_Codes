#include<stdio.h>

int CountSpaces(char *str)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }
        str++;
    }
    return iCount;
}

int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter The string : \n");
    scanf("%[^'\n']s",&Arr);

    iRet = CountSpaces(Arr);
    printf("Number of spaces in the string is : %d\n", iRet);   

    return 0;
}