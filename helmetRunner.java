class helmetRunner{
public static void main(String a[]){
helmet h=new helmet();
h.name="Studds";
h.weight=3.13f;
h.thick=true;
h.color="black";
h.type=HelmetType.FULLFACE; 

helmet h1=new helmet();
h1.name="ktm";
h1.weight=2.13f;
h1.thick=true;
h1.color="black and ornge";
h1.type=HelmetType.MODULAR; 

h.protect();
System.out.println();
h1.protect();
System.out.println();
h.precaution();

}

}