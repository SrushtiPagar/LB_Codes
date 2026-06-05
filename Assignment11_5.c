#include <stdio.h>

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  RangeDisplayRev
//  Description:    A Program to Display numbers in reverse order between range
//  Input:          int
//  Output:         int
//  Author:         Srushti Nitin pagar 
//  Date:           29/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

void RangeDisplayRev(int iStart, int iEnd)
{
    int iCnt = 0;

    for(iCnt = iEnd; iCnt >= iStart; iCnt--)
    {
            printf("%d\n", iCnt);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
// 
// Write a program which accepts start and end point from user and display numbers in reverse order between that range.
//
///////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue1 = 0, iValue2=0;

    printf("Enter Start Point : \n");
    scanf("%d", &iValue1);

    printf("Enter End Point : \n");
    scanf("%d", &iValue2);

    RangeDisplayRev(iValue1, iValue2);

    return 0;
}
/////////////////////////////////////////////////////////////////////////////////////
//
//  Output :
//  Enter Start Point : 5
//  Enter End Point : 10
//  10
//  9
//  8
//  7
//  6
//  5
//
// Time complexity:O(n)
//
///////////////////////////////////////////////////////////////////////////////////////