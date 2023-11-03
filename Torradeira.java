public class Torradeira extends Eletrodomestico{

    int maxTorradas;


    public Torradeira(String type, int maxTemp, int size, String brand) {
        super(type, maxTemp, size, brand);
        this.maxTorradas = 2;
    }

    public void torrar(){
        if(temp>0 && temp<=maxTemp){
            System.out.println("Torrei me");
        }else{
            System.out.println("Torraste a casa");
        }

    }


}
