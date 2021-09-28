class Humanbeing{
float height=5.5f;

static void eating(){
System.out.println("this is static method");
}

void sleeping(){
this.eating();
System.out.println("Height is "+height);
}

}