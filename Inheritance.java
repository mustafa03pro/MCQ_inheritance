package com.may29.mcq;

class A1
{
int i;
void display()
{
System.out.println(i);
}
}
class B1 extends A1
{
int j;
void display()
{
System.out.println(j);
}
}
class Inheritance
{
public static void main(String args[])
{
B1 obj = new B1();
obj.i=1;
obj.j=2;
obj.display();
}
}

