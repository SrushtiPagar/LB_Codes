#include<stdio.h>

int CountSmall(char *str)
{
    int iCountC = 0;
    int iCountS = 0;

    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCountS++;
        }
        else if(*str >= 'A' && *str <= 'Z')
        {
            iCountC++;
        }
        str++;
    }
    return iCountS - iCountC;
}

int main()
{
    char Arr[20] = {'\0'};
    int iRet = 0;

    printf("Enter a String : \n");
    scanf("%[^'\n']s",&Arr);

    iRet = CountSmall(Arr);

    printf("Difference is : %d\n",iRet);

    return 0;
}