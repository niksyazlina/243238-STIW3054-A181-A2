package myAssignment2;

public class Table {

    private String Num;
    private String Name;
    private String FieldID;
    private String Fed;
    private String Rtg;
    private String ClubCity;

    public Table(String num, String name, String fieldID, String fed, String rtg, String clubCity) {
        Num = num;
        Name = name;
        FieldID = fieldID;
        Fed = fed;
        Rtg = rtg;
        ClubCity = clubCity;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFieldID() {
        return FieldID;
    }

    public void setFieldID(String fieldID) {
        FieldID = fieldID;
    }

    public String getFed() {
        return Fed;
    }

    public void setFed(String fed) {
        Fed = fed;
    }

    public String getRtg() {
        return Rtg;
    }

    public void setRtg(String rtg) {
        Rtg = rtg;
    }

    public String getClubCity() {
        return ClubCity;
    }

    public void setClubCity(String clubCity) {
        ClubCity = clubCity;
    }
}
