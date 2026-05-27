////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : factdiff
// Input :         integer
// Output :        int
// Description :   write a program which accept number from user and return difference between summation of all factors and non-factors on screen.
// language :      Java
// Date :          27/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and return difference between summation of all factors and non-factors on screen.
//
///////////////////////////////////////////////////////////////////////////////////////////////
class NumberX
{
    int factdiff(int iNo)
    {
        int iCnt = 0;
        int iFactAdd = 0;
        int iNonFactAdd = 0;

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFactAdd += iCnt;
            }
            else
            {
                iNonFactAdd += iCnt;
            }
        }
        return iFactAdd - iNonFactAdd;
    }
} 
class Assignment4_5
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        int iResult = nobj.factdiff(iValue);

        System.out.println("Difference between summation of factors and non-factors is : " + iResult);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
//   Input : 12
//   Output : -34
// 
//////////////////////////////////////////////////////////////////////////////////////////////////
