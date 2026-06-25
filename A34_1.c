#include<stdio.h>

void StrCpyX(char *str,char *dect)
{
    while(*str != '\0')
    {
        *dect = *str;
        str++;
        dect++;
    }
    *dect = '\0';
}

int main()
{
    char Arr[50] = {'\0'};
    char Brr[50] = {'\0'};

    printf("Enter A String : ");
    scanf("%[^'\n']s",Arr);

    StrCpyX(Arr,Brr);

    printf("%s\n", Arr);
    printf("%s\n", Brr);

    return 0;
}