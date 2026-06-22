////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    ArrayX
// Function name : Maximum
// Input :         integer array and integer
// Output :        int
// Description :   write a program which accept n number from user and return the largest number
// language :      Java
// Date :          04/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and accept range and return the largest number
// language :      Java
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Assignment16_1
{
    public static int Maximum(int Arr[])
    {
        int iCnt = 0;
        int iMax = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;

        System.out.println("Enter the number of Elements : ");
        iLength = sobj.nextInt();

        int Brr[] = new int[iLength];

        System.out.println("Enter the Elements : ");

        for(iCnt = 0 ; iCnt < iLength ; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        iRet = Maximum(Brr);

        System.out.println("Maximum Elemet in the array is : "+iRet);

        System.gc();
        Brr = null;
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 6
///         85 66 3 66 93 88
/// output : Maximum Element int the array is : 93
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////