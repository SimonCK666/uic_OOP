/**
* Q6.c
* @author bulbasaur
* @description 
* @created 2020-09-22T10:48:25.983Z+08:00
* @copyright None 
* None
* @last-modified 2020-09-22T15:16:38.173Z+08:00
*/

#include <stdio.h>
#define MONTHS 12
int main(int argc, char const *argv[])
{
    int day;
    int month;
    int days_in_month[MONTHS] = {31,28,31,30,31,30,31,31,30,31,30,31};
    int i;
    int total_days = 0;
    
    do
    {
        /* code */
        printf("Enter the month: ");
        scanf("%d", &month);
    } while (month < 1 || month > MONTHS);
    
    do
    {
        /* code */
        printf("Enter the day: ");
        scanf("%d", &day);
    } while (day < 1 || day > days_in_month[month - 1]);
    

    for ( i = 0; i < month - 1; i++)
    {
        /* code */
        total_days += days_in_month[i];
    }

    total_days += day;

    printf("%d/%d is the day number %d in the year\n", day, month, total_days);
    
    return 0;
}
