package com.xworkz.heirarchy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionOperations {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();

		String festivals1 = "English New Year";
		String festivals2 = "Masik Shivaratri";
		String festivals3 = "National Youth Day";
		String festivals4 = "Swami Vivekananda Jayanti";
		String festivals5 = "Lohri";
		String festivals6 = "Hanuman Jayanti (Tamil)";
		String festivals7 = "Makar Sankranti";
		String festivals8 = "Pongal";
		String festivals9 = "Guru Gobind Singh Jayanti";
		String festivals10 = "Netaji Subhash Chandra Bose Jayanti";
		String festivals11 = "Republic Day";
		String festivals12 = "Mahatma Gandhi Punyatithi";
		String festivals13 = "Birthday of Guru Har Rai ";
		String festivals14 = "World Cancer Day";
		String festivals15 = "Mauni Amavasya";
		String festivals16 = "Valentine's Day";
		String festivals17 = "Vasant Panchami";
		String festivals18 = "Hazarat Ali's Birthday";
		String festivals19 = "Purim";
		String festivals20 = "Sant Ravidas Jayanti";
		String festivals21 = "World Womens Day";
		String festivals22 = "Mahashivratri";
		String festivals23 = "Losar";
		String festivals24 = "Mothering Sunday";
		String festivals25 = "Navroz";
		String festivals26 = "Shaheed Diwas";
		String festivals27 = "Passover";
		String festivals28 = "Chhoti Holi , Holika Dahan";
		String festivals29 = "Holi";
		String festivals30 = "Hola Mohalla";
		String festivals31 = "Rabindranath Tagore Jayanti";
		String festivals32 = "Mother's Day";
		String festivals33 = "Eid-Ul-Fitr, Ramadan Ends";
		String festivals34 = "Akshaya Tritiya";
		String festivals35 = "Parshuram Jayanti";
		String festivals36 = "Shavuot";
		String festivals37 = "Birthday of Guru Amar Das (Nanakshahi calendar)";
		String festivals38 = "Buddha Purnima";
		String festivals39 = "World No Tobacco Day";
		String festivals40 = "Telugu Hanuman Jayanthi";
		String festivals41 = "World Environment Day";
		String festivals42 = "World Brain Tumor Day";
		String festivals43 = "Maharana Pratap Jayanti";
		String festivals44 = "Father's Day";
		String festivals45 = "Ganga Dussehra";
		String festivals46 = "Hemis Gompa";
		String festivals47 = "International Yoga Day";
		String festivals48 = "Sant Kabirdas Jayanti";
		String festivals49 = "Birthday of Guru Hargobind ";
		String festivals50 = "Masik Shivaratri";
		String festivals51 = "Rath Yatra";
		String festivals52 = "Parents Day";
		String festivals53 = "Friendship Day";
		String festivals54 = "Hariyali Teej";
		String festivals55 = "Nag Panchami";
		String festivals56 = "Independence Day";
		String festivals57 = "Tulsidas Jayanti";
		String festivals58 = "Muharram Begins";
		String festivals59 = "Onam";
		String festivals60 = "Hartalika Teej";

		collection.add(festivals1);
		collection.add(festivals2);
		collection.add(festivals3);
		collection.add(festivals4);
		collection.add(festivals5);
		collection.add(festivals6);
		collection.add(festivals7);
		collection.add(festivals8);
		collection.add(festivals9);
		collection.add(festivals10);
		collection.add(festivals11);
		collection.add(festivals12);
		collection.add(festivals13);
		collection.add(festivals14);
		collection.add(festivals15);
		collection.add(festivals16);
		collection.add(festivals17);
		collection.add(festivals18);
		collection.add(festivals19);
		collection.add(festivals20);
		collection.add(festivals21);
		collection.add(festivals22);
		collection.add(festivals23);
		collection.add(festivals24);
		collection.add(festivals25);
		collection.add(festivals26);
		collection.add(festivals27);
		collection.add(festivals28);
		collection.add(festivals29);
		collection.add(festivals30);
		collection.add(festivals31);
		collection.add(festivals32);
		collection.add(festivals33);
		collection.add(festivals34);
		collection.add(festivals35);
		collection.add(festivals36);
		collection.add(festivals37);
		collection.add(festivals38);
		collection.add(festivals39);
		collection.add(festivals40);
		collection.add(festivals41);
		collection.add(festivals42);
		collection.add(festivals43);
		collection.add(festivals44);
		collection.add(festivals45);
		collection.add(festivals46);
		collection.add(festivals47);
		collection.add(festivals48);
		collection.add(festivals49);
		collection.add(festivals50);
		collection.add(festivals51);
		collection.add(festivals52);
		collection.add(festivals53);
		collection.add(festivals54);
		collection.add(festivals55);
		collection.add(festivals56);
		collection.add(festivals57);
		collection.add(festivals58);
		collection.add(festivals59);
		collection.add(festivals60);

		Iterator<String> irt = collection.iterator();
		// System.out.println(irt.hasNext());
		// System.out.println(irt.next());

		while (irt.hasNext()) {
			System.out.println(irt.next());
		}

		int total1 = collection.size();
		System.out.println("Total festivals = " + total1);

		System.out.println("Removed element is : ".concat(String.valueOf(collection.remove(festivals30))));
		// collection.remove(festivals30);

		int total = collection.size();
		System.out.println("Total elements after remove festivals = " + total);

		boolean contain = collection.contains(festivals10);
		System.out.println(contain);

		boolean emptyOrNot = collection.isEmpty();
		System.out.println(emptyOrNot);

		// collection.clear();

		System.out.println(collection.size());

		System.out
				.println("--------------------------Actors----------------------------------------------------------");

		Collection<String> actors = new ArrayList<String>();

		actors.add("A. K. Hangal");
		actors.add("Aamir Bashir");
		actors.add("Aamir Khan");
		actors.add("Aanjjan Srivastav");
		actors.add("Aasif Sheikh");
		actors.add("Abhinav Shukla");
		actors.add("Abhishek Bachchan");
		actors.add("Abhay Deol");
		actors.add("Achyut Potdar");
		actors.add("Adi Irani");
		actors.add("Adil Hussain");
		actors.add("Aditya Kumar");
		actors.add("Aditya Seal");
		actors.add("Aditya Shrivastava");
		actors.add("Aftab Shivdasani");
		actors.add("Ahan Shetty");
		actors.add("Aanjjan Srivastav");
		actors.add("Ajay Devgan");
		actors.add("Abhinav Shukla");
		actors.add("Abhishek Bachchan");
		actors.add("Ajit");
		actors.add("Ajith Kumar");
		actors.add("Ajinkya Deo");
		actors.add("Akhilendra Mishra");
		actors.add("Akshay Kumar");
		actors.add("Akshaye Khanna");
		actors.add("Ali Asgar");
		actors.add("Ali Fazal");
		actors.add("Alok Nath");
		actors.add("Amit Mistry");

		actors.add("A. K. Hangal");
		actors.add("Aamir Bashir");
		actors.add("Aamir Khan");
		actors.add("Aanjjan Srivastav");
		actors.add("Aasif Sheikh");
		actors.add("Abhinav Shukla");
		actors.add("Abhishek Bachchan");
		actors.add("Abhay Deol");
		actors.add("Achyut Potdar");
		actors.add("Adi Irani");
		actors.add("Adil Hussain");
		actors.add("Aditya Kumar");
		actors.add("Aditya Seal");
		actors.add("Aditya Shrivastava");
		actors.add("Aftab Shivdasani");
		actors.add("Ahan Shetty");
		actors.add("Aanjjan Srivastav");
		actors.add("Ajay Devgan");
		actors.add("Abhinav Shukla");
		actors.add("Abhishek Bachchan");
		actors.add("Ajit");
		actors.add("Ajith Kumar");
		actors.add("Ajinkya Deo");
		actors.add("Akhilendra Mishra");
		actors.add("Akshay Kumar");
		actors.add("Akshaye Khanna");
		actors.add("Ali Asgar");
		actors.add("Ali Fazal");
		actors.add("Alok Nath");
		actors.add("Amit Mistry");

		int total2 = actors.size();
		System.out.println("total actors = " + total2);

		Iterator<String> irtact = actors.iterator();

		while (irtact.hasNext()) {
			System.out.println(irtact.next());
		}

		int totalact = actors.size();
		System.out.println("Total actors = " + totalact);

		// actors.remove("Amit Mistry");
		System.out.println("Removed element is : ".concat(String.valueOf(actors.remove("Amit Mistry"))));

		int totalaft = actors.size();
		System.out.println("Total elements after remove festivals = " + totalaft);

		boolean containAct = actors.contains("Alok Nath");
		System.out.println(containAct);

		boolean emptyOrNotAct = actors.isEmpty();
		System.out.println(emptyOrNotAct);

		actors.clear();

		System.out.println(actors.size());

		System.out.println("-----------------------------------Language---------------------------------------------");

		Collection<String> lang = new ArrayList<String>();

		lang.add("Mandarin Chinese");
		lang.add("Spanish");
		lang.add("English");
		lang.add("Hindi");
		lang.add("Bengali");
		lang.add("Portuguese");
		lang.add("Russian");
		lang.add("Japanese");
		lang.add("Western Punjabi");
		lang.add("Marathi");
		lang.add("Kannada");
		lang.add("Indonesian");
		lang.add("Polish");
		lang.add("Yoruba");
		lang.add("French");
		lang.add("German ");
		lang.add("Vietnamese");
		lang.add("Tamil");
		lang.add("Yue Chinese");
		lang.add("Urdu");
		lang.add("Javanese");
		lang.add("Italian");
		lang.add("Egyptian Arabic");
		lang.add("Gujarati");
		lang.add("Iranian Persian");
		lang.add("Bhojpuri");
		lang.add("Southern Min");
		lang.add("Hakka");
		lang.add("Jin Chinese");

		lang.add("Hausa");
		lang.add("Mandarin Chinese");
		lang.add("Spanish");
		lang.add("English");
		lang.add("Hindi");
		lang.add("Bengali");
		lang.add("Portuguese");
		lang.add("Russian");
		lang.add("Japanese");
		lang.add("Western Punjabi");
		lang.add("Marathi");
		lang.add("Telugu");
		lang.add("Wu Chinese");
		lang.add("Turkish");
		lang.add("Korean");
		lang.add("French");
		lang.add("German ");
		lang.add("Vietnamese");
		lang.add("Tamil");
		lang.add("Yue Chinese");
		lang.add("Urdu");
		lang.add("Javanese");
		lang.add("Italian");
		lang.add("Egyptian Arabic");
		lang.add("Gujarati");
		lang.add("Iranian Persian");
		lang.add("Bhojpuri");
		lang.add("Southern Min");
		lang.add("Hakka");
		lang.add("Jin Chinese");
		lang.add("Hausa");

		int total3 = lang.size();
		System.out.println("total languages = " + total3);

		Iterator<String> irtlang = lang.iterator();

		while (irtlang.hasNext()) {
			System.out.println(irtlang.next());
		}

		int totalLang = lang.size();
		System.out.println("Total actors = " + totalLang);

		// actors.remove("Amit Mistry");
		System.out.println("Removed element is : ".concat(String.valueOf(lang.remove("Jin Chinese"))));

		int totalAft = lang.size();
		System.out.println("Total elements after remove festivals = " + totalAft);

		boolean containLang = lang.contains("Hakka");
		System.out.println(containLang);

		boolean emptyOrNotLang = lang.isEmpty();
		System.out.println(emptyOrNotLang);

		lang.clear();

		System.out.println(lang.size());

		System.out.println("--------------------------movies------------------------------------------------------");

		Collection<String> movie = new ArrayList<String>();

		movie.add("The Shawshank Redemption");
		movie.add("The Godfather");
		movie.add("The Godfather: Part II");
		movie.add("The Dark Knight");
		movie.add("12 Angry Men");
		movie.add("Schindler's List ");
		movie.add("The Lord of the Rings: The Return of the King");
		movie.add("Pulp Fiction");
		movie.add("The Good, the Bad and the Ugly");
		movie.add(" The Lord of the Rings: The Fellowship of the Ring");
		movie.add("Fight Club");
		movie.add(" Forrest Gump");
		movie.add("Inception");
		movie.add("The Lord of the Rings: The Two Towers ");
		movie.add(" Star Wars: Episode V - The Empire Strikes Back");
		movie.add("The Matrix ");
		movie.add("Goodfellas");
		movie.add("One Flew Over the Cuckoo's Nest");
		movie.add("Yue Chinese");
		movie.add("Seven Samurai");
		movie.add(" Seven ");
		movie.add("The Silence of the Lambs");
		movie.add("City of God");
		movie.add("Life Is Beautiful");
		movie.add(" It's a Wonderful Life");
		movie.add("Saving Private Ryan");
		movie.add("Star Wars: Episode IV - A New Hope");
		movie.add("Interstellar");
		movie.add("Spirited Away");
		movie.add("The Green Mile");

		movie.add("Leon");
		movie.add("Parasite");
		movie.add(" Harakiri ");
		movie.add("The Pianist");
		movie.add("Terminator 2: Judgment Day");
		movie.add("Back to the Future ");
		movie.add("The Usual Suspects");
		movie.add("Psycho");
		movie.add("The Lion King");
		movie.add("Modern Times");
		movie.add("American History X");
		movie.add("Grave of the Fireflies");
		movie.add("City Lights");
		movie.add("Whiplash");
		movie.add("Gladiator ");
		movie.add("The Departed ");
		movie.add("Untouchable");
		movie.add("The Prestige ");
		movie.add("Yue Chinese");
		movie.add("Once Upon a Time in the West");
		movie.add("Rear Window");
		movie.add("Cinema Paradiso");
		movie.add("Egyptian Arabic");
		movie.add("Alien ");
		movie.add("Apocalypse Now ");
		movie.add(" Memento");
		movie.add(" Raiders of the Lost Ark ");
		movie.add("The Great Dictator");
		movie.add("The Lives of Others");
		movie.add("Django Unchained");

		Iterator<String> irtMovie = movie.iterator();

		while (irtMovie.hasNext()) {
			System.out.println(irtMovie.next());
		}

		int total4 = movie.size();
		System.out.println("==================total movies = " + total4);

		// actors.remove("Amit Mistry");
		System.out.println("Removed element is : ".concat(String.valueOf(movie.remove("The Green Mile"))));

		int totalAfter = movie.size();
		System.out.println("Total elements after remove movie = " + totalAfter);

		boolean containMovies = movie.contains("The Lives of Others");
		System.out.println(containMovies);

		boolean emptyOrNotMovie = movie.isEmpty();
		System.out.println(emptyOrNotMovie);

		movie.clear();

		System.out.println(movie.size());

		System.out.println("------------------------web Series--------------------------------------------");

		Collection<String> webSeries = new ArrayList<String>();

		webSeries.add("Scam 1992");
		webSeries.add("Aarya ");
		webSeries.add("Special Ops");
		webSeries.add("Paatal Lok ");
		webSeries.add("Bandish Bandits");
		webSeries.add("A Simple Murder");
		webSeries.add("Flesh ");
		webSeries.add("Panchayat ");
		webSeries.add("The Gone Game");
		webSeries.add("Asur ");

		webSeries.add(" What If�?");
		webSeries.add("Money Heist");
		webSeries.add("Kota Factory");
		webSeries.add("Mumbai Diaries 26/11");
		webSeries.add("Lucifer");
		webSeries.add(" Into the Night");
		webSeries.add("Rick and Morty");
		webSeries.add(" Criminal Justice ");
		webSeries.add(" Roar of the Lion");
		webSeries.add(" Modi: Journey of A Common Man");

		webSeries.add("Hostages");
		webSeries.add("Kailasapuram ");
		webSeries.add("Water Bottle");
		webSeries.add("Kaafir");
		webSeries.add("Mrs.Subbalakshmi ");
		webSeries.add("Kaali");
		webSeries.add("Abhay");
		webSeries.add("High Priestess");
		webSeries.add("America Mappillai ");
		webSeries.add("The Final Call");

		webSeries.add("Parchayee ");
		webSeries.add("Life Sahi Hai");
		webSeries.add("Akoori ");
		webSeries.add("Table no. 5 ");
		webSeries.add("Rangbaaz");
		webSeries.add("Date with saie");
		webSeries.add("Babbar Ka Tabbar ");
		webSeries.add("B. Tech");
		webSeries.add("Barot House ");
		webSeries.add("Bombers");

		webSeries.add("Hutatma ");
		webSeries.add("Posham Pa");
		webSeries.add("RejctX ");
		webSeries.add("Bhinna ");
		webSeries.add("Fingertip ");
		webSeries.add("Kailasapuram ");
		webSeries.add("Out of Love ");
		webSeries.add("Jodha Akbar");
		webSeries.add(" Asur: Welcome to Your Dark Side");
		webSeries.add("The Raikar Case");

		webSeries.add("Illegal - Justice, Out of Order ");
		webSeries.add("Marzi");
		webSeries.add("Your Honor (I) ");
		webSeries.add("Undekhi ");
		webSeries.add("Avrodh the Siege Within");
		webSeries.add("Triples");
		webSeries.add("Geetha Subrahmanyam");
		webSeries.add("Nenu Mee Kalyan");
		webSeries.add("PillA");
		webSeries.add("Muddappappu Avakai.");

		int total5 = webSeries.size();
		System.out.println("total movies = " + total5);

		Iterator<String> irtWeb = webSeries.iterator();

		while (irtWeb.hasNext()) {
			System.out.println(irtWeb.next());
		}

		// actors.remove("Amit Mistry");
		System.out.println("Removed element is : ".concat(String.valueOf(webSeries.remove("The Final Call"))));

		int totalAfte = webSeries.size();
		System.out.println("Total elements after remove movie = " + totalAfte);

		boolean containWeb = webSeries.contains("PillA");
		System.out.println(containWeb);

		boolean emptyOrNotWeb = webSeries.isEmpty();
		System.out.println(emptyOrNotWeb);

		webSeries.clear();

		System.out.println(webSeries.size());

		System.out.println("-----------------------Cities---------------------------------------------------------");

		Collection<String> cities = new ArrayList<String>();

		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Bangalore");
		cities.add("Hyderabad");
		cities.add("Ahmedabad");
		cities.add("Chennai");
		cities.add("Kolkata");
		cities.add("Surat");
		cities.add("Pune");
		cities.add("Jaipur");

		cities.add("Lucknow");
		cities.add("Kanpur");
		cities.add("Nagpur");
		cities.add("Indore");
		cities.add("Thane");
		cities.add("Bhopal");
		cities.add("Visakhapatnam");
		cities.add("Pimpri-Chinchwad");
		cities.add("Patna");
		cities.add("Vadodara");

		cities.add("Ghaziabad");
		cities.add("Ludhiana");
		cities.add("Agra");
		cities.add("Coimbatore");
		cities.add("Nashik");
		cities.add("Ranchi");
		cities.add("Faridabad");
		cities.add("Meerut");
		cities.add("Rajkot");
		cities.add("Kalyan-Dombivli");

		cities.add("Vasai-Virar");
		cities.add("Varanasi");
		cities.add("Srinagar");
		cities.add("Aurangabad");
		cities.add("Dhanbad");
		cities.add("Gurgaon");
		cities.add("Amritsar");
		cities.add("Navi Mumbai");
		cities.add("Allahabad");
		cities.add("Howrah");

		cities.add("Gwalior");
		cities.add("Jabalpur");
		cities.add("Vijayawada");
		cities.add("Jodhpur");
		cities.add("Salem");
		cities.add("Madurai");
		cities.add("Raipur");
		cities.add("Kota");
		cities.add("Chandigarh");
		cities.add("Guwahati");

		cities.add("Solapur");
		cities.add("Hubli�Dharwad");
		cities.add("Mysore");
		cities.add("Tiruchirappalli");
		cities.add("Bareilly");
		cities.add("Aligarh");
		cities.add("Tiruppur");
		cities.add("Moradabad");
		cities.add("Jalandhar");
		cities.add("Bhubaneswar");

		Iterator<String> irtCities = cities.iterator();

		while (irtCities.hasNext()) {
			System.out.println(irtCities.next());
		}

		int total6 = cities.size();
		System.out.println("total cities = " + total6);

		// actors.remove("Amit Mistry");
		System.out.println("Removed element is : ".concat(String.valueOf(cities.remove("Kalyan-Dombivli"))));

		int totalAfterCity = cities.size();
		System.out.println("Total elements after remove movie = " + totalAfterCity);

		boolean containCity = cities.contains("Hubli�Dharwad");
		System.out.println(containCity);

		boolean emptyOrNotCity = cities.isEmpty();
		System.out.println(emptyOrNotCity);

		cities.clear();

		System.out.println(cities.size());

		System.out.println("------------------------Sweets--------------------------------------------------------");

		Collection<String> sweets = new ArrayList<String>();

		sweets.add("Aamras");
		sweets.add("Peda");
		sweets.add("Carrot Halwa (Gajar ka Halwa)");
		sweets.add("Kaju Katli");
		sweets.add("Gulab Jamun");
		sweets.add("Ladoo");
		sweets.add("Kulfi");
		sweets.add("Modaks");
		sweets.add("Puran Poli");
		sweets.add("Jalebi");

		sweets.add("Kheer");
		sweets.add("Rasgulla");
		sweets.add("Nankhatai");
		sweets.add("Rabdi");
		sweets.add("Barfi");
		sweets.add("Lassi");
		sweets.add("Shrikhand");
		sweets.add("Shahi Tukra");
		sweets.add("Basundi");
		sweets.add("Sandesh");

		sweets.add("Pistachio Ice-Cream");
		sweets.add("Petha");
		sweets.add("Sheera");
		sweets.add("Unni Appam");
		sweets.add("Shankarpali");
		sweets.add("Dhondas");
		sweets.add("Doodhpak");
		sweets.add("Sutar Feni");
		sweets.add("Sohan Papdi");
		sweets.add("Anarsa");

		sweets.add("Poornalu");
		sweets.add("Mysore Pak");
		sweets.add("Pootharekulu");
		sweets.add("Palathalikalu");
		sweets.add("Kuzhi Paniyaram");
		sweets.add("Gavvalu");
		sweets.add("Dharwad Pedha");
		sweets.add("Ada");
		sweets.add("Adhirasam");
		sweets.add("Balushahi");

		sweets.add("Boondi");
		sweets.add("Ghevar");
		sweets.add("Imarti");
		sweets.add("Kalakand");
		sweets.add("Malpua");
		sweets.add("Ras Malai");
		sweets.add("Singori");
		sweets.add("Chhena Poda");
		sweets.add("Ledikeni");
		sweets.add("Lyangcha");

		sweets.add("Misti Dahi");
		sweets.add("Pantua");
		sweets.add("Pithe");
		sweets.add("Rasabali");
		sweets.add("Ariselu");
		sweets.add("Kakinada Khaja");
		sweets.add("Khira Sagara");
		sweets.add("Cham Cham");
		sweets.add("Chenna Gaja");
		sweets.add("Sukhdi");

		Iterator<String> irtSweets = sweets.iterator();

		while (irtSweets.hasNext()) {
			System.out.println(irtSweets.next());
		}

		int total7 = sweets.size();
		System.out.println("total cities = " + total7);

		// actors.remove("Amit Mistry");
		System.out.println("Removed element is : ".concat(String.valueOf(sweets.remove("Anarsa"))));

		int totalAfterSweet = sweets.size();
		System.out.println("Total elements after remove movie = " + totalAfterSweet);

		boolean containSweet = sweets.contains("Ariselu");
		System.out.println(containSweet);

		boolean emptyOrNotSweet = sweets.isEmpty();
		System.out.println(emptyOrNotSweet);

		sweets.clear();

		System.out.println(sweets.size());

		System.out.println("---------------Bikes-----------------------------------------------------------------");

		Collection<String> bike = new ArrayList<String>();

		bike.add("Aprilia");
		bike.add("BMW");
		bike.add("Ducati");
		bike.add("Harley-Davidson");
		bike.add("Honda");
		bike.add("Indian Motorcycle");
		bike.add("Kawasaki");
		bike.add("KTM");
		bike.add("Royal Enfield");
		bike.add("Suzuki");

		bike.add("Triumph");
		bike.add("Yamaha");
		bike.add("Alcyon");
		bike.add("Automoto");
		bike.add("Ardie");
		bike.add("Alta");
		bike.add("Armstrong");
		bike.add("Blata");
		bike.add("Benelli");
		bike.add("Bimota");

		bike.add("Bultaco");
		bike.add("Balkan");
		bike.add("Bianchi");
		bike.add("Blackburne");
		bike.add("Cagiva");
		bike.add("Carabela");
		bike.add("Casal");
		bike.add("Ceccato");
		bike.add("Cimatti");
		bike.add("Cooper");

		bike.add("Clyno");
		bike.add("Cushman");
		bike.add("Dayun");
		bike.add("Derbi");
		bike.add("Dollar");
		bike.add("D-Rad");
		bike.add("DKW");
		bike.add("Della Ferrera");
		bike.add("Douglas");
		bike.add("Dnepr");

		bike.add("Dresch");
		bike.add("Eso");
		bike.add("Express Werke");
		bike.add("Fantic Motor");
		bike.add("FN");
		bike.add("FB Mondial");
		bike.add("Frera");
		bike.add("Fusi");
		bike.add("FAMEL");
		bike.add("Gilera");

		bike.add("Greeves");
		bike.add("GIMA");
		bike.add("Galbusera");
		bike.add("Gimson");
		bike.add("Horex");
		bike.add("Hecker");
		bike.add("Hercules");
		bike.add("Hodaka");
		bike.add("Husaberg");
		bike.add("Helkama");

		Iterator<String> irtBike = bike.iterator();

		while (irtBike.hasNext()) {
			System.out.println(irtBike.next());
		}

		int total8 = bike.size();
		System.out.println("total bike = " + total8);

		// actors.remove("Amit Mistry");
		System.out.println("Removed element is : ".concat(String.valueOf(bike.remove("Cooper"))));

		int totalAfterBike = bike.size();
		System.out.println("Total elements after remove movie = " + totalAfterBike);

		boolean containBike = bike.contains("Helkama");
		System.out.println(containBike);

		boolean emptyOrNotBike = bike.isEmpty();
		System.out.println(emptyOrNotBike);

		bike.clear();

		System.out.println(bike.size());

		System.out.println("-----------------Cars--------------------------------------------------------------");

		Collection<String> cars = new ArrayList<String>();

		cars.add("Abadal");
		cars.add("Abarth");
		cars.add("Abbott-Detroit");
		cars.add("ABT");
		cars.add("AC");
		cars.add("Acura");
		cars.add("Aixam");
		cars.add("Alfa Romeo");
		cars.add("Alpina");
		cars.add("Alpine");

		cars.add("BAC");
		cars.add("BAIC Motor");
		cars.add("Baojun");
		cars.add("BeiBen");
		cars.add("Bentley");
		cars.add("Berkeley");
		cars.add("Berliet");
		cars.add("Bertone");
		cars.add("Bestune");
		cars.add("BharatBenz");

		cars.add("Cadillac");
		cars.add("CAMC");
		cars.add("Canoo");
		cars.add("Caparo");
		cars.add("Carlsson");
		cars.add("Caterham");
		cars.add("Changan");
		cars.add("Changfeng");
		cars.add("Chery");
		cars.add("Chevrolet");

		cars.add("Dacia");
		cars.add("Daewoo");
		cars.add("DAF");
		cars.add("Daimler");
		cars.add("Dartz");
		cars.add("Datsun");
		cars.add("Dayun");
		cars.add("Delage");
		cars.add("DeSoto");
		cars.add("DINA");

		cars.add("Eagle");
		cars.add("EDAG");
		cars.add("Edsel");
		cars.add("Eicher");
		cars.add("Elemental");
		cars.add("Elfin");
		cars.add("Fioravanti");
		cars.add("Foden");
		cars.add("Ford");
		cars.add("Foton");

		cars.add("Geo");
		cars.add("Gillet");
		cars.add("Ginetta");
		cars.add("Hillman");
		cars.add("Higer");
		cars.add("Holden");
		cars.add("Hongqi");
		cars.add("Hudson");
		cars.add("Hupmobile");
		cars.add("Hudson");

		Iterator<String> irtCar = cars.iterator();

		while (irtCar.hasNext()) {
			System.out.println(irtCar.next());
		}

		int total9 = cars.size();
		System.out.println("total cars = " + total9);

		// actors.remove("Amit Mistry");
		System.out.println("Removed element is : ".concat(String.valueOf(cars.remove("Chevrolet"))));

		int totalAfterCars = cars.size();
		System.out.println("Total elements after remove movie = " + totalAfterCars);

		boolean containCars = cars.contains("Hongqi");
		System.out.println(containCars);

		boolean emptyOrNotCars = cars.isEmpty();
		System.out.println(emptyOrNotCars);

		cars.clear();

		System.out.println(cars.size());

		Collection<String> lipsticks = new ArrayList<String>();

		lipsticks.add("DIOR Rouge Dior Lipstick");
		lipsticks.add("M.A.C Lipstick Matte");
		lipsticks.add("CLINIQUE Almost Lipstick");
		lipsticks.add("M.A.C Lip Pencil");
		lipsticks.add("NARS Semi Matte Lipstick - Schiap");
		lipsticks.add("Chanel Rouge Allure Luminous Intense Lip Colour");
		lipsticks.add("MAC Red Lipstick");
		lipsticks.add("YVES SAINT LAURENT ROUGE PUR COUTURE Lipstick");
		lipsticks.add("M.A.C Lipstick Shine");
		lipsticks.add("NARS Lipstick");

		lipsticks.add("M.A.C Little Lipstick");
		lipsticks.add("Revlon Super Lustrous Lipstick");
		lipsticks.add("M.A.C Lipstick - Nudes");
		lipsticks.add("Tom Ford Lip Color");
		lipsticks.add("NARS Lipstick");
		lipsticks.add("YVES SAINT LAURENT ROUGE PUR COUTURE Lipstick Collection");
		lipsticks.add("GIORGIO ARMANI BEAUTY Rouge D�Armani Lipstick");
		lipsticks.add("Bobbi Brown Lip Color");
		lipsticks.add("FENTY BEAUTY BY RIHANNA Stunna Lip Paint Longwear Fluid Lip Color");
		lipsticks.add("CHARLOTTE TILBURY K.I.S.S.I.N.G Lipstick - Nude Kate");

		lipsticks.add("PAT MCGRATH LABS MatteTrance� Lipstick");
		lipsticks.add("DIOR Rouge Dior Lipstick");
		lipsticks.add("M.A.C Lipstick Matte");
		lipsticks.add("YVES SAINT LAURENT ROUGE PUR COUTURE Lipstick Collection");
		lipsticks.add("NARS Lipstick");
		lipsticks.add("SEPHORA COLLECTION Cream Lip Stain Liquid Lipstick");
		lipsticks.add("Lanc�me L�Absolu Rouge Hydrating Shaping Lipcolor");
		lipsticks.add("Chanel Rouge Allure Luminous Intense Lip Colour");
		lipsticks.add("Rimmel London Lip Stick");
		lipsticks.add("DIOR Rouge Dior Lipstick");

		lipsticks.add("M.A.C Viva Glam Lipstick");
		lipsticks.add("Tom Ford Lip Color");
		lipsticks.add("Lancome ROUGE IN LOVE");
		lipsticks.add("Addict Lip Glow Color Reviving Lip Balm in Ultra Pink");
		lipsticks.add("Tom Ford Lip Color");
		lipsticks.add("Cl� de Peau Beaut� Extra Rich Lipstick Velvet	 Refill");
		lipsticks.add("L�Or�al Paris Colour Riche Lipstick, Fairest Nude");
		lipsticks.add("Rimmel London Lasting Finish by Kate Lipstick");
		lipsticks.add("Kate Lipstick 111 by Rimmel London");
		lipsticks.add("Maybelline Color Sensational Lipstick, Red Revival");

		lipsticks.add("BY TERRY Hyaluronic Sheer Rouge");
		lipsticks.add("Covergirl Lip Perfection Lipstick");
		lipsticks.add("SURRATT BEAUTY");
		lipsticks.add("MARC JACOBS BEAUTY New Nudes Sheer Gel Lipstick");
		lipsticks.add("EST�E LAUDER Pure Color Envy Sculpting Lipstick");
		lipsticks.add("Shiseido Lipstick");
		lipsticks.add("LIPSTICK QUEEN Medieval Lipstick");
		lipsticks.add("TARTE Lippie Lingerie Matte Lip Tint");
		lipsticks.add("Lovebug Lipsticks");
		lipsticks.add("Night Crimson");

		lipsticks.add("Electric Pink");
		lipsticks.add("Lovely Lips");
		lipsticks.add("Fruity Floral");
		lipsticks.add("Berry Blissful");
		lipsticks.add("Magical Lips");
		lipsticks.add("Fluffy Lips");
		lipsticks.add("Cosmic Love");
		lipsticks.add("Blush Romance ");
		lipsticks.add("Plum Petals");
		lipsticks.add("Liquid Gold");

		Iterator<String> irtLipstick = lipsticks.iterator();

		while (irtLipstick.hasNext()) {
			System.out.println(irtLipstick.next());
		}

		int total10 = lipsticks.size();
		System.out.println("total lipsticks = " + total10);

		// actors.remove("Amit Mistry");
		System.out
				.println("Removed element is : ".concat(String.valueOf(lipsticks.remove("DIOR Rouge Dior Lipstick"))));

		int totalAfterLipstick = lipsticks.size();
		System.out.println("Total elements after remove movie = " + totalAfterLipstick);

		boolean containLipstick = lipsticks.contains("Hongqi");
		System.out.println(containLipstick);

		boolean emptyOrNotLipstick = lipsticks.isEmpty();
		System.out.println(emptyOrNotLipstick);

		lipsticks.clear();

		System.out.println(lipsticks.size());

	}

}
