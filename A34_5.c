#include<stdio.h>

void StrConCatX(char *str,char *dect)
{
    while(*str != '\0')
    {   
        str++;
    }
    while(*dect != '\0')
    {
        *str = *dect;
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

    printf("Enter B String : ");
    scanf(" %[^\n]", Brr);

    StrConCatX(Arr,Brr);

    printf("%s\n", Arr);
    printf("%s\n", Brr);

    return 0;
}