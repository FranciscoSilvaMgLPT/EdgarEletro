public class Forno extends Eletrodomestico{

    int capacidade;
    boolean embutido;
    int temporizador;

    public Forno(String type, int maxTemp, int size, String brand) {
        super(type, maxTemp, size, brand);
    }

    @Override
    public int getTemp() {
        return super.getTemp();
    }

    public void roast(){
        if(this.isOn) {
            if(temp<=maxTemp) {
                setTemporizador(temporizador);
                System.out.println("ROASTED.");
                for (int i = temporizador; i >= 0; i--) {
                    System.out.println("TEMPO:" + temporizador);
                    temporizador--;
                }
            }else{
                System.out.println("House burned! 🔥🔥🔥");
            }
        }else{
            System.out.println("Liga me primeiro!!!");
        }
    }

    public void setTemporizador(int temporizador){
        this.temporizador=temporizador;
    }



}
