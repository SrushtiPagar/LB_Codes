////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    ArrayX
// Function name : CountDifference
// Input :         integer
// Output :        int
// Description :   write a program which accept number from user and return the difference between the frequency of even and odd numbers
// language :      Java
// Date :          03/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and return the difference between the frequency of even and odd numbers
//
///////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    int CountDifference(int Arr[])
    {
        int iCnt = 0;
        int iEvenCnt = 0;

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iEvenCnt++;
            }
            else
            {
                iEvenCnt--;
            }
        }
        return iEvenCnt;
    }
}

class Assignment14_2X
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter the Number of Elements : ");
        int iLength = sobj.nextInt();

        int Brr[] = new int[iLength];

        System.out.println("Enter the Elements : ");
        for(iCnt = 0; iCnt < Brr.length ; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt < Brr.length ; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

        ArrayX aobj = new ArrayX();
        int iRet = aobj.CountDifference(Brr);
        System.out.println("Difference between Even and Odd Numbers is : "+iRet);

        Brr = null;
        System.gc();
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 10
///         85 66 3 80 93 88 90 78 90 68
/// output : 4 
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////