////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    DigitX
// Function name : CountFreq
// Input :         integer
// Output :        int
// Description :   write a program which accept number from user and count the frequency of digit 4 in it
// language :      Java
// Date :          30/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and count the frequency of digit 4 in it
//
///////////////////////////////////////////////////////////////////////////////////////////////

class DigitX
{
    int CountFreq(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 4)
            {
                iCount++;
            }
            iNo = iNo/10 ; 
        }
        return iCount;
    }
}

public class Assignment12_4
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        DigitX dobj = new DigitX();
        int iRet = dobj.CountFreq(iValue);

        System.out.println(iRet);

        sobj.close();
    } 
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 45671
/// Output : 1
/// Input : 10445
/// Output : 2
/// 
/// Time Complexity : O(N) where N is the number of digits in the input number
/// 
///////////////////////////////////////////////////////////////////////////////////////////