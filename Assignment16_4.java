////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : Display3DigitNumbers
// Input :         integer array
// Output :        void
// Description :   write a program which accept n number from user and Display all such numbers which contains 3 digit in it
// language :      Java
// Date :          06/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and Display all such numbers which contains 3 digit in it
// language :      Java
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Assignment16_4
{
    public static void Display3DigitNumbers(int Arr[])
    {
        int iCnt = 0;

        System.out.println("3 Digit Numbers in the array are : ");
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] >= 100) && (Arr[iCnt] <= 999))
            {
                System.out.print(Arr[iCnt]+" ");
            }
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0;
        int iCnt = 0;

        System.out.println("Enter the number of Elements : ");
        iLength = sobj.nextInt();

        int Brr[] = new int[iLength];

        System.out.println("Enter the Elements : ");

        for(iCnt = 0 ; iCnt < iLength ; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        Display3DigitNumbers(Brr);

        System.gc();
        Brr = null;
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 6
///         85 666 3 66 931 88
/// output : 3 Digit Numbers in the array are : 666 931
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////