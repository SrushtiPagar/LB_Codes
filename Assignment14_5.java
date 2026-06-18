////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    ArrayX
// Function name : CountFrequency
// Input :         integer array and integer
// Output :        int
// Description :   write a program which accept number from user and accept another number and return frequency of that number from it
// language :      Java
// Date :          03/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and accept another number and return frequency of that number from it
// language :      Java
//
///////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    int CountFrequency(int Arr[] , int iNo)
    {
        int iCnt = 0;
        int iFrequency = 0;

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt]) == iNo)
            {
                iFrequency++;
            }
        }
        return iFrequency;
    }
}

class Assignment14_5
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
        int iRet = aobj.CountFrequency(Brr , iNo);
        System.out.println("Frequency of " + iNo + " is : " + iRet);

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
/// output : Frequency of 11 is : 2
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////