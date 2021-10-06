class Music{
String Song_name="Clasical";
MusicInstruments instruments;
static int Instance=0;
String Music_type;	


Music(MusicInstruments instruments, String Music_type){
Instance++;
this.instruments=instruments;
this.Music_type=Music_type;

}
}