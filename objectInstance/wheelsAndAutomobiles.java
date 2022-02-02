package objectInstance;

public class wheelsAndAutomobiles {

    String automobileName;
    String automobileType;
    int automobilePrice;


    public wheelsAndAutomobiles(String automobileName, String automobileType, int automobilePrice){
        this.automobileName = automobileName;
        this.automobileType = automobileType;
        this.automobilePrice = automobilePrice;
    }


    public void setAutomobileName(String brandName){
        this.automobileName = brandName;
    }

    public void setAutomobileType(String brandType){
        this.automobileType = brandType;
    }

    public void setAutomobilePrice(int expensive){
        this.automobilePrice = expensive;
    }

    public String getAutomobileName(){
        return automobileName;
    }

    public String getAutomobileType(){
        return automobileType;
    }

    public int getAutomobilePrice(){
        return automobilePrice;
    }

    public static void main(String[] args) {
        wheelsAndAutomobiles autoOne = new wheelsAndAutomobiles("audi", "Sedan", 12);

        System.out.println(autoOne.automobileName);
        System.out.println(autoOne.automobileType);
        System.out.println(autoOne.automobilePrice);
    }

}
