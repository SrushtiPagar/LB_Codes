////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : DisplayFactors
// Input :         Integer
// Output :        void
// Description :   Program to display factors of the given input number
// language :      Java
// Date :          21/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
// 
// write a program which accept number from user and display that number of factors on screen.
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
            if(iNo % iCnt == 0)
            {
                 System.out.println(iCnt);
            }
        }
         
    }
}

class Assignment3_2 
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
///////////////////////////////////////////////////////////////////////////////////////////////
///    
/// Input :10
/// Output : 1 2 5
/// 
/// Input : 36
/// Output : 1 2 3 4 6 9 12 18
///     
/// //////////////////////////////////////////////////////////////////////////////////////////////