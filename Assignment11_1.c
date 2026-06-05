#include <stdio.h>

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  RangeDisplay
//  Description:    A Program to Display range between number
//  Input:          int
//  Output:         int
//  Author:         Srushti Nitin pagar 
//  Date:           29/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

void Range(int iStart, int iEnd)
{
    int iCnt = 0;

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        printf("%d\n", iCnt);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
// 
// Write a program which accepts area in square feet and converts it into square meter. (1 square feet = 0.0929 Square Meter)
//
///////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue1 = 0, iValue2=0;

    printf("Enter Start Point : \n");
    scanf("%d", &iValue1);

    printf("Enter End Point : \n");
    scanf("%d", &iValue2);

    Range(iValue1, iValue2);
    return 0;
}
/////////////////////////////////////////////////////////////////////////////////////
//
//  Output :
//  Enter Start Point : 5
//  Enter End Point : 10
//  5
//  6   
//  7
//  8
//  9
//  10
//
// Time complexity:O(n)
//
///////////////////////////////////////////////////////////////////////////////////////