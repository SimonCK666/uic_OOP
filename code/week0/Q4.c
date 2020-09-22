/**
* Q4.c
* @author bulbasaur
* @description 
* @created 2020-09-21T19:36:51.596Z+08:00
* @copyright None 
* None
* @last-modified 2020-09-22T10:39:03.806Z+08:00
*/

#include <stdio.h>
#define SIZE 1000
int main(int argc, char const *argv[])
{
    // float a, b, c;
    int count;
    float res = 1;

    // input numbers
    printf("How many floating point numbers do you want to multiply toger: ");
    scanf("%d", &count);
    
    float num[SIZE];
    for (int i = 0; i < count; i++)
    {
        /* input the number */
        printf("Enter a floating point number: ");
        scanf("%f", &num[i]);
        // printf("\n");
    }
    
    // test
    // for (int i = 0; i < count; i++)
    // {
    //     /* code */
    //     printf("%f", num[i]);
    // }
    // printf("\n");
    
    for (int j = 0; j < count; j++)
    {
        /* multiply the numbers */
        res *= num[j];
    }
    
    printf("The product is %f", res);

    return 0;
}
