#include<stdio.h>

int CountChar(char *str, char ch)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if((*str == ch))
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
    char ch = '\0';

    printf("Enter The string : \n");
    scanf("%[^'\n']s",&Arr);

    printf("Enter the character to count: \n");
    scanf(" %c", &ch);

    int iRet = CountChar(Arr, ch);
    printf("Number of occurrences of '%c' in the string: %d\n", ch, iRet);
                                                                                                                                               
    return 0;
}