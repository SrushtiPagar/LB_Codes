#include <stdio.h>

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  RangeDisplayAddition
//  Description:    A Program to Display addition of numbers between range
//  Input:          int
//  Output:         int
//  Author:         Srushti Nitin pagar 
//  Date:           29/05/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////

void RangeSumEven(int iStart, int iEnd)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iSum += iCnt;
        }
    }
    printf("Addition of even numbers: %d\n", iSum);
}

//////////////////////////////////////////////////////////////////////////////////////////
// 
// Write a program which accepts start and end point from user and display addition of all the even numbers between that range.
//
///////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue1 = 0, iValue2=0;

    printf("Enter Start Point : \n");
    scanf("%d", &iValue1);

    printf("Enter End Point : \n");
    scanf("%d", &iValue2);

    RangeSumEven(iValue1, iValue2);
    return 0;
}
/////////////////////////////////////////////////////////////////////////////////////
//
//  Output :
//  Enter Start Point : 5
//  Enter End Point : 10
//  Addition of even numbers: 18
//
// Time complexity:O(n)
//
///////////////////////////////////////////////////////////////////////////////////////