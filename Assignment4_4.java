////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : SumNonFact
// Input :         integer
// Output :        int
// Description :   write a program which accept number from user and display summation of non-factors on screen.
// language :      Java
// Date :          27/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and display summation of non-factors on screen.
//
///////////////////////////////////////////////////////////////////////////////////////////////
class NumberX
{
    int SumNonFact(int iNo)
    {
        int iCnt = 0;
        int iAdd = 0;

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iAdd += iCnt;
            }
        }
        return iAdd;
    }
} 
class Assignment4_4
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        int iResult = nobj.SumNonFact(iValue);

        System.out.println("Summation of non-factors is : " + iResult);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
//   Input : 12
//   Output : 50
// 
//////////////////////////////////////////////////////////////////////////////////////////////////
