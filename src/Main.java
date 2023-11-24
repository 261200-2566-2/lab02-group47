
public class Main {
    public static void main(String[] args) {
        Airpurifier X = new Airpurifier();
        X.TurnOn();
        X.setBrand("PurifierX");
        X.setScreenColor("Black");
        X.setAQI(300);
        X.SetFanSpeed(2);
        X.Checkquality();
        X.setSerialNumber("k2j34n");
        X.setFontColor("White");
        X.display();
        X.TurnOff();
        System.out.println(Airpurifier.getModelCount());
        System.out.println(Airpurifier.getMostPopularModel());


    }
}