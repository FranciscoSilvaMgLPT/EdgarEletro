public class Aquecedor extends Eletrodomestico {


    public Aquecedor(String type, int maxTemp, int size, String brand) {
        this.type = type;
        this.maxTemp=maxTemp;
        this.size=size;
        this.brand=brand;
    }

    public void arrefecer() {
        for (int i = this.temp; i >= 0; i--) {
            System.out.println("DECREASING TEMP: " + this.temp);
            this.temp--;
        }
        if(temp==0){
            System.out.println("CANT COOL SOMETHING THAT IS ALREADY COOL 😎");
        }
    }

    public void aquecer() {
        if (this.temp == 0) {
            System.out.println("0 temperature?!?! Nice heat..");
        }
        if (this.temp > this.maxTemp) {
            System.out.println("You burned yourself! And the house....");
        }
        if (this.temp > 0 && this.temp <= maxTemp) {
            while (this.temp < this.maxTemp) {
                this.temp++;
                System.out.println(this.temp);
            }
        }
    }

}
