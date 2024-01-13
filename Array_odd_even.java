import java.util.Scanner;
class Array_odd_even
{
public static void main(String []args)
{
Scanner kal=new Scanner(System.in);
int int_arr[]=new int[5];
System.out.println("Enter the elements of int array");
for(int i=0;i<int_arr.length;i++)
{
int_arr[i]=kal.nextInt();
}

for(int j=0;j<int_arr.length;j++)
{
System.out.println("The value"+j+"index is "+int_arr[j]);

if(j%2==0)
{
System.out.println("It is a even number");
}
else
{
System.out.println("It is a odd number");
}
}

}
}