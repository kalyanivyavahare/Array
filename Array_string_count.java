import java.util.Scanner;
class Array_string_count
{
public static void main(String []args)
{

Scanner kal=new Scanner(System.in);
String str_arr[]=new String[5];
System.out.println("Enter the elements of String array");

for(int i=0;i<str_arr.length;i++)
{
str_arr[i]=kal.next();
}
int count=0;
for(int j=0;j<str_arr.length;j++)
{
if(str_arr[j].length()%2==0)
{
System.out.println(str_arr[j]);
count++;
}
}
System.out.println("Number of even numbre of String"+count);
}
}