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
// Input :         integer
// Output :        boolean
// Description :   write a program which accept number from user and return whether the number is present or not        
// language :      Java
// Date :          03/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and return whether the number is present or not
//
///////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    boolean Check(int Arr[])
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt]) == 11)
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
}

class Assignment14_3
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
        boolean bRet = aobj.Check(Brr);
        if(bRet == true)
        {
            System.out.println("11 is Present");
        }
        else
        {
            System.out.println("11 is NOT Present");
        }

        Brr = null;
        System.gc();
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 10
///         85 66 3 80 11 93 88 90 78 90 68
/// output : 11 is Present
/// 
/// input : 5
///        85 66 3 80 93
/// output : 11 is NOT Present
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////