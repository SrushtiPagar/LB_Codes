////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    ArrayX
// Function name : Minimum
// Input :         integer array and integer
// Output :        int
// Description :   write a program which accept n number from user and return the smallest number
// language :      Java
// Date :          04/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and accept range and return the smallest number
// language :      Java
//
///////////////////////////////////////////////////////////////////////////////////////////////

class Assignment16_2
{
    public static int Minimum(int Arr[])
    {
        int iCnt = 0;
        int iMin = 0;

        for(iCnt = 0,iMin = Arr[iCnt] ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
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

        iRet = Minimum(Brr);

        System.out.println("Minimum Elemet in the array is : "+iRet);

        System.gc();
        Brr = null;
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 6
///         85 66 3 66 93 88
/// output : Maximum Element int the array is : 3
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////