////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : PrintEven
// Input :         Integer
// Output :        void
// Description :   Program to print even numbers of the given input number
// language :      Java
// Date :          21/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and print that number of even numbers on screen.
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    void PrintEven(int iNo)
    {
        int iCnt = 0;
        if(iNo <= 0)
        {
            return;
        }

        System.out.println("Even numbers are : ");

        for(iCnt = 1; iCnt <= iNo*2; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.println(iCnt);
            }
        }        
    }
}

class Assignment3_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        nobj.PrintEven(iValue);

        sobj.close();
    }    
}
//////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 5
/// Output : Even numbers are : 2 4 6 8 10
/// 
/// ////////////////////////////////////////////////////////////////////////////////////////////