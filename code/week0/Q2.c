/**
* Q2.c
* @author bulbasaur
* @description 
* @created 2020-09-21T19:05:38.149Z+08:00
* @copyright None 
* None
* @last-modified 2020-09-21T19:17:25.870Z+08:00
*/

#include <stdio.h>

// Define the function
float abs_m(float a);

int main(int argc, char const *argv[])
{
    float a, result;
    
    // input the number
    printf("Enter a floating-point number: ");
    scanf("%f", &a);

    // test
    // printf("%f", a);

    // call the function
    result = abs_m(a);
    
    // print the result
    printf("The absolute value of %f is %f", a, result);
    
    return 0;
}

float abs_m(float a) {
    float res;
    // Get the absolute value of a
    if (a < 0)
    {
        /* get the -a */
        res = -a;
    } else
    {
        /* keep the original a */
        res = a;
    }
    
    return res;
}