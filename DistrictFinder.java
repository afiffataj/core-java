class DistrictFinder{
	public static String[] findDistrictsByStateName(String stateName){
	System.out.println("running findDistrictsByStateName in the DistrictFinder");
	System.out.println("stateName="+stateName);
	
	//1.
	if(stateName == "Andhra Pradesh")
	{
	   System.out.println("the state is andhra pradesh");
       String[] districtNames={"Alluri Sitharamaraju","Anakapalli","Anantapuramu",
    "Annamayya","Bapatla","Chittoor","Dr. B. R. Ambedkar Konaseema","East Godavari","Eluru",
      "Guntur","Kakinada","Krishna","Kurnool","Markapuram","Nandyal","NTR","Palnadu",
      "Parvathipuram Manyam","Polavaram","Prakasam","Sri Potti Sriramulu Nellore",
     "Sri Sathya Sai","Srikakulam","Tirupati","Visakhapatnam","Vizianagaram","West Godavari",
         "YSR Kadapa"};
       return districtNames;
	}
	
	//2. 
	if(stateName == "Uttar Pradesh")
	{
		System.out.println("the state is uttar pradesh");
		String[] districtNames={"Agra","Aligarh","Ambedkar Nagar","Amethi","Amroha","Auraiya","Azamgarh",
         "Baghpat","Bahraich","Ballia","Balrampur","Banda","Barabanki","Bareilly","Barabanki","Basti",
         "Bhadohi","Bijnor","Budaun","Bulandshahr","Chandauli","Chitrakoot","Deoria","Etah","Etawah",
         "Farrukhabad","Fatehpur","Firozabad","Gautam Buddha Nagar","Ghaziabad","Ghazipur","Gonda",
         "Gorakhpur","Hamirpur","Hapur","Hardoi","Hathras","Jalaun","Jaunpur","Jhansi","Kannauj",
         "Kanpur Dehat","Kanpur Nagar","Kasganj","Kaushambi","Kushinagar","Lakhimpur Kheri","Lalitpur",
        "Lucknow","Maharajganj","Mahoba","Mainpuri","Mathura","Mau","Meerut","Mirzapur","Moradabad",
        "Muzaffarnagar","Pilibhit","Pratapgarh","Prayagraj","Raebareli","Rampur","Saharanpur","Sambhal",
       "Sant Kabir Nagar","Shahjahanpur","Shamli","Shravasti","Siddharthnagar","Sitapur","Sonbhadra",
        "Sultanpur","Unnao","Varanasi"};
		return districtNames;
	}
	
	//3.
	if(stateName == "Madhya Pradesh")
	{
		System.out.println("the state is madhya pradesh");
		String[] districtNames={"Agar Malwa","Alirajpur","Anuppur","Ashoknagar","Balaghat","Barwani",
        "Betul","Bhind","Bhopal","Burhanpur","Chhatarpur","Chhindwara","Damoh","Datia","Dewas","Dhar",
         "Dindori","Guna","Gwalior","Harda","Indore","Jabalpur","Jhabua","Katni","Khandwa","Khargone",
        "Maihar","Mandla","Mandsaur","Morena","Narmadapuram","Narsinghpur","Neemuch","Niwari",
		"Pandhurna","Panna","Raisen","Rajgarh","Ratlam","Rewa","Sagar","Satna","Sehore","Seoni",
		"Shahdol","Shajapur","Sheopur","Shivpuri","Sidhi","Singrauli","Tikamgarh","Ujjain","Umaria",
            "Vidisha"};
		return districtNames;
	}
		
	//4.
	if(stateName == "Rajasthan")
	{
		System.out.println("the state name is rajasthan");
		String[] districtNames={"Ajmer","Alwar","Balotra","Banswara","Baran","Barmer","Beawar",
		"Bharatpur","Bhilwara","Bikaner","Bundi","Chittorgarh","Churu","Dausa","Deeg","Dholpur",
		"Didwana-Kuchaman","Dungarpur","Hanumangarh","Jaipur","Jaisalmer","Jalore","Jhalawar",
		"Jhunjhunu","Jodhpur","Khairthal-Tijara","Kota","Nagaur","Neem Ka Thana","Pali","Phalodi",
		"Pratapgarh","Rajsamand","Salumbar","Sawai Madhopur","Sikar","Sirohi","Sri Ganganagar","Tonk",
        "Udaipur","Shahpura"};
		return districtNames;
	}
	
	//5.
	if(stateName == "Tamil Naidu")
	{
		System.out.println("the state name is tamil naidu");
		String[] districtNames={"Ariyalur","Chengalpattu","Chennai","Coimbatore","Cuddalore",
        "Dharmapuri","Dindigul","Erode","Kallakurichi","Kancheepuram","Karur","Krishnagiri","Madurai",
        "Mayiladuthurai","Nagapattinam","Namakkal","Nilgiris","Perambalur","Pudukkottai",
		"Ramanathapuram","Ranipet","Salem","Sivaganga","Tenkasi","Thanjavur","Theni","Thoothukudi",
          "Tiruchirappalli","Tirunelveli","Tirupathur","Tiruppur","Tiruvallur","Tiruvannamalai",
         "Tiruvarur","Vellore","Viluppuram","Virudhunagar","Kanniyakumari"};
		return districtNames;
	}
	
	//6.
	if(stateName == "Bihar")
	{
		System.out.println("the state name is bihar");
		String[] districtNames={"Araria","Arwal","Aurangabad","Banka","Begusarai","Bhagalpur","Bhojpur",
         "Buxar","Darbhanga","East Champaran","Gaya","Gopalganj","Jamui","Jehanabad","Kaimur","Katihar",
        "Khagaria","Kishanganj","Lakhisarai","Madhepura","Madhubani","Munger","Muzaffarpur","Nalanda",
         "Nawada","Patna","Purnia","Rohtas","Saharsa","Samastipur","Saran","Sheikhpura","Sheohar",
        "Sitamarhi","Siwan","Supaul","Vaishali","West Champaran"};
		return districtNames;
	}
	
	//7.
	if(stateName == "Arunachal Pradesh")
	{
		System.out.println("the state name is arunachal pradesh");
		String[] districtNames={"Anjaw","Bichom","Changlang","Dibang Valley",
		"East Kameng","East Siang","Itanagar Capital Complex","Kamle","Keyi Panyor","Kra Daadi",
      "Kurung Kumey","Lepa Rada","Lohit","Longding","Lower Dibang Valley","Lower Siang",
     "Lower Subansiri","Namsai","Pakke Kessang","Papum Pare","Shi Yomi","Siang",
      "Tawang","Tirap","Upper Siang","Upper Subansiri","West Kameng","West Siang"};
		return districtNames;
	}
	
	//8.
	if(stateName == "Assam")
	{
		System.out.println("the state name is assam");
		String[] districtNames={"Baksa","Barpeta","Biswanath","Bongaigaon",
		"Cachar","Charaideo","Chirang","Darrang","Dhemaji","Dhubri","Dibrugarh","Dima Hasao",
    "Goalpara","Golaghat","Hailakandi","Hojai","Jorhat","Kamrup","Kamrup Metropolitan",
     "Karbi Anglong","Karimganj","Kokrajhar","Lakhimpur","Majuli","Morigaon","Nagaon",
     "Nalbari","Sivasagar","Sonitpur","South Salmara-Mankachar","Tamulpur","Tinsukia",
       "Udalguri","West Karbi Anglong","Sribhumi"};
		return districtNames;
	}
	
	//9.
	if(stateName == "Chhattisgarh")
	{
		System.out.println("the state name is chhattisgarh");
		String[] districtNames={"Balod","Baloda Bazar","Balrampur-Ramanujganj",
		"Bastar","Bemetara","Bijapur","Bilaspur","Dantewada","Dhamtari","Durg","Gariaband",
		"Gaurela-Pendra-Marwahi","Janjgir-Champa","Jashpur","Kabirdham","Kanker",
		"Khairagarh-Chhuikhadan-Gandai","Kondagaon","Korba","Koriya","Mahasamund",
		"Manendragarh-Chirmiri-Bharatpur","Mungeli","Narayanpur","Raigarh","Raipur","Rajnandgaon",
		"Sakti","Sarangarh-Bilaigarh","Sukma","Surajpur","Surguja","Mohla-Manpur-Ambagarh Chowki"};
		return districtNames;
	}
	
	//10.
	if(stateName == "Goa")
	{
		System.out.println("the state name is goa");
		String[] districtNames={"North Goa","South Goa"};
		return districtNames;
	}
	
	//11.
	if(stateName == "Gujarat")
	{
		System.out.println("the state name is gujarat");
		String[] districtNames={"Ahmedabad","Amreli","Anand","Aravalli","Banaskantha","Bharuch",
       "Bhavnagar","Botad","Chhota Udaipur","Dahod","Dang","Devbhoomi Dwarka","Gandhinagar",
      "Gir Somnath","Jamnagar","Junagadh","Kheda","Kutch","Mahisagar","Mehsana","Morbi",
    "Narmada","Navsari","Panchmahal","Patan","Porbandar","Rajkot","Sabarkantha","Surat",
       "Surendranagar","Tapi","Vadodara","Valsad"};
        return districtNames;
	}
	
	//12.
	if(stateName == "Haryana")
	{
		System.out.println("the state name is haryana");
		String[] districtNames={"Ambala","Bhiwani","Charkhi Dadri","Faridabad","Fatehabad",
       "Gurugram","Hisar","Jhajjar","Jind","Kaithal","Karnal","Kurukshetra","Mahendragarh",
         "Nuh","Palwal","Panchkula","Panipat","Rewari","Rohtak","Sirsa","Sonipat","Yamunanagar"};
        return districtNames;
	}
	
	//13.
	if(stateName == "Himachal Pradesh")
	{
		System.out.println("the state name is himachal pradesh");
		String[] districtNames={"Bilaspur","Chamba","Hamirpur","Kangra","Kinnaur","Kullu",
           "Lahaul and Spiti","Mandi","Shimla","Sirmaur","Solan","Una"};
		return districtNames;
	}
	
	//14.
	if(stateName == "Jharkhand")
	{
	   	System.out.println("the state name is jharkhand");
		String[] districtNames={"Bokaro","Chatra","Deoghar","Dhanbad","Dumka","East Singhbhum",
        "Garhwa","Giridih","Godda","Gumla","Hazaribagh","Jamtara","Khunti","Koderma",
        "Latehar","Lohardaga","Pakur","Palamu","Ramgarh","Ranchi","Sahibganj","Seraikela Kharsawan",
         "Simdega","West Singhbhum"};
		 return districtNames;
	}
	
	//15.
	if(stateName == "Karnataka")
	{
		System.out.println("the state name is karnataka");
		String[] districtNames={"Bagalkot","Ballari","Belagavi","Bengaluru Rural","Bengaluru Urban",
       "Bidar","Chamarajanagar","Chikkaballapur","Chikkamagaluru","Chitradurga",
      "Dakshina Kannada","Davanagere","Dharwad","Gadag","Hassan","Haveri","Kalaburagi",
         "Kodagu","Kolar","Koppal","Mandya","Mysuru","Raichur","Ramanagara","Shivamogga",
         "Tumakuru","Udupi","Uttara Kannada","Vijayapura","Yadgir","Vijayanagara"};
		 return districtNames;
	}
	
	//16.
	if(stateName == "Kerala")
	{
		System.out.println("the state name is kerala");
		String[] districtNames={"Alappuzha","Ernakulam","Idukki","Kannur","Kasaragod","Kollam",
       "Kottayam","Kozhikode","Malappuram","Palakkad","Pathanamthitta","Thiruvananthapuram",
        "Thrissur","Wayanad"};
		return districtNames;
	}
	
	//17.
	if(stateName == "Maharashtra")
	{
		System.out.println("the state name is maharashtra");
		String[] districtNames={"Ahmednagar","Akola","Amravati","Beed","Bhandara","Buldhana",
       "Chandrapur","Chhatrapati Sambhajinagar","Dharashiv","Dhule","Gadchiroli","Gondia",
           "Hingoli","Jalgaon","Jalna","Kolhapur","Latur","Mumbai City","Mumbai Suburban","Nagpur",
           "Nanded","Nandurbar","Nashik","Palghar","Parbhani","Pune","Raigad","Ratnagiri","Sangli",
           "Satara","Sindhudurg","Solapur","Thane","Wardha","Washim","Yavatmal"};
		   return districtNames;
	}
	
	//18.
	if(stateName == "Manipur")
	{
		System.out.println("the state name is manipur");
		String[] districtNames={"Bishnupur","Chandel","Churachandpur","Imphal East","Imphal West",
        "Jiribam","Kakching","Kamjong","Kangpokpi","Noney","Pherzawl","Senapati",
         "Tamenglong","Tengnoupal","Thoubal","Ukhrul"};
		return districtNames;
	}
	
	//19.
	if(stateName == "Meghalaya")
	{
		System.out.println("the state name is meghalaya");
		String[] districtNames={"East Garo Hills","East Jaintia Hills","East Khasi Hills",
        "North Garo Hills","Ri Bhoi","South Garo Hills","South West Garo Hills",
       "South West Khasi Hills","Eastern West Khasi Hills","West Garo Hills",
       "West Jaintia Hills","West Khasi Hills"};
	   return districtNames;
	}
	
	//20.
	if(stateName == "Mizoram")
	{
		System.out.println("the state name is mizoram");
		String[] districtNames={"Aizawl","Champhai","Hnahthial","Khawzawl","Kolasib","Lawngtlai",
         "Lunglei","Mamit","Saitual","Serchhip","Siaha"};
		return districtNames;
	}
	
	//21.
	if(stateName == "Nagaland")
	{
		System.out.println("the state name is nagaland");
		String[] districtNames={"Chumoukedima","Dimapur","Kiphire","Kohima","Longleng","Meluri",
       "Mokokchung","Mon","Niuland","Noklak","Peren","Phek","Shamator","Tseminyu",
       "Tuensang","Wokha","Zunheboto"};
		return districtNames;
	}
	
	//22.
	if(stateName == "Odisha")
	{
		System.out.println("the state name is odisha");
		String[] districtNames={"Angul","Balangir","Balasore","Bargarh","Bhadrak","Boudh",
       "Cuttack","Deogarh","Dhenkanal","Gajapati","Ganjam","Jagatsinghpur","Jajpur",
    "Jharsuguda","Kalahandi","Kandhamal","Kendrapara","Kendujhar","Khordha","Koraput",
        "Malkangiri","Mayurbhanj","Nabarangpur","Nayagarh","Nuapada","Puri","Rayagada",
      "Sambalpur","Subarnapur","Sundargarh"};
		return districtNames;
	}
	
	//23.
	if(stateName == "Punjab")
	{
		System.out.println("the state name is punjab");
		String[] districtNames={"Amritsar","Barnala","Bathinda","Faridkot","Fatehgarh Sahib",
         "Fazilka","Ferozepur","Gurdaspur","Hoshiarpur","Jalandhar","Kapurthala","Ludhiana",
         "Malerkotla","Mansa","Moga","Pathankot","Patiala","Rupnagar","Sahibzada Ajit Singh Nagar",
       "Sangrur","Shahid Bhagat Singh Nagar","Sri Muktsar Sahib","Tarn Taran"};
		return districtNames;
	}
	
	//24.
	if(stateName == "Sikkim")
	{
		System.out.println("the state name is sikkim");
		String[] districtNames={"Gangtok","Gyalshing","Mangan","Namchi","Pakyong","Soreng"};
		return districtNames;
	}
	
	//25.
	if(stateName == "Telangana")
	{
		System.out.println("the state name is telangana");
		String[] districtNames={"Adilabad","Bhadradri Kothagudem","Hanumakonda","Hyderabad",
        "Jagtial","Jangaon","Jayashankar Bhupalpally","Jogulamba Gadwal","Kamareddy",
      "Karimnagar","Khammam","Komaram Bheem Asifabad","Mahabubabad","Mahabubnagar",
      "Mancherial","Medak","Medchal-Malkajgiri","Mulugu","Nagarkurnool","Nalgonda",
       "Narayanpet","Nirmal","Nizamabad","Peddapalli","Rajanna Sircilla","Rangareddy",
          "Sangareddy","Siddipet","Suryapet","Vikarabad","Wanaparthy","Warangal",
           "Yadadri Bhuvanagiri"};
		return districtNames;
	}
	
	//26.
	if(stateName == "Tripura")
	{
		System.out.println("the state name is tripura");
		String[] districtNames={"Dhalai","Gomati","Khowai","North Tripura","Sepahijala",
      "South Tripura","Unakoti","West Tripura"};
		return districtNames;
	}
	
	//27.
	if(stateName == "Uttarakhand")
	{
		System.out.println("the state name is uttarakhand");
		String[] districtNames={"Almora","Bageshwar","Chamoli","Champawat","Dehradun","Haridwar",
          "Nainital","Pauri Garhwal","Pithoragarh","Rudraprayag","Tehri Garhwal",
           "Udham Singh Nagar","Uttarkashi"};
		return districtNames;
	}
	
	//28.
	if(stateName == "West Bengal")
	{
		System.out.println("the state name is west bengal");
		String[] districtNames={"Alipurduar","Bankura","Paschim Bardhaman","Purba Bardhaman",
         "Birbhum","Cooch Behar","Dakshin Dinajpur","Darjeeling","Hooghly","Howrah",
         "Jalpaiguri","Jhargram","Kalimpong","Kolkata","Maldah","Murshidabad","Nadia",
         "North 24 Parganas","South 24 Parganas","Paschim Medinipur","Purba Medinipur",
         "Uttar Dinajpur","Sundarban"};
		return districtNames;
	}
	
	System.out.println("if the country is not matching ,then print empty");
	String[] empty={};
	return empty;
	}
}