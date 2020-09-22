/**
* Q1.c
* @author bulbasaur
* @description 
* @created 2020-09-21T18:58:42.835Z+08:00
* @copyright None 
* None
* @last-modified 2020-09-21T19:03:53.570Z+08:00
*/

#include <stdio.h>
int main(int argc, char const *argv[])
{
    int a, b;
    
    // input numbers
    printf("Enter the first integer: ");
    scanf("%d", &a);
    printf("Enter the second integer: ");
    scanf("%d", &b);

    // test
    printf("%d %d", a, b);

    // judge whether the input numbers are positive
    if (a >= 0 && b >= 0)
    {
        /* condition */
        printf("The integers %d and %d are both positive", a, b);
    } else
    {
        /* condition */
        printf("The integers %d and %d are not both positive", a, b);
    }
    
    
    
    return 0;
}
