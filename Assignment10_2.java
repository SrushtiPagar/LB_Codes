////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : RectangleArea
// Input :         float
// Output :        double
// Description :   Write a program which accepts width and height of rectangle from user and calculates its area.
// language :      c
// Date :          29/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    double RectangleArea(float fWidth, float fHeight)    
    {
        double dArea;

        dArea = fWidth * fHeight;
        
        return dArea;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
// 
// Write a program which accepts width and height of rectangle from user and calculates its area.
//
///////////////////////////////////////////////////////////////////////////////////////////

class Assignment10_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fWidth = 0.0f;
        float fHeight = 0.0f;
        double dRet = 0.0;

        System.out.println("Enter width of rectangle : ");
        fWidth = sobj.nextFloat();

        System.out.println("Enter height of rectangle : ");
        fHeight = sobj.nextFloat();

        NumberX nobj = new NumberX();
        dRet = nobj.RectangleArea(fWidth, fHeight);

        System.out.println("Area of rectangle is : " + dRet);

        sobj.close();

    }
}
///////////////////////////////////////////////////////////////////////////////////////////
//  
//  Input : 5.3  9.78
//  Output : 51.834000
//
///////////////////////////////////////////////////////////////////////////////////////////