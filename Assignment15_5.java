////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    ArrayX
// Function name : Product
// Input :         integer array and integer
// Output :        int
// Description :   write a program which accept n number from user and return product of all odd elements
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

class Assignment15_5
{
    public static int Product(int Arr[])
    {
        int iCnt = 0;
        int iProduct = 0;

        for(iCnt = 0 , iProduct = 1 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 1)
            {
                iProduct = iProduct * Arr[iCnt];
            }
        }
        return iProduct;
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

        iRet = Product(Brr);

        System.out.println("Product of odd Elemets is : "+iRet);

        System.gc();
        Brr = null;
        sobj.close();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
/// 
/// input : 6
///         15 66 3 70 10 88
/// output : 45
/// 
/// Time Complexity : O(N) where N is the number of elements in the input array
/// 
///////////////////////////////////////////////////////////////////////////////////////////////