#include<stdio.h>

void strUpper(char *str)
{
    while(*str != '\0')
    {
        if(*str  >= 'a' && *str<= 'z')
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

    strUpper(Arr);

    return 0;
}