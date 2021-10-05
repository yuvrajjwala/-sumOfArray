#include<stdio.h>
void main()
{
	float num1,num2,num3;
	printf("Enter three numbers :: ");
	scanf("%f%f%f",&num1,&num2,&num3);
	if(num1==num2&&num1==num3)
	{
		printf("The given three numbers are equal\n");
	}
	else if(num1>=num2&&num1>=num3)
	{
		printf("The maximum number among given three numbers is :: %f\n",num1);
	}
	else if(num2>=num3&&num2>=num1)
	{
		printf("The maximum number among given three numbers is :: %f\n",num2);
	}
	else if(num3>=num1&&num3>=num2)
	{
		printf("The maximum number among given three numbers is :: %f\n",num3);
	}
}
