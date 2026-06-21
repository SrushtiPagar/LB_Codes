////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    ArrayX
// Function name : Check
// Input :         integer array and integer
// Output :        boolean
// Description :   write a program which accept number from user and accept another number and check whether that number is present or not
// language :      Java
// Date :          04/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and accept another number and check whether that number is present or not
// language :      Java
//
///////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    boolean Check(int Arr[] , int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt]) == iNo)
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
}

class Assignment15_1
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
        boolean bRet = aobj.Check(Brr , iNo);
        if(bRet == true)
        {
            System.out.println(iNo + " is Present");
        }
        else
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
/// output : 11 is Present
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////