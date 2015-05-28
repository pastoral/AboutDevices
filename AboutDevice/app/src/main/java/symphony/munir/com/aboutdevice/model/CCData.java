package symphony.munir.com.aboutdevice.model;

import java.util.Comparator;

/**
 * Created by munirul.hoque on 4/8/2015.
 */
public class CCData implements Comparable<CCData> {
    private String ccName;
    private String ccText;
    private String ccAddress;
    private boolean cc;
    private int imageUrl;
    private String lang;
    private String latitude;
    private String longitude;


    public String getCcText() {
        return ccText;
    }

    public void setCcText(String ccText) {
        this.ccText = ccText;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public CCData(String ccName, String ccText, String ccAddress, boolean cc, int imageUrl, String lang, String latitude, String longitude )
    {
        this.ccName = ccName;
        this.ccAddress = ccAddress;
        this.cc = cc;
        this.imageUrl = imageUrl;
        this.lang = lang;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ccText = ccText;

    }

    public String getCcAddress() {
        return ccAddress;
    }

    public void setCcAddress(String ccAddress) {
        this.ccAddress = ccAddress;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public boolean isCc() {
        return cc;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }



    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCc(boolean cc) {
        this.cc = cc;
    }
    public String getLang() {
        return lang;
    }

    @Override
    public int compareTo(CCData ccData) {
        return 0;
    }
    public static Comparator<CCData>ccDataComparator = new Comparator<CCData>()
    {
        public int compare(CCData ccData1 , CCData ccData2)
        {
            String cc1 = ccData1.getCcText().trim();
            String cc2 = ccData2.getCcText().trim();
            return cc1.compareTo(cc2);
        }
    };
}
