class SaloonRunner{
public static void main(String args[])
{
Saloon saloon=new Saloon();
saloon.name="Green Trends";
saloon.location="BTM";
saloon.openTime=9.0f;
saloon.closeTime=9.0f;
saloon.branch=SaloonBranch.BTM;

Saloon saloon1=new Saloon();
saloon1.name="Green Trends";
saloon1.location="BTM";
saloon1.openTime=9.0f;
saloon1.closeTime=8.0f;
saloon1.branch=SaloonBranch.BTM;

saloon.haircut();
saloon1.haircut();
}

}