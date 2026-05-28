////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : OddFactorial
// Input :         integer
// Output :        int
// Description :   Write a program to write odd factorial of given given number.
// language :      Java
// Date :          27/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// Write a program to write odd factorial of given given number.
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    int OddFactorial(int iNo)
    {
        int iFactorial = 1;
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                iFactorial = iFactorial * iCnt;
            }
        }

        return iFactorial;
    }
}

class Assignment7_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        iRet = nobj.OddFactorial(iValue);

        System.out.println("Odd factorial is : " +iRet);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 5
/// Output : 15
/// 
///////////////////////////////////////////////////////////////////////////////////////////