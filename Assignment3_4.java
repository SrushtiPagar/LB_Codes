////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    CharX
// Function name : DisplayConvert
// Input :         Character
// Output :        void
// Description :   Program to display convert small letter to capital and capital letter to small of the given input character
// language :      Java
// Date :          21/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept character from user and convert it to opposite case.
//
///////////////////////////////////////////////////////////////////////////////////////////////

class CharX
{
    void DisplayConvert(char cValue)
    {
        if((cValue >= 'a') && (cValue <= 'z'))
        {
            System.out.println("Capital letter is : "+(char)(cValue - 32));
        }
        else if((cValue >= 'A') && (cValue <= 'Z'))
        {
            System.out.println("Small letter is : "+(char)(cValue + 32));
        }
    }
}

class Assignment3_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        System.out.println("Enter Number : ");
        cValue = sobj.next().charAt(0);

        CharX cobj = new CharX();
        cobj.DisplayConvert(cValue);

        sobj.close();
    }    
}
///////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : a
/// Output : A
/// 
/// ///////////////////////////////////////////////////////////////////////////////////////////////