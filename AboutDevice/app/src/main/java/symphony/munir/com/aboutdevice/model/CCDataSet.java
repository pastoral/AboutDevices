package symphony.munir.com.aboutdevice.model;

import java.util.ArrayList;

import symphony.munir.com.aboutdevice.R;

/**
 * Created by munirul.hoque on 4/9/2015.
 */
public class CCDataSet {
    public CCData[] ccData;
    public ArrayList<CCData> customerCarePoints;
    String lang;

   /* private String ccName;
    private String ccAddress;
    private boolean cc = true;
    private int imageUrl;
    int[] a;
    int b;*/


    public CCData[] getEnglishData()
    {

        CCData[] ccAllData = {new CCData("Dhaka (Mirpur11)", "Dhaka","Plot-22 (2nd Floor), Block-D, Road-3, Section-11, Mirpur, Dhaka", true, R.drawable.cc,"en","23.817577" , "90.401567"),
                new CCData("Dhaka (Gulshan)", " Dhaka "," M.H.B Bhaban (2nd  Floor), Holding No. 94, (D.I.T.) Mohakhali, Gulshan ", true, R.drawable.cc,"en"," 23.780744 " , " 90.401567 "),
                new CCData("Dhaka (Motijheel)", " Dhaka "," Saleh Sadan (1st Floor), 145 Motijheel C/A, Dhaka", true, R.drawable.cc,"en"," 23.730368" , " 90.416542"),
                new CCData("Dhaka(Uttara)", " Dhaka "," Plot No. 2, Road No. 2, Sector 11, (Behind Dutch Bangla Bank Ltd.), Uttara Residential Area,Dhaka", true, R.drawable.cc,"en"," 23.875122" , " 90.392995"),
                new CCData("Dhaka(Savar)", " Dhaka "," Islam Plaza (2nd Floor),A - 63/14, Bazar Road, Savar, Dhaka.", true, R.drawable.cc,"en"," 23.847205" , " 90.254553"),
                new CCData("Dhaka(Mirpur-1)", " Dhaka "," House No-14/15 (2nd Floor), Darus Salam Road, Mirpur-1,Dhaka", true, R.drawable.cc,"en"," 23.794897" , " 90.353193"),
                new CCData("Dhaka(Bashundhara City)", " Dhaka "," Shop # 3, 4, & 5, Level-5, Block-B, Bashundhara City, Panthapath, Dhaka.", true, R.drawable.cc,"en"," 23.751047" , " 90.390745"),
                new CCData("Dhaka(Jatrabari)", " Dhaka "," S.A Tower (2nd Floor),101 Dolaipar,Jatrabari,Dhaka.", true, R.drawable.cc,"en"," 23.702403" , " 90.435128"),
                new CCData("Barisal", " Barisal "," 109, (3rd Floor), Sadar Road, Barisal", true, R.drawable.cc,"en"," 22.704023" , " 90.370379"),
                new CCData("Bogra ", " Bogra  "," Lutfa Plaza (1st Floor), College Road, Kalitola, Bogra 5800", true, R.drawable.cc,"en"," 24.857549" , " 89.372744"),
                new CCData("Chittagong(Agrabad) ", " Chittagong "," Ample Commercial Building (2nd Floor), 2315 S.K. Mujib Road, Badamtoli, Agrabad, Chittagong ", true, R.drawable.cc,"en"," 22.327887 " , " 91.812171 "),
                new CCData("Chittagong(Keranihat)", " Chittagong "," Sunmoon Shopping City (2nd Floor), Keranihat, Satkania, Chittagong. ", true, R.drawable.cc,"en"," 22.102883" , " 92.072769"),
                new CCData("Chuadanga", " Chuadanga"," Sara Bhaban (3rd Floor), Shahid Abul Kashem Sarak, Ekademir Mor, Chuadanga", true, R.drawable.cc,"en"," 23.642947" , " 88.853174"),
                new CCData("Comilla", " Comilla "," Khan Mansion (2nd floor), Modhumoti Cinema Hall Market, Chatipotti, Rajgonj, Comilla-3500", true, R.drawable.cc,"en"," 23.463079" , " 91.188277"),
                new CCData("Dinajpur", " Dinajpur"," Aftab Plaza (2nd Floor), Sadar Hospital Road, (Near Jora Bridge), Munshipara, Dinajpur", true, R.drawable.cc,"en"," 25.626813" , " 88.637604"),
                new CCData("Faridpur", " Faridpur"," R.K Plaza (2nd floor), Nearby Raffles in hotel, 244, Hazratala, Gowal chamot, Faridpur", true, R.drawable.cc,"en"," 23.600848" , " 89.828615"),
                new CCData("Feni", " Feni"," R Mohipal Plaza, Level #4, Shahid Shahidullah Kaisar Road (SSK), Mohipal, Feni", true, R.drawable.cc,"en"," 23.003254" , " 91.225857"),
                new CCData("Gazipur", " Gazipur"," R Rahman Shopping Mall (3rd floor), Block-A, Chandona Chowrasta, Joydevpur Road, Gazipur", true, R.drawable.cc,"en"," 23.989370" , "90.383150"),
                new CCData("Jamalpur", " Jamalpur"," Jahanara Complex (3rd Floor), 1196-00, Jame Masjid Road, East Tomaltola, Jamalpur-2000", true, R.drawable.cc,"en"," 24.927666" , " 89.947751"),
                new CCData("Jessore", " Jessore"," SONY RANGS Building (1st Floor), 1449 Rail Road, Jessore 7400", true, R.drawable.cc,"en"," 23.161643" , " 89.212028"),
                new CCData("Jhenaidah", " Jhenaidah"," Sakib Tower (2nd Floor), 46 H.S.S Road (Opposite side of Azad Rest House), Jhenaidah 1012", true, R.drawable.cc,"en"," 23.544253" , " 89.178118"),
                new CCData("Khulna", " Khulna"," Nawshin Tower (1st Floor), 1 K.D.A. Avenue, Khulna", true, R.drawable.cc,"en"," 22.819672" , " 89.555161"),
                new CCData("Kisoreganj", " Kisoreganj"," Jamia Rashid Market (2nd floor), Puran Thana, Kisoreganj", true, R.drawable.cc,"en"," 24.433704" , " 90.788537 "),
                new CCData("Kushtia", " Kushtia"," 94/3,(2nd floor), Kazi Market (Opposite to Govt. Girls School), N.S Road, Kushtia", true, R.drawable.cc,"en"," 23.907202" , " 89.132990 "),
                new CCData("Mymensingh", " Mymensingh"," 3/1 & 3/2, (2nd floor), Kali Bari Road, Kotwali, Mymensingh", true, R.drawable.cc,"en"," 24.756979" , " 90.413178 "),
                new CCData("Naogaon", " Naogaon"," House No. 3814 (2nd Floor), Shampriti Plaza,  Kazir Mor, Naogaon ", true, R.drawable.cc,"en"," 24.817185" , " 88.939299 "),
                new CCData("Narayangonj", " Narayangonj"," House No. 3814 (2nd Floor), Shampriti Plaza,  Kazir Mor, Naogaon ", true, R.drawable.cc,"en"," 23.623734" , " 90.498607 "),
                new CCData("Narsingdhi", " Narsingdhi"," Sultan Uddin Shopping Complex (1st Floor), Bazirmorr, Narsingdhi", true, R.drawable.cc,"en"," 23.926071" , " 90.720677 "),
                new CCData("Natore", " Natore"," Niloy (1st floor), 460 Fouzdaripara, Nicha Bazar, Natore 6400", true, R.drawable.cc,"en"," 24.413111" , " 88.983944 "),
                new CCData("Netrokona", " Netrokona"," Niloy (1st floor), 460 Fouzdaripara, Nicha Bazar, Natore 6400", true, R.drawable.cc,"en"," 24.884948" , " 90.732951 "),
                new CCData("Nilphamari", " Nilphamari"," Zila Parisad Super Market (Shop No-227 & 228), (1st floor), Chourongi Moor, Nilphamari", true, R.drawable.cc,"en"," 25.927979" , " 88.856049 "),
                new CCData("Pabna", " Pabna"," Afaz Market' (1st Floor) Holding no.-1224, Panch Matha More, Ataikula Road, Dilalpur, Pabna", true, R.drawable.cc,"en"," 24.007113" , " 89.239255 ")


        };
        ccData = ccAllData;
        return ccData;
    }


