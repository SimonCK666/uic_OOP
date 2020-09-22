/**
* Q4.c
* @author bulbasaur
* @description 
* @created 2020-09-21T19:36:51.596Z+08:00
* @copyright None 
* None
* @last-modified 2020-09-22T15:14:31.334Z+08:00
*/

#include <stdio.h>
#define SIZE 5
// define the function
void array_abs(float num[SIZE]);

int main(int argc, char const *argv[])
{
    // float a, b, c;
    float num[SIZE], result[SIZE];
    for (int i = 0; i < SIZE; i++)
    {
        /* input the number */
        printf("Enter a floating point number: ");
        scanf("%f", &num[i]);
        // printf("\n");
    }
    
    // test
    for (int i = 0; i < SIZE; i++)
    {
        /* code */
        printf("%f\t", num[i]);
    }
    printf("\n");
    
    // call the function
    array_abs(num);

    printf("The result is: ");
    for (int j = 0; j < SIZE; j++)
    {
        /* code */
        printf("%f\t", num[j]);
    }
    
    printf("\n");

    return 0;
}


void array_abs(float num[SIZE]) {
    for (int i = 0; i < SIZE; i++)
    {
        /* go through the array */
        if (num[i] < 0)
        {
            /* get the -num[i] */
            num[i] = -num[i];
        } else
        {
            /* keep it */
            num[i] = num[i];
        }
        
    }
    
    // return res[SIZE];
}