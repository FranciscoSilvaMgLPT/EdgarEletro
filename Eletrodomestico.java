import java.util.Scanner;

public abstract class Eletrodomestico {
    String type;
    int maxTemp;
    int size;
    String brand;
    boolean isOn;

    int temp = 0;

    public Eletrodomestico(String type, int maxTemp, int size, String brand) {
        this.type = type;
        this.maxTemp = maxTemp;
        this.size = size;
        this.brand = brand;
        this.isOn = false;
        this.temp = 0;
    }

    public Eletrodomestico() {

    }

    public void ligar(){
        this.isOn = true;
        System.out.println("LIGANDO...");
    }

    public void desligar(){
        if(this.isOn) {
            this.isOn = false;
            System.out.println("DESLIGANDO...");
        }else{
            System.out.println("OFF? JA ESTA OFF 🥴");
        }
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
