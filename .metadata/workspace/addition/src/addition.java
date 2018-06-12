import java.util.Scanner;


public class addition {
int x=2;
int y=7;
static Scanner sc=new Scanner(System.in);
static int addtitionWithParameters(int a,int b){
int c=a+b;
return c;
}
static void additionWithoutParameters(){
int a,b,c;
System.out.print("Ënter value of a\t:");
a=sc.nextInt();
System.out.print("Ënter value of b\t:");
b=sc.nextInt();
c=a+b;
System.out.println("Call by value a+b= "+c);
}
void additionByObjectReference(){
	int c=this.x+this.y;
System.out.println("Call by reference a+b= "+c);
}
public static void main(String args[]){
	addition A= new addition();
System.out.println(addtitionWithParameters(1,3));
additionWithoutParameters();
A.additionByObjectReference();
}}
