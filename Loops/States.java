 class States{
	static String[] namesOfStates(String statesNames){
		
		//1
    String andhraPradesh[] = {"Alluri Sitharama Raju", "Anakapalli",
	"Ananthapuramu", "Annamayya", "Bapatla", "Chittoor", 
	"Dr. B.R. Ambedkar Konaseema", "East Godavari", "Eluru", "Guntur",
	"Kakinada", "Krishna", "Kurnool", "Markapuram", "Nandyal", "NTR", 
	"Palnadu", "Parvathipuram Manyam", "Polavaram", "Prakasam",
	"Sri Potti Sriramulu Nellore", "Sri Sathya Sai", "Srikakulam",
	"Tirupati", "Visakhapatnam", "Vizianagaram", "West Godavari",
	"YSR Kadapa"};
	
	//2
    String arunachalPradesh[] = {"Anjaw", "Bichom", "Changlang", 
	"Dibang Valley", "East Kameng", "East Siang", "Itanagar Capital Complex", 
	"Kamle", "Keyi Panyor", "Kra Daadi", "Kurung Kumey", "Leparada", "Lohit",
	"Longding", "Lower Dibang Valley", "Lower Siang", "Lower Subansiri", 
	"Namsai", "Pakke Kessang", "Papum Pare", "Shi Yomi", "Siang", "Tawang", 
	"Tirap", "Upper Siang", "Upper Subansiri", "West Kameng", "West Siang"};
	
	//3
	String assam[] = {"Bajali", "Baksa", "Barpeta", "Biswanath", 
	"Bongaigaon", "Cachar", "Charaideo", "Chirang", "Darrang", "Dhemaji",
	"Dhubri", "Dibrugarh", "Dima Hasao", "Goalpara", "Golaghat", "Hailakandi",
	"Hojai", "Jorhat", "Kamrup", "Kamrup Metropolitan", "Karbi Anglong", 
	"Karimganj", "Kokrajhar", "Lakhimpur", "Majuli", "Morigaon", "Nagaon",
	"Nalbari", "Sivasagar", "Sonitpur", "South Salmara-Mankachar", "Sribhumi",
	"Tamulpur", "Tinsukia", "Udalguri", "West Karbi Anglong"};
	
	//4
	String bihar[] = {"Araria", "Arwal", "Aurangabad", "Banka",
	"Begusarai", "Bhagalpur", "Bhojpur", "Buxar", "Darbhanga",
	"East Champaran", "Gaya", "Gopalganj", "Jamui", "Jehanabad", "Kaimur",
	"Katihar", "Khagaria", "Kishanganj", "Lakhisarai", "Madhepura",
	"Madhubani", "Munger", "Muzaffarpur", "Nalanda", "Nawada", "Patna", 
	"Purnia", "Rohtas", "Saharsa", "Samastipur", "Saran", "Sheikhpura",
	"Sheohar", "Sitamarhi", "Siwan", "Supaul", "Vaishali", "West Champaran"};
	
	//5
	String chhattisgarh[] = {"Balod", "Baloda Bazar", "Balrampur",
	"Bastar", "Bemetara", "Bijapur", "Bilaspur", "Dantewada", "Dhamtari",
	"Durg", "Gariaband", "Gaurela-Pendra-Marwahi", "Janjgir-Champa", "Jashpur",
	"Kabirdham", "Kanker", "Khairagarh-Chhuikhadan-Gandai", "Kondagaon",
	"Korba", "Korea", "Mahasamund", "Manendragarh-Chirmiri-Bharatpur",
	"Mohla-Manpur-Ambagarh Chowki", "Mungeli", "Narayanpur", "Raigarh",
	"Raipur", "Rajnandgaon", "Sakti", "Sarangarh-Bilaigarh", "Sukma",
	"Surajpur", "Surguja"};
	
	//6
	String goa[] = {"North Goa", "South Goa"};
	
	//7
	String gujarat[] = {"Ahmedabad", "Amreli", "Anand", "Aravalli",
	"Banaskantha", "Bharuch", "Bhavnagar", "Botad", "Chhota Udaipur", 
	"Dahod", "Dang", "Devbhumi Dwarka", "Gandhinagar", "Gir Somnath",
	"Jamnagar", "Junagadh", "Kachchh", "Kheda", "Mahisagar", "Mehsana",
	"Morbi", "Narmada", "Navsari", "Panchmahal", "Patan", "Porbandar", 
	"Rajkot", "Sabarkantha", "Surat", "Surendranagar", "Tapi", "Vadodara",
	"Valsad", "Vav-Tharad"};
	
	//8
	String haryana[] = {"Ambala", "Bhiwani", "Charkhi Dadri",
	"Faridabad", "Fatehabad", "Gurugram", "Hisar", "Jhajjar", "Jind",
	"Kaithal", "Karnal", "Kurukshetra", "Mahendragarh", "Nuh", "Palwal",
	"Panchkula", "Panipat", "Rewari", "Rohtak", "Sirsa", "Sonipat", 
	"Yamunanagar"};
	
	//9
	String himachalPradesh[] = {"Bilaspur", "Chamba", "Hamirpur", "Kangra",
	"Kinnaur", "Kullu", "Lahaul and Spiti", "Mandi", "Shimla", "Sirmaur",
	"Solan", "Una"};
	
	//10
	String jharkhand[] = {"Bokaro", "Chatra", "Deoghar", "Dhanbad", "Dumka",
	"East Singhbhum", "Garhwa", "Giridih", "Godda", "Gumla", "Hazaribagh", 
	"Jamtara", "Khunti", "Koderma", "Latehar", "Lohardaga", "Pakur", "Palamu",
	"Ramgarh", "Ranchi", "Sahebganj", "Seraikela-Kharsawan", "Simdega",
	"West Singhbhum"};
	
	//11
	String karnataka[] = {"Bagalkot", "Ballari", "Belagavi",
	"Bengaluru Rural", "Bengaluru Urban", "Bidar", "Chamarajanagar", 
	"Chikkaballapur", "Chikkamagaluru", "Chitradurga", "Dakshina Kannada",
	"Davanagere", "Dharwad", "Gadag", "Hassan", "Haveri", "Kalaburagi",
	"Kodagu", "Kolar", "Koppal", "Mandya", "Mysuru", "Raichur", "Ramanagara",
	"Shivamogga", "Tumakuru", "Udupi", "Uttara Kannada", "Vijayanagara", 
	"Vijayapura", "Yadgir"};
	
	//12
	String kerala[] = {"Alappuzha", "Ernakulam", "Idukki", "Kannur",
	"Kasaragod", "Kollam", "Kottayam", "Kozhikode", "Malappuram", 
	"Palakkad", "Pathanamthitta", "Thiruvananthapuram", "Thrissur", "Wayanad"};
	
	//13
	String madhyaPradesh[] = {"Agar Malwa", "Alirajpur", "Anuppur", 
	"Ashoknagar", "Balaghat", "Barwani", "Betul", "Bhind", "Bhopal",
	"Burhanpur", "Chhatarpur", "Chhindwara", "Damoh", "Datia", "Dewas", 
	"Dhar", "Dindori", "Guna", "Gwalior", "Harda", "Indore", "Jabalpur", 
	"Jhabua", "Katni", "Khandwa", "Khargone", "Maihar", "Mandla", "Mandsaur",
	"Mauganj", "Morena", "Narmadapuram", "Narsinghpur", "Neemuch", "Niwari", 
	"Pandhurna", "Panna", "Raisen", "Rajgarh", "Ratlam", "Rewa", "Sagar", 
	"Satna", "Sehore", "Seoni", "Shahdol", "Shajapur", "Sheopur", "Shivpuri",
	"Sidhi", "Singrauli", "Tikamgarh", "Ujjain", "Umaria", "Vidisha"};
	
	//14
	String maharashtra[] = {"Ahilyanagar", "Akola", "Amravati", 
	"Beed", "Bhandara", "Buldhana", "Chandrapur", "Chhatrapati Sambhajinagar",
	"Dharashiv", "Dhule", "Gadchiroli", "Gondia", "Hingoli", "Jalgaon", 
	"Jalna", "Kolhapur", "Latur", "Mumbai City", "Mumbai Suburban", "Nagpur",
	"Nanded", "Nandurbar", "Nashik", "Palghar", "Parbhani", "Pune", "Raigad",
	"Ratnagiri", "Sangli", "Satara", "Sindhudurg", "Solapur", "Thane", 
	"Wardha", "Washim", "Yavatmal"};
	
	//15
	String manipur[] = {"Bishnupur", "Chandel", "Churachandpur", 
	"Imphal East", "Imphal West", "Jiribam", "Kakching", "Kamjong", 
	"Kangpokpi", "Noney", "Pherzawl", "Senapati", "Tamenglong", "Tengnoupal",
	"Thoubal", "Ukhrul"};
	
	//16
	String meghalaya[] = {"East Garo Hills", "East Jaintia Hills",
	"East Khasi Hills", "Eastern West Khasi Hills", "North Garo Hills", 
	"Ri Bhoi", "South Garo Hills", "South West Garo Hills", 
	"South West Khasi Hills", "West Garo Hills", "West Jaintia Hills",
	"West Khasi Hills"};
	
	//17
	String mizoram[] = {"Aizawl", "Champhai", "Hnahthial", "Khawzawl",
	"Kolasib", "Lawngtlai", "Lunglei", "Mamit", "Saitual", "Serchhip", "Siaha"};
	
	//18
	String nagaland[] = {"Chumoukedima", "Dimapur", "Kiphire", "Kohima",
	"Longleng", "Meluri", "Mokokchung", "Mon", "Niuland", "Noklak", "Peren", 
	"Phek", "Shamator", "Tseminyu", "Tuensang", "Wokha", "Zunheboto"};
	
	//19
	String punjab[] = {"Amritsar", "Barnala", "Bathinda", "Faridkot", 
	"Fatehgarh Sahib", "Fazilka", "Ferozepur", "Gurdaspur", "Hoshiarpur",
	"Jalandhar", "Kapurthala", "Ludhiana", "Malerkotla", "Mansa", "Moga", 
	"Pathankot", "Patiala", "Rupnagar", "Sahibzada Ajit Singh Nagar",
	"Sangrur", "Shahid Bhagat Singh Nagar", "Sri Muktsar Sahib", "Tarn Taran"};
	
	//20
	String rajasthan[] = {"Ajmer", "Alwar", "Anupgarh", "Balotra", 
	"Banswara", "Baran", "Barmer", "Beawar", "Bharatpur", "Bhilwara", 
	"Bikaner", "Bundi", "Chittorgarh", "Churu", "Dausa", "Deeg", "Dholpur", 
	"Didwana-Kuchaman", "Dudu", "Dungarpur", "Gangapur City", "Hanumangarh", 
	"Jaipur", "Jaipur Rural", "Jaisalmer", "Jalore", "Jhalawar", "Jhunjhunu",
	"Jodhpur", "Jodhpur Rural", "Karauli", "Kekri", "Khairthal-Tijara", 
	"Kota", "Kotputli-Behror", "Nagaur", "Neem Ka Thana", "Pali", "Phalodi",
	"Pratapgarh", "Rajsamand", "Salumber", "Sanchore", "Sawai Madhopur",
	"Shahpura", "Sikar", "Sirohi", "Sri Ganganagar", "Tonk", "Udaipur"};
	
	//21
	String sikkim[] = {"Gangtok", "Gyalshing", "Mangan", "Namchi",
	"Pakyong", "Soreng"};
	
	//22
	String tamilNadu[] = {"Ariyalur", "Chengalpattu", "Chennai",
	"Coimbatore", "Cuddalore", "Dharmapuri", "Dindigul", "Erode", 
	"Kallakurichi", "Kancheepuram", "Kanniyakumari", "Karur", "Krishnagiri",
	"Madurai", "Mayiladuthurai", "Nagapattinam", "Namakkal", "Nilgiris", 
	"Perambalur", "Pudukkottai", "Ramanathapuram", "Ranipet", "Salem", 
	"Sivaganga", "Tenkasi", "Thanjavur", "Theni", "Thoothukudi",
	"Tiruchirappalli", "Tirunelveli", "Tirupathur", "Tiruppur", 
	"Tiruvallur", "Tiruvannamalai", "Tiruvarur", "Vellore", "Viluppuram", 
	"Virudhunagar"};
	
	//23
	String telangana[] = {"Adilabad", "Bhadradri Kothagudem", "Hanumakonda",
	"Hyderabad", "Jagtial", "Jangaon","Jayashankar Bhupalpally",
	"Jogulamba Gadwal", "Kamareddy", "Karimnagar", "Khammam", 
	"Kumuram Bheem Asifabad", "Mahabubabad", "Mahabubnagar", 
	"Mancherial", "Medak", "Medchal-Malkajgiri", "Mulugu",
	"Nagarkurnool", "Nalgonda", "Narayanpet", "Nirmal", "Nizamabad", 
	"Peddapalli", "Rajanna Sircilla", "Rangareddy", "Sangareddy", 
	"Siddipet", "Suryapet", "Vikarabad", "Wanaparthy", "Warangal", 
	"Yadadri Bhuvanagiri"};
	
	//24
	String tripura[] = {"Dhalai", "Gomati", "Khowai", "North Tripura",
	"Sepahijala", "South Tripura", "Unakoti", "West Tripura"};
	
	//25
	String uttarPradesh[] = {"Agra", "Aligarh", "Ambedkar Nagar",
	"Amethi", "Amroha", "Auraiya", "Ayodhya", "Azamgarh", "Baghpat",
	"Bahraich", "Ballia", "Balrampur", "Banda", "Barabanki", "Bareilly", 
	"Basti", "Bhadohi", "Bijnor", "Budaun", "Bulandshahr", "Chandauli",
	"Chitrakoot", "Deoria", "Etah", "Etawah", "Farrukhabad", "Fatehpur",
	"Firozabad", "Gautam Buddha Nagar", "Ghaziabad", "Ghazipur", "Gonda",
	"Gorakhpur", "Hamirpur", "Hapur", "Hardoi", "Hathras", "Jalaun", 
	"Jaunpur", "Jhansi", "Kannauj", "Kanpur Dehat", "Kanpur Nagar", 
	"Kasganj", "Kaushambi", "Kheri", "Kushinagar", "Lalitpur", "Lucknow",
	"Maharajganj", "Mahoba", "Mainpuri", "Mathura", "Mau", "Meerut",
	"Mirzapur", "Moradabad", "Muzaffarnagar", "Pilibhit", "Pratapgarh",
	"Prayagraj", "Raebareli", "Rampur", "Saharanpur", "Sambhal", 
	"Sant Kabir Nagar", "Shahjahanpur", "Shamli", "Shravasti", 
	"Siddharthnagar", "Sitapur", "Sonbhadra", "Sultanpur", "Unnao",
	"Varanasi"};
	
	//26
	String uttarakhand[] = {"Almora", "Bageshwar", "Chamoli", "Champawat", 
	"Dehradun", "Haridwar", "Nainital", "Pauri Garhwal", "Pithoragarh", 
	"Rudraprayag", "Tehri Garhwal", "Udham Singh Nagar", "Uttarkashi"};
	
	//27
	String westBengal[] = {"Alipurduar", "Bankura", "Birbhum", "Cooch Behar",
	"Dakshin Dinajpur", "Darjeeling", "Hooghly", "Howrah", "Jalpaiguri",
	"Jhargram", "Kalimpong", "Kolkata", "Malda", "Murshidabad", "Nadia", 
	"North 24 Parganas", "Paschim Bardhaman", "Paschim Medinipur", 
	"Purba Bardhaman", "Purba Medinipur", "Purulia", "South 24 Parganas", 
	"Uttar Dinajpur"};
	
	//28
	String odisha[] = {"Angul", "Balangir", "Balasore", "Bargarh", "Bhadrak",
     "Boudh", "Cuttack", "Deogarh", "Dhenkanal", "Gajapati", "Ganjam",
    "Jagatsinghpur", "Jajpur", "Jharsuguda", "Kalahandi", "Kandhamal",
    "Kendrapara", "Kendujhar", "Khordha", "Koraput", "Malkangiri",
     "Mayurbhanj", "Nabarangpur", "Nayagarh", "Nuapada", "Puri",
    "Rayagada", "Sambalpur", "Subarnapur", "Sundargarh"};
	
	if(statesNames == "andhraPradesh"){
    return andhraPradesh;
}else if(statesNames == "arunachalPradesh"){
    return arunachalPradesh;
}else if(statesNames == "assam"){
    return assam;
}else if(statesNames == "bihar"){
    return bihar;
}else if(statesNames == "chhattisgarh"){
    return chhattisgarh;
}else if(statesNames == "goa"){
    return goa;
}else if(statesNames == "gujarat"){
    return gujarat;
}else if(statesNames == "haryana"){
    return haryana;
}else if(statesNames == "himachalPradesh"){
    return himachalPradesh;
}else if(statesNames == "jharkhand"){
    return jharkhand;
}else if(statesNames == "karnataka"){
    return karnataka;
}else if(statesNames == "kerala"){
    return kerala;
}else if(statesNames == "madhyaPradesh"){
    return madhyaPradesh;
}else if(statesNames == "maharashtra"){
    return maharashtra;
}else if(statesNames == "manipur"){
    return manipur;
}else if(statesNames == "meghalaya"){
    return meghalaya;
}else if(statesNames == "mizoram"){
    return mizoram;
}else if(statesNames == "nagaland"){
    return nagaland;
}else if(statesNames == "odisha"){
    return odisha;
}else if(statesNames == "punjab"){
    return punjab;
}else if(statesNames == "rajasthan"){
    return rajasthan;
}else if(statesNames == "sikkim"){
    return sikkim;
}else if(statesNames == "tamilNadu"){
    return tamilNadu;
}else if(statesNames == "telangana"){
    return telangana;
}else if(statesNames == "tripura"){
    return tripura;
}else if(statesNames == "uttarPradesh"){
    return uttarPradesh;
}else if(statesNames == "uttarakhand"){
    return uttarakhand;
}else if(statesNames == "westBengal"){
    return westBengal;
}else{
    System.out.println("Invalid State Name");
    return null;
}
	}
 }
 