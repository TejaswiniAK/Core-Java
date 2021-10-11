class SocialMediaApp{
	String name,lang,platform;
	int size;
	float version;
	Company1 company;
	
	/* 
		mutater/setter Method... 
		void setVariable_name(dataype parameter)   --> after " 'set' Variable_name should be Capital letter"
		{
			initialization
		}
		
	*/
	
	void setName(String name)
	{
		this.name=name;
	}
	void setLanguage(String lang)
	{
		this.lang=lang;
	}
	void setSize(int size)
	{
		this.size=size;
	}
	void setPlatform(String platform)
	{
		this.platform=platform;
	}
	void setVersion(float version)
	{
		this.version=version;
	}
	void setCompany(Company1 company)
	{
		this.company=company;
	}
}