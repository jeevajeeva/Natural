# Natural
import java.io.*;
import java.util.*;
public class Natural
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0,sum=0;
int n=sc.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println(n+" Output:"+sum);
}
}
