#include<stdio.h>

void DisplaySchedule(char ch)
{ 
    if(ch == 'A' || ch == 'a')
    {
        printf("Your exam is at 7AM : \n");
    }
    else if(ch == 'B' || ch == 'b')
    {
        printf("Your exam is at 8:30AM : \n");
    }
    else if(ch == 'C' || ch == 'c')
    {
        printf("Your exam is at 9:20AM : \n");
    }
    else if(ch == 'D' || ch == 'd')
    {
        printf("Your exam is at 10:30AM : \n");
    }
    else
    {
        printf("Invalid Division");
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter your Division : \n");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);

    return 0;
}