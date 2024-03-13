/* #include <stdio.h>
#include <math.h>
int main()
{
  float a,b,c,s,Area,perimeter;
  a=1;//use 
  b=2;
  c=3;
  s=a+b+c/2;
  perimeter=a+b+c*a+b+c;
  Area=sqrt(s+(s-a)*(s-b)*(s-c));
  printf("the perimeter of the traingle is =%f",perimeter);
   printf("\nthe Area  of the traingle is =%f",Area);



    return 0;

} */
 #include <stdio.h>
/* int main( void )
{
int num1,num2,num3, num4;
num1 = 100 ; num2 = 200 ;
num2= ++num1;
num3= num2--/2;
num4 = printf(" %-10d ", ++num1 ) + ++num2;
printf("%10d\t",num3);
printf("%-10d",num4);
return 0;
} */
int main( void )
{
int num1 = 0, num2 = -1 , num3 = -2, num4 = 1, ans;
ans = num1++ || num2++ && ++num4 || num3++;
printf("%d %d %d %d %d",num1,num2,num3,num4,ans);
return 0;
} //    1        0          2        -1  
