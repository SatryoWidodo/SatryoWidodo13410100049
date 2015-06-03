import java.io.*;
class DbProductArr2
{
public static void main (String [] args )throws Exception
{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int bil1=0;
 int bil2=0;
 int bil3=0;
 int bil4=0;
 int optionn=0;
 
 String [] field ={"ID","Produsen","Barang","Harga"};
 String [][]tblHerbal={
{"ADW01","Ad Dawa Product","Kapsul Minyak Ikan Salmon isi 50 Softgel","40000"},
{"ADW02","Ad Dawa Product","Kapsul Serbuk Ashitaba Herbal (Seledri Jepang)","40000"},
{"ADI01","Adas Indo Nusa","KAMIL 3 in 1 (Habbatussauda, Zaitun, Propolis) 70 kapsul","50000"},
{"ADI02","Adas Indo Nusa","kamil 3 in 1 isi 200 kapsul","95000"},
{"ADI03","Adas Indo Nusa","Kapsul Minyak Habbatussauda' Kamil isi 70","45000"},
{"ADI04","Adas Indo Nusa","Kapsul Minyak Ikan KAMIL (Fish Oil + Omega 3)","90000"},
{"ADI05","Adas Indo Nusa","Kapsul Minyak Zaitun KAMIL isi 70","40000"},
{"ADI06","Adas Indo Nusa","Kapsul Serbuk Kamil Habbatussauda 70 Kapsul","25000"},
{"ADI07","Adas Indo Nusa","Minyak Zaitun KAMIL 100 ml","25000"},
{"ADR01","Addawa Research","Madu Kaliandra 300 ml Addawa","43000"},
{"ADR02","Addawa Research","Madu Kaliandra 700 ml Addawa","77000"},
{"ADR03","Addawa Research","Madu Randu 1 Kg Addawa","100000"},
{"AFI01","Afiah","Bedak Dingin Sari Bengkoang","12000"},
{"AFI02","Afiah","Minyak Bulus Asli Kalimantan Kemasan Roll On","15000"},
{"AGS01","Agaricus Sido Makmur Sentosa","Agadro NODIBET","120000"},
{"AWL01","Al - Waliy","Madu Amandel For Kids Al - Waliy","30000"},
{"ALW02","Al - Waliy","Madu Batuk Dewasa Al - Waliy","25000"},
{"AWL02","Al - Waliy","Madu Batuk For Kids Al - Waliy","25000"},
{"ALW03","Al - Waliy","STOP Ngompol For Kids Al - Waliy","25000"},
{"AMR01","Al Amir (Spain)","Minyak Zaitun Al Amir 175 ml (Import)","40000"},
{"AMR02","Al Amir (Spain)","Minyak Zaitun Extra Virgin Al Amir 250 ml","60000"},
{"BAR01","Al Barokah","Jamu Madu Habbatussauda Al-Barokah (Quality has a name)","100000"},
{"BIR01","Al Biruni Herbals","Albibet Al Biruni (Diabetes/Kencing Manis)","59000"},
{"BIR02","Al Biruni Herbals","AlbiKoles Al Biruni (Kolesterol)","59000"},
{"BIR03","Al Biruni Herbals","Albimor Al Biruni (Membunuh Kanker dan Tumor)","73000"},
{"BIR04","Al Biruni Herbals","Albirmaag/Herba Maag 50K Al Biruni","59000"},
{"BIR05","Al Biruni Herbals","Albistrok (Membantu Memulihkan Stroke)","73000"},
{"BIR06","Al Biruni Herbals","Bloody Cleanser Al Biruni (Detoksifikasi Racun Tubuh)","80000"},
{"BIR07","Al Biruni Herbals","Cing Cing Al Biruni (thypus, demam tinggi, stroke, jantung)","80000"},
{"BIR08","Al Biruni Herbals","Herba Gurah Jumbo Al Biruni / Albiguraa Jumbo","59000"},
{"BIR09","Al Biruni Herbals","Herba Gurah Pot Al Biruni (Albiguraa 18 Kapsul)","31000"},
{"BIR10","Al Biruni Herbals","Herba Gurah Reguler Al Biruni (Albiguraa 25 kapsul)","36000"},
{"BIR11","Al Biruni Herbals","Herba Gurah Yunior Al Biruni (Albirugaa Untuk Anak)","36000"},
{"BIR12","Al Biruni Herbals","Herba Maag / AlbirMag Al Biruni","36000"},
{"BIR13","Al Biruni Herbals","HerbaSam 50K Al Biruni","59000"},
{"BIR14","Al Biruni Herbals","HerbaSlim Al Biruni","59000"},
{"BIR15","Al Biruni Herbals","HerbaTensi Al Biruni (Hipertensi/Darah Tinggi)","59000"},
{"DHB01","Al Dhahabiyah","Serbuk Kurma Al Dhahabiyah (kesuburan)","75000"},
{"HJZ01","Al Hijaz","Kapsul Minyak Habbatussauda' Al Hijaz Isi 100","60000"},
{"HJZ02","Al Hijaz","Kapsul Minyak Habbatussauda' Al Hijaz Isi 200","110000"},
{"HJZ03","Al Hijaz","Kapsul Minyak Habbatussauda' Al Hijaz Isi 60","40000"},
{"KIA01","Al Kautsar Inti 'Afiyah","Air Hajar Sa'adah/Jahannam Mesir 3 ml Al Kautsar","65000"},
{"KIA02","Al Kautsar Inti 'Afiyah","BILQIS CREAM (Pemutih Ketiak dan Selbil1ngan)","55000"},
{"KIA03","Al Kautsar Inti 'Afiyah","Breast Up Cream (Pengencang Payudara)","85000"},
{"KIA04","Al Kautsar Inti 'Afiyah","Ekstrak Tribulus Gold Terrestris","50000"},
{"KIA05","Al Kautsar Inti 'Afiyah","Hajar Sa'adah Black Stone With Aroma Teraphy","90000"},
{"KIA06","Al Kautsar Inti 'Afiyah","Herbal Axilla (Penghilang Bau Badan)","35000"},
{"KIA07","Al Kautsar Inti 'Afiyah","Humairo Cream Nature","35000"},
{"KIA08","Al Kautsar Inti 'Afiyah","Kopi Sulthon 7 in 1 (Kopinya Keluarga Harmonis)","100000"},
{"KIA09","Al Kautsar Inti 'Afiyah","Ladies Whitening Cream (Pemutih Wajah dan Leher)","45000"},
{"KIA10","Al Kautsar Inti 'Afiyah","Long Big Enlargement X Nature Oil 6 ml","200000"},
{"KIA11","Al Kautsar Inti 'Afiyah","Minyak Bulus Al Kautsar","25000"},
{"KIA12","Al Kautsar Inti 'Afiyah","Minyak Bulus Plus Al Kautsar","30000"},
{"KIA13","Al Kautsar Inti 'Afiyah","Minyak Gosok Sumbawa Asli","50000"},
{"KIA14","Al Kautsar Inti 'Afiyah","Permanent Penis Enlargement (Natural Oil)","120000"},
{"KIA15","Al Kautsar Inti 'Afiyah","Pil Manjakani (Female Solution)","95000"},
{"KIA16","Al Kautsar Inti 'Afiyah","Squalene Cream (Cerahkan Kulit Wajah)","35000"},
{"KIA17","Al Kautsar Inti 'Afiyah","Tongkat Gurah Vagina Super (TGV Super)","75000"},
{"KOD01","Al Khodry","Madu Hitam Sumbawa Al Khodry","75000"},
{"KOD02","Al Khodry","Minyak Kemiri Premium Al Khodry","25000"},
{"MNR01","Al Manar Herbafit","Afiafit","60000"},
{"MNR02","Al Manar Herbafit","Madu Randu 0.5kg Al-Manar","40000"},
{"MUS01","Al Muslim","Siwak Basah Import Al-Muslim","12000"},
{"RHP01","Al Rehap Saudi","Minyak Wangi Al Rehab Roll On 3 ml (Import Saudi)","15000"},
{"SFA01","Al Shifa (PT. Safarindo Internusa)","Madu Arab Al Shifa 1 kg","180000"},
{"SFA02","Al Shifa (PT. Safarindo Internusa)","Madu Arab Al Shifa 125 gr","30000"},
{"SFA03","Al Shifa (PT. Safarindo Internusa)","Madu Arab Al Shifa 250 gr","60000"},
{"SFA04","Al Shifa (PT. Safarindo Internusa)","Madu Arab Al Shifa 500 gr","90000"},
{"AWD01","Al Wadey","Kapsul Herbal Daun Bidara AL WADEY","30000"},
{"AWD02","Al Wadey","Kapsul Minyak Habbatussauda isi 70 Al Wadey","50000"},
{"AWD03","Al Wadey","Madu Anak dan Balita Al Wadey","58000"},
{"AWD04","Al Wadey","Madu Anak dan Balita Al Wadey 1 kg","110000"},
{"AWD05","Al Wadey","Madu Bunga Durian Al Wadey 0.5 kg","58000"},
{"AWD06","Al Wadey","Madu Bunga Durian Al Wadey 1 kg","110000"},
{"AWD07","Al Wadey","Madu Bunga Karet Al Wadey 0.5 kg","55000"},
{"AWD08","Al Wadey","Madu Bunga Karet Al Wadey 1Kg","103000"},
{"AWD09","Al Wadey","Madu Bunga Kelengkeng Al Wadey 0.5 kg","69000"},
{"AWD10","Al Wadey","Madu Bunga Kelengkeng Al Wadey 1 kg","132000"},
{"AWD11","Al Wadey","Madu Bunga Mangga Plus Al Wadey 0.5 kg","60000"},
{"AWD12","Al Wadey","Madu Bunga Mete Al Wadey 0.5 kg","60000"},
{"AWD13","Al Wadey","Madu Bunga Rambutan Al Wadey 0,5 kg","62000"},
{"AWD14","Al Wadey","Madu Bunga Rambutan Al Wadey 1 kg","118000"},
{"AWD15","Al Wadey","Madu Bunga Randu Plus Al Wadey 0.5 kg","66000"},
{"AWD16","Al Wadey","Madu Bunga Randu Plus Al Wadey 1 kg","125000"},
{"AWD17","Al Wadey","Madu Hutan Liar Al Wadey 0,5 kg","45000"},
{"AWD18","Al Wadey","Madu Hutan Liar Al Wadey 1 kg","85000"},
{"AWD19","Al Wadey","Madu Hutan Super Al Wadey 0.5 kg","53000"},
{"AWD20","Al Wadey","Madu Hutan Super Al Wadey 1 kg","100000"},
{"AWD21","Al Wadey","Madu Ibu Hamil dan Menyusui 0.5 kg","58000"},
{"AWD22","Al Wadey","Madu Ibu Hamil dan Menyusui 1 kg","110000"},
{"AWD23","Al Wadey","Madu Kaliandra Plus Al Wadey 0.5 kg","62000"},
{"AWD24","Al Wadey","Madu Kaliandra Plus Al Wadey 1 kg","118000"},
{"AWD25","Al Wadey","Madu Kesuburan Al Wadey","38000"},
{"AWD26","Al Wadey","Madu Kuat Lelaki Al Wadey","38000"},
{"AWD27","Al Wadey","Madu Obat Batuk Al Wadey","26000"},
{"AWD28","Al Wadey","Madu Penurun Panas Al Wadey","26000"},
{"AWD29","Al Wadey","Ramuan Madu Asam Urat AL WADEY","26000"},
{"AWD30","Al Wadey","Ramuan Madu Lambung  AL WADEY","26000"},
{"ASA01","Al-Afiat Sehat Alami","Madu Bugar Kunyit Asam Al-Afiat","30000"},
{"ASA02","Al-Afiat Sehat Alami","Madu Bugar Rosella Manggis Al-Afiat","40000"},
{"ASA03","Al-Afiat Sehat Alami","Sirup Gurah Anak dan Dewasa Rasa MINT 75 ml","30000"},
{"ASA04","Al-Afiat Sehat Alami","Sirup Gurah untuk Anak dan Dewasa 125 ml","50000"},
{"ASA05","Al-Afiat Sehat Alami","Sirup Gurah untuk Anak dan Dewasa 75 ml","30000"},
{"ASA06","Al-Afiat Sehat Alami","Sirup Gurah Untuk Anak dan Dewasa Rasa MINT 125 ml","50000"},
{"ASA07","Alam Subur Manjur","PIL PASDA (Panas Dalam)","15000"},
{"ASA08","Alam Subur Manjur","Salep Kulit Multiguna Cap Guci Pusaka","16000"},
{"AGH01","Al-Ghuroba'","Al Mu'arris 250 gr (Madu+Zaitun+Habbatussauda+Herba Vitalitas)","45000"},
{"AGH02","Al-Ghuroba'","Cream Zaitun Al-Ghuroba'","16000"},
{"AGH03","Al-Ghuroba'","Kapsul Bee Pollen Al Ghuroba","35000"},
{"AGH04","Al-Ghuroba'","Madu Alami Ad_Dawa' Bunga Kelengkeng 0.5 kg Al Ghuroba","48000"},
{"AGH05","Al-Ghuroba'","Madu Alami Ad-Dawa' Bunga Kelengkeng 1 kg Al Ghuroba","80000"},
{"AGH06","Al-Ghuroba'","Madu Alami Ad-Dawa' Bunga Mangga 0,5 kg Al Ghuroba","45000"},
{"AGH07","Al-Ghuroba'","Madu Alami Ad-Dawa' Bunga Mangga 1 kg Al Ghuroba","75000"},
{"AGH08","Al-Ghuroba'","Madu Alami Al-Lu'Lu' Bunga Kopi 0,5 kg Al Ghuroba","48000"},
{"AGH09","Al-Ghuroba'","Madu Alami Al-Lu'Lu' Bunga Kopi 1 kg Al Ghuroba","80000"},
{"AGH10","Al-Ghuroba'","Madu Alami Salsabila Bunga Randu 0,5 kg Al Ghuroba","45000"},
{"AGH11","Al-Ghuroba'","Madu Alami Salsabila Bunga Randu 1 kg Al Ghuroba","75000"},
{"AGH12","Al-Ghuroba'","Madu Clever Child","32000"},
{"AGH13","Al-Ghuroba'","Madu Hutan Belantara Riau al-Ghuroba' 0,5 kg","48000"},
{"AGH14","Al-Ghuroba'","Madu Hutan Belantara Riau Al-Ghuroba' 1 kg","78000"},
{"AGH15","Al-Ghuroba'","Madu Hutan Kalimantan al-Ghuroba' 0,5 kg","43000"},
{"AGH16","Al-Ghuroba'","Madu Hutan Kalimantan Al-Ghuroba' 1 kg","63000"},
{"AGH17","Al-Ghuroba'","Minyak Angin 25 ml","10000"},
{"AGH18","Al-Ghuroba'","Minyak Cengkih 25 ml","20000"},
{"AGH19","Al-Ghuroba'","Minyak Gondopuro 25 ml","12000"},
{"AGH20","Al-Ghuroba'","Minyak Habbatusauda' 30 ml (Black Seed Oil)","25000"},
{"AGH21","Al-Ghuroba'","Minyak Habbatussauda' 60 ml (Black Seed Oil)","40000"},
{"AGH22","Al-Ghuroba'","Minyak Kayu Putih Al Ghuroba' 150 ml","50000"},
{"AGH23","Al-Ghuroba'","Minyak Sereh 25 ml","20000"},
{"AGH24","Al-Ghuroba'","Minyak Zaitun Extra Virgin al-Ghuroba' 60 ml","20000"},
{"AGH25","Al-Ghuroba'","Sabun Herbal Bunga Melati Al Ghuroba'","7500"},
{"AGH26","Al-Ghuroba'","Sabun Herbal Sirih Al Ghuroba'","7500"},
{"AGH27","Al-Ghuroba'","Sari Kurma Mumtaz","35000"},
{"AGH28","Al-Ghuroba'","Syifa' Fit 250 gr (Madu + Zaitun + Habbatussauda + Black Seed Oi","42000"},
{"AGH29","Al-Ghuroba'","Syifa' Fit Kapsul Al-Ghuroba' (Madu + Habbatussuda' + zaitun)","40000"},
{"BRU01","Al-Mabruroh By. Serba Alam","Eury - X (Madu Ginseng Pasak Bumi) Al Mabruroh","65000"},
{"BRU02","Al-Mabruroh By. Serba Alam","Madu For Mama (Untuk Ibu Menyusui) Al Mabruroh","60000"},
{"BRU03","Al-Mabruroh By. Serba Alam","Madu Ibu Hamil Al Mabruroh","55000"},
{"BRU04","Al-Mabruroh By. Serba Alam","Madu Lebah Emas Bioflavonoid Al Mabruroh","60000"},
{"BRU05","Al-Mabruroh By. Serba Alam","Madu Maag Al Mabruroh","55000"},
{"BRU06","Al-Mabruroh By. Serba Alam","Madu Manggisa (Madu plus Ekstrak Manggis) Al Mabruroh","80000"},
{"BRU07","Al-Mabruroh By. Serba Alam","Madu Penyubur Kandungan Al Mabruroh","75000"},
{"BRU08","Al-Mabruroh By. Serba Alam","Madu SALAMI (Asam urat + Reumatik) Al Mabruroh","70000"},
{"BRU09","Al-Mabruroh By. Serba Alam","COCOMAXI Santan Bubuk","6000"},
{"QOW01","Al-Qowam","100 Dosa Yang Diremehkan Wanita","37000"},
{"QOW02","Al-Qowam","Bekam Sunnah Nabi dan Mukjizat Medis","27000"},
{"QOW03","Al-Qowam","Berbahagialah Sholat Anda Tak Sia-sia","14900"},
{"QOW04","Al-Qowam","Bersedekahlah Maka Engkau Akan Kaya","23900"},
{"QOW05","Al-Qowam","Fiqih Pengobatan Islami","35000"},
{"QOW06","Al-Qowam","Haji Nabi (Sejak Berbil1t dari Madinah Hingga Kembali, Seakan-a","18900"},
{"QOW07","Al-Qowam","Ibadah Kurban","10900"},
{"QOW08","Al-Qowam","Keajaiban Thibbun Nabawi","43000"},
{"QOW09","Al-Qowam","Khasiat Kurma 'Ajwah (Makanan Sehat dan Obat Nabawi)","17000"},
{"QOW10","Al-Qowam","Misteri Tamu Terakhir","17400"},
{"QOW11","Al-Qowam","Muhasabah (Kiat-kiat Introspeksi Diri Seorang Muslim)","12400"},
{"QOW12","Al-Qowam","Mukjizat Kesembuhan dalam Jintan Hitam, Madu, Bawang Putih dan B","14000"}
  };
  
    
      
  
 do{
 System.out.println("********************************"); 
 System.out.println(" PROGRAM  PENCARIAN DATA PRODUK ");
 System.out.println("*********************************");
 System.out.println("1.  CARI DATA MENURUT ID");
 System.out.println("");
 System.out.println("2. CARI DATAMENURUT PRODUSEN");
 System.out.println("");
 System.out.println("3. CARI DATA MENURUT NAMA BARANG");
 System.out.println("");
 System.out.println("4. CARI DATA MENURUT HARGA");
 System.out.println("");
 System.out.println("5. LIHAT SEMUA DATA");
 System.out.println("");
 
 System.out.print("Input no pilihan anda : ");
 optionn=Integer.parseInt(br.readLine());
 switch(optionn){
 case 1:
 
System.out.print("Input ID: ");
    String id=br.readLine();

    for(int k =0;k<tblHerbal.length;k++){
    if(tblHerbal[k][0].contains(id.toUpperCase() )){
      System.out.println(tblHerbal[k][0]+" "+tblHerbal[k][1]+" "+tblHerbal[k][2]+" "+tblHerbal[k][3]);
      bil1=1;
      }
      else{
      }
      }
       if(bil1==1){
        }
        else{
          System.out.println("data tidak ada ");
        }
 
 
 break;
 case 2 :
 System.out.print("Input Nama Produsen : ");
    String produsen=br.readLine();

    for(int k =0;k<tblHerbal.length;k++){
    if(tblHerbal[k][1].contains(produsen.toUpperCase() )){
      System.out.println(tblHerbal[k][0]+" "+tblHerbal[k][1]+" "+tblHerbal[k][2]+" "+tblHerbal[k][3]);
      bil2=1;
      }
      else{
      }
      }
       if(bil2==1){
        }
        else{ System.out.println("data tidak ada ");
          }
 
 
 break;
 case 3 :
 System.out.print("Input Nama Barang: ");
    String barang=br.readLine();

    for(int k =0;k<tblHerbal.length;k++){
    if(tblHerbal[k][2].contains(barang.toUpperCase() )){
      System.out.println(tblHerbal[k][0]+" "+tblHerbal[k][1]+" "+tblHerbal[k][2]+" "+tblHerbal[k][3]);
      bil3=1;
      }
      else{
      }
      }
       if(bil3==1){
        }
        else{ System.out.println("data tidak ada ");
          }
 
 break;
 case 4:
 System.out.print("Input Harga: ");
    String harga=br.readLine();
    

     for(int k =0;k<tblHerbal.length;k++){
     if(tblHerbal[k][3].equalsIgnoreCase(harga)){
       System.out.println(tblHerbal[k][0]+" "+tblHerbal[k][1]+" "+tblHerbal[k][2]+" "+tblHerbal[k][3]);
       bil4=1;
       }
       else{
       }
       }
       if(bil4==1){
        }
        else{ System.out.println("data tidak ada ");
          }
 
 break;
 case 5 :
 
 for(int k =0;k<tblHerbal.length;k++){
    
      System.out.println(tblHerbal[k][0]+" "+tblHerbal[k][1]+" "+tblHerbal[k][2]+" "+tblHerbal[k][3]);
      bil1=1;
      
      }
 break;
 

         }
 }while(optionn<6);          
}

}