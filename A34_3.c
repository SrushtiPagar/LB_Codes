#include<stdio.h>

void StrCpyCap(char *str,char *dect)
{
    while(*str != '\0')
    {
        if((*str >='A' && *str <='Z'))
        {
            *dect = *str;
            dect++;
        }
        
        str++;
    }
    *dect = '\0';
}

int main()
{
    char Arr[50] = {'\0'};
    char Brr[50] = {'\0'};

    printf("Enter A String : ");
    scanf("%[^'\n']s",Arr);

    StrCpyCap(Arr,Brr);

    printf("%s\n", Arr);
    printf("%s\n", Brr);

    return 0;
}