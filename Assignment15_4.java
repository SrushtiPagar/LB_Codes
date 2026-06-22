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
// Description :   write a program which accept number from user and accept range and display all elements from that range
// language :      Java
// Date :          04/06/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and accept range and display all elements from that range
// language :      Java
//
///////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    void DisplayRange(int Arr[] , int iStart , int iEnd)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt]) >= iStart && (Arr[iCnt]) <= iEnd)
            {
                System.out.print(Arr[iCnt] + " ");
            }
        }
    }
}

class Assignment15_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        int iStart = 0;
        int iEnd = 0;

        System.out.println("Enter the Number of Elements : ");
        int iLength = sobj.nextInt();

        System.out.println("Enter the Start of Range : ");
        iStart = sobj.nextInt();

        System.out.println("Enter the End of Range : ");
        iEnd = sobj.nextInt();

        int Brr[] = new int[iLength];

        System.out.println("Enter the Elements : ");
        for(iCnt = 0; iCnt < Brr.length ; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.DisplayRange(Brr , iStart , iEnd);
        System.out.println();

        Brr = null;
        System.gc();
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 10
///         85 66 3 80 11 93 88 11 78 90 68
/// Start = 10
/// End = 90
/// output : 66 3 80 11 93 88 11 78 90
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////