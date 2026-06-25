#include<stdio.h>

int LastChar(char *str, char ch)
{
    int i = 0;
    int lastOccurrence = -1;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            lastOccurrence = i;
        }
        str++;
        i++;
    }

    return lastOccurrence;
}

int main()
{
    char Arr[50] = {'\0'};
    char ch = '\0';

    printf("Enter The string : \n");
    scanf("%[^'\n']s",&Arr);

    printf("Enter the character to find: \n");
    scanf(" %c", &ch);

    int iRet = LastChar(Arr, ch);
    printf("Last occurrence of '%c' in the string: %d\n", ch, iRet);
                                                                                                                                               
    return 0;
}