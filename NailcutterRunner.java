class NailcutterRunner{
public static void main(String[] a)
{
NailCutter obj=new NailCutter();
obj.name="Green Bell G-1008";
obj.sharpness=true;
obj.rate=55.66f;
obj.material="Stainless steel";
obj.size=NailcutterSize.MEDIUM;

NailCutter obj1=new NailCutter();
obj1.name="Green Bell G-1008";
obj1.sharpness=true;
obj1.rate=55.66f;
obj1.material="Stainless steel";
obj1.size=NailcutterSize.MEDIUM;

obj.Nailcutter();
System.out.println();
obj.Shaper();

obj1.Nailcutter();
System.out.println();
obj1.Shaper();
}

}