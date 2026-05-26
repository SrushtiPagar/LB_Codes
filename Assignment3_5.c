////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////////////////////////////
//  
//  Function name : chkVowel
//  Input :         char
//  Output :        BOOL
//  Description :   Checks if a character is a vowel
//  language :      C
//  Date :          21/05/2026
//  Author :        Srushti Nitin Pagar
//
////////////////////////////////////////////////////////////////////////////////////////////


typedef int BOOL;           //Include library for Boolean
#define TRUE 1
#define FALSE 0

BOOL ChkVowel(char cValue)
{
    if((cValue >= 'a') && (cValue <= 'z'))
    {
        cValue = (cValue - 32);
    }

    if(cValue == 'A' || cValue == 'E' || cValue == 'I' || cValue == 'O' ||cValue == 'U')
    {
        return TRUE;
    }
    else
    { 
        return FALSE;
    }
}

// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept one character from user and check whether that character is vowel (a,e,i,o,u) or not.
//
///////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter character : ");
    scanf("%c" , &cValue);

    bRet = ChkVowel(cValue);

    if(bRet == TRUE)
    {
        printf("%c is Vowel", cValue);
    }
    else
    {
        printf("%c is NOT a Vowel", cValue  );
    }

    return 0;
}
///////////////////////////////////////////////////////////////////////////////////////////////
// /  Input : a
// /  Output : a is Vowel
// /
///////////////////////////////////////////////////////////////////////////////////////////////