package kantason.daikin.co.th.daikinairlesson1.utility;

public class MyConstant {

//    private String urlInfoString = "http://192.168.1.108/aircon/get_control_info";
    private  String urlInfoString = "/aircon/get_control_info";
    private String urlSetPowerString = "/aircon/set_control_info?pow=";
    private String urlSetModeString = "/aircon/set_control_info?mode=";




    private String[] frateStrings = new String[]{"Auto","Silent","Level 1","Level 2","Level 3","Level 4","Level 5"};
    private String[] fDirStrings = new String[]{"OFF","Vertical","Horizontal","3D"};

    public String getUrlSetModeString() {
        return urlSetModeString;
    }

    public String getUrlSetPowerString() {
        return urlSetPowerString;
    }

    public String[] getfDirStrings() {
        return fDirStrings;
    }

    public String[] getFrateStrings() {
        return frateStrings;
    }

    public String getUrlInfoString() {

        return urlInfoString;
    }
}   // main class
