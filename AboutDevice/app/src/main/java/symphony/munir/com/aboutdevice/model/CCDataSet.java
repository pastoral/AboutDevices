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

        CCData[] ccAllData = {new CCData("Barishal", "Barishal","109 (3rd Floor), Sadar Road, Barisal 109 (3rd Floor), Sadar Road, Barisal", true, R.drawable.cc,"en","22.704023" , "90.370379"),
                new CCData("Rangpur","Rangpur", "Hatil Tower (1st Floor) Dhap, Jail Road (South side of Dhap Boro Masjid), Rangpur", true, R.drawable.cc, "en", "25.761077" , "89.235719"),
                new CCData("Chittagong", "Chittagong","Ample Commercial Building (2nd Floor), 2315 S.K. Mujib Road, Badamtoli, Agrabad, Chittagong", true, R.drawable.cc, "en" , "22.102883" , "92.072769"),
                new CCData("Dhaka(Mirpur-11)", "Dhaka","Plot-22 (2nd Floor), Block-D, Road-3, Section-11, Mirpur, Dhaka", true, R.drawable.cc,"en","23.817577" , "90.401567"),
                new CCData("Barishal", "Barishal","109 (3rd Floor), Sadar Road, Barisal 109 (3rd Floor), Sadar Road, Barisal", true, R.drawable.cc,"en","22.704023" , "90.370379"),
                new CCData("Rangpur","Rangpur", "Hatil Tower (1st Floor) Dhap, Jail Road (South side of Dhap Boro Masjid), Rangpur", true, R.drawable.cc, "en", "25.761077" , "89.235719"),
                new CCData("Chittagong", "Chittagong","Ample Commercial Building (2nd Floor), 2315 S.K. Mujib Road, Badamtoli, Agrabad, Chittagong", true, R.drawable.cc, "en" , "22.102883" , "92.072769"),
                new CCData("Dhaka", "Dhaka","Plot-22 (2nd Floor), Block-D, Road-3, Section-11, Mirpur, Dhaka", true, R.drawable.cp, "en", "23.82182","90.36694"),
                new CCData("Barishal", "Barishal","109 (3rd Floor), Sadar Road, Barisal 109 (3rd Floor), Sadar Road, Barisal", true, R.drawable.cc,"en","22.704023" , "90.370379"),
                new CCData("Rangpur","Rangpur", "Hatil Tower (1st Floor) Dhap, Jail Road (South side of Dhap Boro Masjid), Rangpur", true, R.drawable.cc, "en", "25.761077" , "89.235719"),
                new CCData("Chittagong", "Chittagong","Ample Commercial Building (2nd Floor), 2315 S.K. Mujib Road, Badamtoli, Agrabad, Chittagong", true, R.drawable.cc, "en" , "22.102883" , "92.072769"),
                new CCData("Dhaka", "Dhaka","Plot-22 (2nd Floor), Block-D, Road-3, Section-11, Mirpur, Dhaka", true, R.drawable.cp, "en", "23.82182","90.36694"),
                new CCData("Barishal", "Barishal","109 (3rd Floor), Sadar Road, Barisal 109 (3rd Floor), Sadar Road, Barisal", true, R.drawable.cc,"en","22.704023" , "90.370379"),
                new CCData("Rangpur","Rangpur", "Hatil Tower (1st Floor) Dhap, Jail Road (South side of Dhap Boro Masjid), Rangpur", true, R.drawable.cc, "en", "25.761077" , "89.235719"),
                new CCData("Chittagong", "Chittagong","Ample Commercial Building (2nd Floor), 2315 S.K. Mujib Road, Badamtoli, Agrabad, Chittagong", true, R.drawable.cc, "en" , "22.102883" , "92.072769"),
                new CCData("Dhaka", "Dhaka","Plot-22 (2nd Floor), Block-D, Road-3, Section-11, Mirpur, Dhaka", true, R.drawable.cp, "en", "23.82182","90.36694")

        };
        ccData = ccAllData;
        return ccData;
    }


    public CCData[] getBanglaData()
    {

        CCData[] ccAllData = {new CCData("বরিশাল", "বরিশাল","অশ্বনীকুমার টাউনহল, দুর্গাসাগর দিঘী, মুকুন্দ দাসের কালিবাড়ী", true, R.drawable.cc,"bn","22.704023" , "90.370379"),
                new CCData("রংপুর", "রংপুর","রানিপুকুর ও লতিবপুর ইউনিয়নের নিঝাল, ভিকনপুর, মামুদপুর", true, R.drawable.cc,"bn","25.761077" , "89.235719"),
                new CCData("চট্টগ্রাম", "চট্টগ্রাম", " লালদিঘী ও লালদিঘী ময়দান, বদর আউলিয়ার দরগা, বায়েজিদ বোস্তামীর মাজার", true, R.drawable.cc,"bn", "22.36667" , "91.80000"),
                new CCData("ঢাকা (মিরপুর-১১)", "Dhaka"," প্লট-২২ (৩য় তলা), ব্লক- ডি, রোড-৩, সেকশন-১১, মিরপুর, ঢাকা", true, R.drawable.cc,"bn","23.817577" , "90.401567"),
                new CCData("বরিশাল", "বরিশাল","অশ্বনীকুমার টাউনহল, দুর্গাসাগর দিঘী, মুকুন্দ দাসের কালিবাড়ী", true, R.drawable.cc,"bn","22.704023" , "90.370379"),
                new CCData("রংপুর", "রংপুর","রানিপুকুর ও লতিবপুর ইউনিয়নের নিঝাল, ভিকনপুর, মামুদপুর", true, R.drawable.cc,"bn","25.761077" , "89.235719"),
                new CCData("চট্টগ্রাম", "চট্টগ্রাম", " লালদিঘী ও লালদিঘী ময়দান, বদর আউলিয়ার দরগা, বায়েজিদ বোস্তামীর মাজার", true, R.drawable.cc,"bn", "22.36667" , "91.80000"),
                new CCData("ঢাকা", "ঢাকা","হাউজ#৪৩, রোড#১৬ (নতুন), ২৭ (পুরাতন), ধানমন্ডি, ঢাকা", true, R.drawable.cp,"bn","23.82182","90.36694"),
                new CCData("বরিশাল", "বরিশাল","অশ্বনীকুমার টাউনহল, দুর্গাসাগর দিঘী, মুকুন্দ দাসের কালিবাড়ী", true, R.drawable.cc,"bn","22.704023" , "90.370379"),
                new CCData("রংপুর", "রংপুর","রানিপুকুর ও লতিবপুর ইউনিয়নের নিঝাল, ভিকনপুর, মামুদপুর", true, R.drawable.cc,"bn","25.761077" , "89.235719"),
                new CCData("চট্টগ্রাম", "চট্টগ্রাম", " লালদিঘী ও লালদিঘী ময়দান, বদর আউলিয়ার দরগা, বায়েজিদ বোস্তামীর মাজার", true, R.drawable.cc,"bn", "22.36667" , "91.80000"),
                new CCData("ঢাকা", "ঢাকা","হাউজ#৪৩, রোড#১৬ (নতুন), ২৭ (পুরাতন), ধানমন্ডি, ঢাকা", true, R.drawable.cp,"bn","23.82182","90.36694"),
                new CCData("বরিশাল", "বরিশাল","অশ্বনীকুমার টাউনহল, দুর্গাসাগর দিঘী, মুকুন্দ দাসের কালিবাড়ী", true, R.drawable.cc,"bn","22.704023" , "90.370379"),
                new CCData("রংপুর", "রংপুর","রানিপুকুর ও লতিবপুর ইউনিয়নের নিঝাল, ভিকনপুর, মামুদপুর", true, R.drawable.cc,"bn","25.761077" , "89.235719"),
                new CCData("চট্টগ্রাম", "চট্টগ্রাম", " লালদিঘী ও লালদিঘী ময়দান, বদর আউলিয়ার দরগা, বায়েজিদ বোস্তামীর মাজার", true, R.drawable.cc,"bn", "22.36667" , "91.80000"),
                new CCData("ঢাকা", "ঢাকা","হাউজ#৪৩, রোড#১৬ (নতুন), ২৭ (পুরাতন), ধানমন্ডি, ঢাকা", true, R.drawable.cp,"bn","23.82182","90.36694")
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
