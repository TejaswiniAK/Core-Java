class IceCream{
String flavour="Butter Scoch";//Literal
Color color=Color.BLACK;//Literal
float temp;//constant...
String type;//ref...
Brand brand;//ref...

IceCream(float temp){
	this.temp=temp;
}

IceCream(float temp,String flavour,Color color){
	this(temp);
	this.flavour=flavour;
	this.color=color;
}
}