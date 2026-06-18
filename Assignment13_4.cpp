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
//  Function name : Display
//                  Accept
//  Input :         int
//  Output :        void
//  Description :   write a program which accept number from user and display all such elements which are divisible by 3 and 5 
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
        void Display()
        {
            int iCnt = 0;

            for(int iCnt = 0 ; iCnt < iSize ; iCnt++)
            {
                if(Arr[iCnt] % 3 == 0 && Arr[iCnt] % 5 == 0)
                {
                    cout<<Arr[iCnt]<<" ";
                }
                
            }
        }
};

int main()
{
    
    ArrayX *aobj = NULL;
    int iLength = 0;

    cout<<"Enter the number of Elements : \n";
    cin>>iLength;

    aobj = new ArrayX(iLength);

    aobj->Accept();
    cout<<"Elements divisible by 3 and 5 are : ";
    aobj->Display();
    cout<<endl;
    
    delete aobj;
    
    return 0;
}

////////////////////////////////////////////////////////////////////////////////////////////
//
// Input : 34 56 45 76 70 89 90
// Output : 45 90
//
////////////////////////////////////////////////////////////////////////////////////////////