/**
 * C program to find sum of all elements of array 
**/

#include <stdio.h>
#include <stdlib.h>

/*Sum of the array*/
void sum_array(int arr[], int n)
{
    int i,sum = 0;
     /**
     * Add each array element to sum
     **/
    for(i = 1; i <= n; i++)
    {
        sum += arr[i];
    }

    /** 
    *  Displaying the sum of the 
    *  elements of the array given 
    *  by the user.
    **/
    printf("\nSum of all elements of array = %d", sum);
}


/*The driver code*/
int main()
{
    int *arr,n,i;

    /* Input size of the array */
    printf("Enter size of the array: ");
    scanf("%d", &n);
    
    /*dynamic memory allocation*/
    arr=(int *)malloc(n*sizeof(int));

    /* Input elements in array */
    printf("Enter %d elements in the array: ", n);
    for(i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }

    /*Function call*/
    sum_array(arr,n);

    return (0);
}
