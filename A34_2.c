#include<stdio.h>

void StrCpyX(char *str,char *dect,int iCnt)
{
    while((*str != '\0') && (iCnt != 0))
    {
        *dect = *str;
        str++;
        dect++;
        iCnt--;
    }
    *dect = '\0';
}

int main()
{
    char Arr[50] = "Marvellous Multi OS" ;
    char Brr[50] = {'\0'};

    StrCpyX(Arr,Brr,10);

    printf("%s\n", Arr);
    printf("%s\n", Brr);

    return 0;
}