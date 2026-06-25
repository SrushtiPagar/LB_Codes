#include<stdio.h>

void strLower(char *str)
{
    while(*str != '\0')
    {
        if(*str  >= 'A' && *str<= 'Z')
        {
            printf("%c",*str+32);
        }
        else
        {
            printf("%c",*str);
        }
        str++;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter The string : \n");
    scanf("%[^'\n']s",&Arr);

    strLower(Arr);

    return 0;
}