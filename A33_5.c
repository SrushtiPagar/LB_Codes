#include<stdio.h>

void StrRevX(char *str)
{
    char *start = NULL;
    char *end = NULL;
    start = str;
    char temp = '\0';

    while(*str != '\0')
    {
        str++;
    }
    str--;
    end = str;
    while(start <= end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter A String : ");
    scanf("%[^'\n']s",Arr);

    StrRevX(Arr);

    printf(Arr);

    return 0;
}