    public CCData[] getBanglaData()
    {

        CCData[] ccAllData = {
                new CCData("ঢাকা (মিরপুর ১১)", "Dhaka"," প্লট-২২ (৩য় তলা), ব্লক- ডি, রোড-৩, সেকশন-১১, মিরপুর, ঢাকা", true, R.drawable.cc,"bn","23.817577" , "90.401567"),
                new CCData("ঢাকা (মহাখালী)", " Dhaka "," এম এইচ বি ভবন (৩য় তলা), বাড়ী-৯৪ (ডি আই টি), মহাখালী, গুলশান, ঢাকা।", true, R.drawable.cc,"bn"," 23.780744 " , " 90.401567 "),
                new CCData("ঢাকা (মতিঝিল)", "Dhaka "," সালেহ সদন( ২য় তলা), ১৪৫-মতিঝিল, সি/এ, ঢাকা।", true, R.drawable.cc,"bn"," 23.730368" , "90.416542"),
                new CCData("ঢাকা (উত্তরা)", "Dhaka "," বাড়ী # বি/১ (২য় তলা) , প্লট # ০২,  রোড# ১১, সেক্টর # ৬ উত্তরা, ঢাকা।", true, R.drawable.cc,"bn"," 23.875122" , "90.392995"),
                new CCData("ঢাকা (সাভার)", "Dhaka "," ইসলাম প্লাজা (৩য় তলা), এ-৬৩/১৪, বাজার রোড, সাভার।", true, R.drawable.cc,"bn"," 23.847205" , "90.254553"),
                new CCData("ঢাকা (মিরপুর-১)", "Dhaka "," বাড়ী # ১৪/১৫ (২য় তলা), দারুস সালাম রোড, মিরপুর-১, ঢাকা", true, R.drawable.cc,"bn"," 23.794897" , " 90.353193"),
                new CCData("ঢাকা (বসুন্ধরা সিটি)", "Dhaka "," শপ# ৩,৪ ও ৫, লেভেল-৫, বসুন্ধরা সিটি, পান্থপথ, ঢাকা।", true, R.drawable.cc,"bn"," 23.751047" , " 90.390745"),
                new CCData("ঢাকা (যাত্রাবাড়ী)", "Dhaka "," এস.এ টাওয়ার (৩য় তলা) , ১০১ ধোলাইপাড়, যাত্রাবাড়ী, ঢাকা।", true, R.drawable.cc,"bn"," 23.702403" , " 90.435128"),
                new CCData("বরিশাল","Barisal "," ১০৯(৪র্থ তলা), সদর রোড, বরিশাল।", true, R.drawable.cc,"bn"," 22.704023" , " 90.370379"),
                new CCData("বগুড়া","Bogra "," লুতফা প্লাজা (২য় তলা), কলেজ রোড, কালীতলা, বগুড়া।", true, R.drawable.cc,"bn"," 24.857549" , " 89.372744"),
                new CCData("চট্রগ্রাম (আগ্রাবাদ)","Chittagong "," এ্যামপল কমাশিয়াল ভবন (৩য় তলা), ২৩১৫ এস কে মুজিব রোড়, বাদাম তলী, আগ্রাবাদ, চিটাগং।", true, R.drawable.cc,"bn"," 22.327887" , " 91.812171"),
                new CCData("চট্রগ্রাম (কেরানীহাট)","Chittagong "," সানমুন শপিং সিটি (৩য় তলা), কেরানীহাট, সাতকানীয়া,চিটাগং।", true, R.drawable.cc,"bn"," 22.102883" , " 92.072769"),
                new CCData("চুয়াডাঙ্গা","Chuadanga"," বাড়ী-১৫(২য় তলা), রোড়-২০, ব্লক-এন, কবরী রোড, চুয়াডাঙ্গা।", true, R.drawable.cc,"bn"," 23.642947" , " 88.853174"),
                new CCData("কুমিল্লা", " Comilla "," খান ম্যানশন(২য় তলা), মধুমতি সিনেমা হল মার্কেট, চতিপট্টি, রাজগঞ্জ, কুমিল্লা।", true, R.drawable.cc,"bn"," 23.463079" , " 91.188277"),
                new CCData("দিনাজপুর	", " Dinajpur"," আফতাব প্লাজা (৩য় তলা), সদর হাসপাতাল রোড, মুন্সিপাড়া, দিনাজপুর।", true, R.drawable.cc,"bn"," 25.626813" , " 88.637604"),
                new CCData("ফরিদপুর", " Faridpur"," R আর. কে. প্লাজা (৩য় তলা), ২৪৪ হাজরাতলা, গোয়াল চামট, ফরিদপুর।", true, R.drawable.cc,"bn"," 23.600848" , " 89.828615"),
                new CCData("ফেনী", " Feni"," ভুইয়া সাইকেল মার্ট (৩য় তলা),এস. এস. কে রোড, মহিপাল, ফেনী।", true, R.drawable.cc,"bn"," 23.003254" , " 91.225857"),
                new CCData("গাজীপুর", " Gazipur"," রহমান শপিং মল (৪র্থ তলা), ব্লক # এ, চন্দনা চৌরাস্তা, জয়দেবপুর, গাজীপুর।", true, R.drawable.cc,"bn"," 23.989370" , "90.383150"),
                new CCData("জামালপুর", " Jamalpur"," জাহানারা কমপ্লেক্স(৪র্থ তলা), জামে মসজিদ রোড, পূর্ব তমালতলা, জামালপুর।", true, R.drawable.cc,"bn"," 24.927666" , " 89.947751"),
                new CCData("যশোর", " Jessore"," সনি i¨vsMm ভবন(২য় তলা), ১৪৪৯ রেলরোড, যশোর।", true, R.drawable.cc,"bn"," 23.161643" , " 89.212028"),
                new CCData("ঝিনাইদহ", " Jhenaidah "," সাকিব টাওয়ার (৩য় তলা, ৪৬, এইচ এস এস রোড (আজাদ রেস্ট হাউস এর বিপরীত পাশে), ঝিনাইদহ।", true, R.drawable.cc,"en"," 23.544253" , " 89.178118"),
                new CCData("খুলনা", " Khulna"," নওশীন টাওয়ার (২য় তলা) ১১, কে ডি এ এ্যাভিনিউ, খুলনা।", true, R.drawable.cc,"bn"," 22.819672" , " 89.555161"),
                new CCData("কিশোরগঞ্জ", " Kisoreganj "," জামিয়া রশিদ মার্কেট(৩য় তলা, পুরান থানা, কিশোরগঞ্জ।", true, R.drawable.cc,"bn"," 24.433704" , " 90.788537 "),
                new CCData("কুষ্টিয়া", " Kushtia", "৯৪/৩(৩য় তলা), কাজী মার্কেট, এন এস রোড, কুষ্টিয়া।", true, R.drawable.cc,"bn"," 23.907202" , " 89.132990 "),
                new CCData("ময়মনসিংহ", " Mymensingh"," ৩/১ ও ৩/২(৩য় তলা), কালি বারি রোড, কোতওয়ালি, ময়মনসিংহ।", true, R.drawable.cc,"bn"," 24.756979" , " 90.413178 "),
                new CCData("নওগাঁ", " Naogaon"," House No. 3814 (2nd Floor), Shampriti Plaza,  Kazir Mor, Naogaon ", true, R.drawable.cc,"bn"," 24.817185" , " 88.939299 "),
                new CCData("নারায়নগঞ্জ", " Narayangonj"," ২০৮/২এ, হাজী ম্যানসন (৪র্থ তলা), বঙ্গবন্ধু রোড, চৌরাস্তা বালুর মাঠ, নারায়নগঞ্জ।", true, R.drawable.cc,"bn"," 23.623734" , " 90.498607 "),
                new CCData("নরসিংদী", " Narsingdhi"," সুলতান উদ্দিন শপিং কমপ্লেক্স (২য় তলা), বাজির মোড়, নরসিংদী।", true, R.drawable.cc,"bn"," 23.926071" , " 90.720677 "),
                new CCData("নাটোর", " Natore"," নিলয় (২য় তলা),৪৬০ পৌজদারী পাড়া, নীচা বাজার, নাটোর।", true, R.drawable.cc,"bn"," 24.413111" , " 88.983944 "),
                new CCData("নেত্রকোনা", " Netrokona"," হিল্লল মার্কেট (৩য় তলা), টেরি বাজার, নেত্রকোনা।", true, R.drawable.cc,"bn"," 24.884948" , " 90.732951 "),
                new CCData("নিলফামারী", " Nilphamari"," জিলা পরিষদ মাকেট (দোকান # ২২৭ & ২২৮), ২য় তলা, চৌরঙ্গী মোড়, নিলফামারী।", true, R.drawable.cc,"en"," 25.927979" , " 88.856049 "),
                new CCData("পাবনা", " Pabna"," আফাজ মাকেট (২য় তলা), বাড়ী# ১২২৪, পাঁচ মাথা মোড়, আতাইকুলা রোড, দিলালপুর, পাবনা।", true, R.drawable.cc,"en"," 24.007113" , " 89.239255 ")


        };
        ccData = ccAllData;
        return ccData;
    }
   /* public ArrayList<CCData> getCustomerCarePoints()
    {
        try {
            customerCarePoints = new ArrayList<CCData>(Arrays.asList(ccData));
            return customerCarePoints;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            Log.i("illegal data", e.toString());
            return null;
        }
    }*/

    public CCData[] getCustomerCarePoints()
    {
        return ccData;
    }

    public String getCCLang()
    {


        return ccData[1].getLang();
    }
  /*  public void getArray(String[] ccArray)
    {
        int count = 0;
        String substring = "~";
        //int index = theString.indexOf(substring);
        for(int i = 0; i < ccArray.length; i++)
        {

           b = ccArray[i].indexOf(substring);
           // a[count] = ccArray[i].indexOf(substring);
           /* for(int j = 0; j < 3; j++)
            {
                a[count] = ccArray[j].indexOf(substring);
                count++;
            }*/




}
