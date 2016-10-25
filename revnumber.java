import java.io.*;
import java.util.*;
class revnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,revnum=0,rem=0;
System.out.println("Enter number:");
num=sc.nextInt();
while(num>0)
{
rem=num%10;
revnum=(revnum*10)+rem;
num=num/10;
}
System.out.println(revnum);
}
}
