package symphony.munir.com.aboutdevice.model;

/**
 * Created by munirul.hoque on 4/8/2015.
 */
public class CCData {
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

}
