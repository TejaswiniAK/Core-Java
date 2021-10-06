class IpodRunner{
public static void main(String args[]){
Ipod ipod=new Ipod();
ipod.name="apple";
ipod.brightness="medium";
ipod.contrast="500";
ipod.fingerprint=true;
ipod.inch=5.6f;

Ipod ipod1=new Ipod();
ipod1.name="apple";
ipod1.brightness="high";
ipod1.contrast="5870";
ipod1.fingerprint=false;
ipod1.inch=8.6f;

ipod.music();
ipod.video();
System.out.println();

ipod1.music();
ipod1.video();
}

}