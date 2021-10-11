class ContractorStarter{
	public static void main(String args[]){
		Contractor contractor=new Contractor();
		contractor.setName("Tejaswini");
		String name=contractor.getName();
		System.out.println(name);
		contractor.setType("Public Contractor");
		String type=contractor.getType();
		System.out.println(type);
		contractor.setEquipments(true);
		boolean equip=contractor.getEquipments();
		System.out.println(equip);
		contractor.setSkills(true);
		boolean skill=contractor.getSkills();
		System.out.println(skill);
		contractor.setSalary(30000.45d);
		double salary=contractor.getSalary();
		System.out.println(salary);
	}
}