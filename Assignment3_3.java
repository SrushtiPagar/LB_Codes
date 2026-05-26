////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : DisplayFactors
// Input :         Integer
// Output :        void
// Description :   Program to display factors of the given input number which are even factors
// language :      Java
// Date :          21/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and display that number of even factors on screen.
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    void DisplayFactors(int iNo)
    {
        int iCnt = 0;
        if(iNo <= 0)
        {
            iNo = -iNo;
        }
        for(iCnt = 1; iCnt <=iNo/2 ; iCnt++)
        {
            if(iNo % iCnt == 0 && (iCnt % 2) == 0)
            {
                 System.out.println(iCnt);
            }
        }
         
    }
}

class Assignment3_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        nobj.DisplayFactors(iValue);

        sobj.close();
    }    
}
//////////////////////////////////////////////////////////////////////////////////////////////
//
/// Input : 24
/// Output : 2 4 6 8 12
/// 
/////////////////////////////////////////////////////////////////////////////////////////////// 