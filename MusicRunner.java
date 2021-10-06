class MusicRunner{
	public static void main(String args[]){
		
		MusicInstruments instruments=MusicInstruments.FLUTE;
		String Music_type="Hindustani";
		Music inst=new Music(instruments,Music_type);
		
		System.out.println(inst.instruments);
		System.out.println(inst.Music_type);
		System.out.println(inst.Song_name);
		System.out.println(inst.Instance);
		
	}
}