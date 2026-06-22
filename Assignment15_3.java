////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    ArrayX
// Function name : LastOccur
// Input :         integer array and integer
// Output :        int
// Description :   write a program which accept number from user and accept another number and return index of last occurrence of that number from it
// language :      Java
// Date :          04/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and accept another number and return index of last occurrence of that number from it
// language :      Java
//
///////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    int LastOccur(int Arr[] , int iNo)
    {
        int iCnt = 0;
        int iIndex = -1;

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt]) == iNo)
            {
                iIndex = iCnt;
            }
        }
        return iIndex;
    }
}

class Assignment15_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        int iNo = 0;

        System.out.println("Enter the Number of Elements : ");
        int iLength = sobj.nextInt();

        System.out.println("Enter the number u want to find frequency : ");
        iNo = sobj.nextInt();

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
        int iRet = aobj.LastOccur(Brr , iNo);
        System.out.println("Last occurrence of " + iNo + " is at index : " + iRet);

        if(iRet == -1)
        {
            System.out.println(iNo + " is Not Present");
        }

        Brr = null;
        System.gc();
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 10
///         85 66 3 80 11 93 88 11 78 90 68
/// No = 11
/// output : Last occurrence of 11 is at index : 7
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////