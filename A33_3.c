#include<stdio.h>

int FirstChar(char *str, char ch)
{
    int i = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            return i;
        }

        str++;
        i++;
    }

    return -1;
}

int main()
{
    char Arr[50] = {'\0'};
    char ch = '\0';

    printf("Enter The string : \n");
    scanf("%[^'\n']s",&Arr);

    printf("Enter the character to find: \n");
    scanf(" %c", &ch);

    int iRet = FirstChar(Arr, ch);
    printf("First occurrence of '%c' in the string: %d\n", ch, iRet);
                                                                                                                                               
    return 0;
}