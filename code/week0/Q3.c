/**
* Q3.c
* @author bulbasaur
* @description 
* @created 2020-09-21T19:18:37.947Z+08:00
* @copyright None 
* None
* @last-modified 2020-09-21T19:34:21.979Z+08:00
*/

#include <stdio.h>
int main(int argc, char const *argv[])
{
    int startN, endN;
    int count = 0;
    
    // input the start number and end number
    printf("Please input two integers(start and end numbers), please keep the start integer is always less than the end integer!\n");
    printf("-------------------------------------------------\n");
    printf("Enter the start integer: ");
    scanf("%d", &startN);
    printf("Enter the end integer: ");
    scanf("%d", &endN);

    // test
    // printf("%d %d", startN, endN);

    count = endN - startN;
    
    // test
    // printf("%d", count);

    
    /* print every integers between start number and end number */    
    for (int num = startN; num < endN; num++)
    {
        /* get and print every wanted integers */
        printf("%d\t", num);
    }
    
    
    
    printf("\n");
    
    return 0;
}
