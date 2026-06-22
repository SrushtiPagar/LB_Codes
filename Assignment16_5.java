////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : DisplaySumOfDigits
// Input :         integer array
// Output :        void
// Description :   write a program which accept n number from user and Display summation of digits of each number
// language :      Java
// Date :          06/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and Display summation of digits of each number
// language :      Java
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Assignment16_5
{
    public static void DisplaySumOfDigits(int Arr[])
    {
        int iCnt = 0;

        System.out.println("Sum of digits of each number are : ");
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            int iSum = 0;
            int iTemp = Arr[iCnt];
            while(iTemp != 0)
            {
                iSum = iSum + (iTemp % 10);
                iTemp = iTemp / 10;
            }
            System.out.print(iSum+" ");
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

        DisplaySumOfDigits(Brr);

        System.gc();
        Brr = null;
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 6
///         85 666 3 66 931 88
/// output : Sum of digits of each number are : 13 18 3 12 13 16    
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////