class shape 
{
void square(double a)
{
double area = a*a;
System.out.println(area);
}
void rectangle(double l , double b)
{
double area = l*b;
System.out.println(area);
}
public static void main(String[]args)
{
shape sh1=new shape();
shape sh2=new shape();
sh1.square(3);
sh2.rectangle(4,5);
}
}