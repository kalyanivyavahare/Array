import java.util.Scanner;
class Array_char_vowel
{
public static void main(String []args)
{

Scanner kal=new Scanner(System.in);
char char_arr[]=new char[5];
System.out.println("Enter the elements of char array");

for(int i=0;i<char_arr.length;i++)
{
char_arr[i]=kal.next().charAt(0);
}
int count=0;
for(int j=0;j<char_arr.length;j++)
{

if(char_arr[j]=='a'||char_arr[j]=='e'||char_arr[j]=='i'||char_arr[j]=='o'||char_arr[j]=='u')
{
count++;
}
}
System.out.println("number or vowel in given array is:"+count);
}
}