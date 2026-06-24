#include<stdio.h>

int CountSmall(char *str)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCount++;
        }
        else if(*str >= 'A' && *str <= 'Z')
        {
            iCount--;
        }
        str++;
    }
    return iCount;
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