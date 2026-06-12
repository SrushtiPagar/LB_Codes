////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    DigitX
// Function name : DisplayDigit
// Input :         integer
// Output :        void
// Description :   write a program which accept number from user and check where it contains 0 in it or not
// language :      Java
// Date :          30/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and check where it contains 0 in it or not
//
///////////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    boolean ChkZero(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                break;
            }
            iNo = iNo/10 ; 
        }
        if(iDigit == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Assignment12_2 
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DigitX dobj = new DigitX();
        boolean bRet = dobj.ChkZero(iValue);

        if(bRet == true)
        {
            System.out.println("There is zero");
        }
        else
        {
            System.out.println("There is no zero");
        }

        sobj.close();
    } 
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 4521
/// Output : There is no zero
/// Input : 1024
/// Output : There is zero
/// 
/// Time Complexity : O(N) where N is the number of digits in the input number
/// 
///////////////////////////////////////////////////////////////////////////////////////////