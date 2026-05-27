////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : MulFact
// Input :         integer
// Output :        void
// Description :   write a program which accept number from user and display multiplication of factors on screen.
// language :      Java
// Date :          27/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and display multiplication of factors on screen.
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    int MulFact(int iNo)
    {
        int iCnt = 0;
        int iMul = 1;

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iMul = iMul * iCnt;
            }
        }
        return iMul;
    }
} 

class  Assignment4_1 
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        int iResult = nobj.MulFact(iValue);
        System.out.println("Multiplication of factors is : " + iResult);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
//   Input : 12
//   Output : 144
// 
//////////////////////////////////////////////////////////////////////////////////////////////////