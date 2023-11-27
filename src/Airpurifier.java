import java.util.Random;
public class Airpurifier {
    String Serial_Number;
    String FontColor;
    String power;
    String brand;
    String air_quality;
    int aqi;
    String screencolor;
    String  Fan;


    //instance Methods
    static int modelCount;

    public Airpurifier() {
        power = "OFF";
        aqi = 0;
        Fan = "off";
        modelCount = generateModelCount();
    }
    public void display(){
        System.out.println("--------------------");
        System.out.println("Power -> "+ power);
        System.out.println("AQI -> "+ aqi);
        System.out.println("Airquality -> "+ air_quality);
        System.out.println("Fan speed -> "+ Fan);
        System.out.println("Brand -> "+ brand);
        System.out.println("Serial Number -> "+ Serial_Number);
        System.out.println("Screen Color -> "+ screencolor);
        System.out.println("Font Color -> "+ FontColor);
        System.out.println("--------------------");
    }

    public void Checkquality() {
        if(aqi < 26) {
            air_quality = "VERY GOOD";
        }else if(aqi < 51){
            air_quality = "GOOD";
        }else if(aqi < 101){
            air_quality = "MODERATE";
        }else if(aqi < 201){
            air_quality = "BAD";
        }else{
            air_quality = "VERY BAD";
        }
    }
    public void SetFanSpeed(int Fanspeed) {
        if(Fanspeed <= 0) {
            Fan = "off";
        }else if(Fanspeed <= 1){
            Fan = "low";
        }else if(Fanspeed <= 2){
            Fan = "medium";
        }else if(Fanspeed <= 3){
            Fan = "high";
        }
    }


    void TurnOn() {power = "ON";
        System.out.println("POWER ON");}
    void TurnOff() {power = "OFF";
        System.out.println("POWER OFF");}





    public void setFontColor(String FontColor){
        this.FontColor = FontColor;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setAirQuality(String air_quality){
        this.air_quality = air_quality;
    }
    public void setAQI(int aqi){
        this.aqi = aqi;
    }
    public void setScreenColor(String screencolor){
        this.screencolor = screencolor;
    }
    public void setSerialNumber(String Serial_Number){
        this.Serial_Number = Serial_Number;
    }
    public static int getModelCount(){
        return modelCount;
    }
    public static String getMostPopularModel(){
        return "X-234";
    }
    private int generateModelCount() {
        Random rand = new Random();
        return rand.nextInt(9999999);
    }
}
