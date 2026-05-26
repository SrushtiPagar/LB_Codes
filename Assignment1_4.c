////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : Check
// Input :         int
// Output :        BOOL
// Description :   Program to Check whether number is Divisible by 5 or not
// language :      c
// Date :          21/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

typedef int BOOL;           //Include library for Boolean
#define TRUE 1              // macro
#define False 0             // macro

//////////////////////////////////////////////////////////////////////////////////////////
// 
// Application to Check whether number is Divisible by 5 or not
//
///////////////////////////////////////////////////////////////////////////////////////////

int Check(int iNo)          //BOOL Check(int iNo)  
                            // as macro is used for typecasting from bool to int we can write the returntype of fuction as int as well as BOOL  
{
    if((iNo % 5 ) == 0)
    {
        return TRUE;
    }
    else
    {
        return False;
    }
}

int main()
{
    int iValue = 0;
    BOOL bRet = False;

    printf("Enter Number : ");
    scanf("%d" , &iValue);

    bRet = Check(iValue);

    if(bRet == TRUE)
    {
        printf("Number is Divisible by 5");
    }
    else
    {
        printf("Number is NOT Divisible by 5");
    }

    return 0;
}
///////////////////////////////////////////////////////////////////////////////////////////
//  
//  Input : 23  
//  Output : Number is NOT Divisible by 5
//
///////////////////////////////////////////////////////////////////////////////////////////