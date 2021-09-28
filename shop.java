class shop
{
public shop(){
System.out.println("Default constructor");
}

public shop(String Sname)
{
this(5);
System.out.println("para constructor : "+Sname);
}

public shop(int id)
{
this();
Systrm.out.println("para constructor > "+id);
}

public static void main(String[] a)
{
shop obj=new shop("Sangeeta");
shop obj1=new shop(11);
}

}