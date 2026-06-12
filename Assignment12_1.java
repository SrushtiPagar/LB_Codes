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
// Description :   write a program which accept number from user and display all its digits in reverse order
// language :      Java
// Date :          30/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and display all its digits in reverse order
//
///////////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    void DisplayDigit(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo/10 ; 
        }
    }
}

public class Assignment12_1 
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DigitX dobj = new DigitX();
        dobj.DisplayDigit(iValue);

        sobj.close();
    } 
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 4521
/// Output : 1
///          2
///          5
///          4
/// 
/// Time Complexity : O(N) where N is the number of digits in the input number
/// 
///////////////////////////////////////////////////////////////////////////////////////////