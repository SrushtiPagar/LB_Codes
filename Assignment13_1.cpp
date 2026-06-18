////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

#pragma pack(1)

////////////////////////////////////////////////////////////////////////////////////////////
//  
//  Class name : ArrayX
//  Function name : SumEvenOdd
//                  Accept
//  Input :         int
//  Output :        int
//  Description :   write a program which accept number from user and return the difference between summation of even elements and summation of odd elements from that array
//  language :      C++
//  Date :          03/06/2026
//  Author :        Srushti Nitin Pagar
//
////////////////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    private:
        int *Arr;
        int iSize;

    public:
        //parameterised Constructor with default Argument
        ArrayX(int X = 5)
        {
            iSize = X;                      
            Arr = new int[iSize];
        }        

        ~ArrayX()
        {
            delete []Arr;          
        } 
        
        void Accept()
        {
            cout<<"Enter the Elements : \n";
            int iCnt = 0;

            for(iCnt = 0 ; iCnt < iSize ; iCnt++)
            {
                cin>>Arr[iCnt];
            }
        }
        int SumEvenOdd()
        {
            int iCnt = 0;
            int iEvenSum = 0 , iOddSum = 0;

            for(int iCnt = 0 ; iCnt < iSize ; iCnt++)
            {
                if(Arr[iCnt] % 2 == 0)
                {
                    iEvenSum += Arr[iCnt];
                }
                else
                {
                    iOddSum += Arr[iCnt];
                }
            }
            return (iEvenSum - iOddSum);
        }
};

int main()
{
    
    ArrayX *aobj = NULL;
    int iLength = 0;
    int iRet = 0 ;

    cout<<"Enter the number of Elements : \n";
    cin>>iLength;

    aobj = new ArrayX(iLength);

    aobj->Accept();
    iRet = aobj->SumEvenOdd();
    cout<<"Difference between summation of even and odd elements is : "<<iRet<<endl;
    
    delete aobj;
    
    return 0;
}

////////////////////////////////////////////////////////////////////////////////////////////
//
// Input : 5 2 3 4 5 6
// Output : 4
//
////////////////////////////////////////////////////////////////////////////////////////////