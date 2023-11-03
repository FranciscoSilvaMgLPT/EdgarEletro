import java.util.Scanner;

public class Main {

    static Forno forno = new Forno("Eletrico", 280, 20, "Bosch");
    static Aquecedor aquecedor = new Aquecedor("Carvao", 45, 5, "Chinoca");
    static Torradeira torradeira = new Torradeira("Pedra", 30, 40, "BIMBI");
    static Scanner sc = new Scanner(System.in);
    static int option;
    static boolean keep = true;

    public static void main(String[] args) {
        app();
    }

    public static void app() {

        while (keep) {
            System.out.print("HELLO!!!\nChoose your thing!\n[1]-FORNO\n[2]-AQUECEDOR\n[3]-TORRADEIRA\n[0]-EXIT\n\nOption:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    fornoPlay();
                    break;
                case 2:
                    aquecedorPlay();
                    break;
                case 3:
                    torradeiraPlay();
                    break;
                case 0:
                    System.out.println("Taaaa xau.... 😭😭😭");
                    keep = false;
                    break;
                default:
                    System.out.println("Ahm?!?");
            }
        }
    }

    public static void fornoPlay() {
        while (option != 0) {
            System.out.println("HELLO FORNO! WHAT YOU WANT TO DO?");
            System.out.print("[1]-TURN ON/TURN OFF\n[2]-ROAST\n[3]-TIMER\n[4]-SELECT TEMPERATURE\n[5]-CHECK BRAND\n[0]-EXIT\nOPTION:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("1-ON   2-OFF\nOPTION:");
                    option = sc.nextInt();
                    switch (option) {
                        case 1:
                            forno.ligar();
                            break;
                        case 2:
                            forno.desligar();
                            break;
                    }
                    break;
                case 2:
                    forno.roast();
                    break;
                case 3:
                    System.out.print("Introduce timer:");
                    option = sc.nextInt();
                    forno.setTemporizador(option);
                    break;
                case 4:
                    System.out.print("Introduce temperature:");
                    option = sc.nextInt();
                    forno.setTemp(option);
                    break;
                case 5:
                    System.out.println("Brand is " + forno.brand);
                    break;
                case 0:
                    app();
                    break;
                default:
                    System.out.println("Ahm?!?");
                    fornoPlay();
            }
        }
    }

    public static void aquecedorPlay() {
        System.out.println("HELLO AQUECEDOR! WHAT YOU WANT TO DO?");
        System.out.print("[1]-TURN ON/TURN OFF\n[2]-HEAT\n[3]-COOL\n[4]-SELECT TEMPERATURE\n[5]-CHECK BRAND\n[0]-EXIT\nOPTION:");
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.print("1-ON   2-OFF\nOPTION:");
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        aquecedor.ligar();
                        break;
                    case 2:
                        aquecedor.desligar();
                        break;
                }
            case 2:
                System.out.println("HEATING....");
                aquecedor.aquecer();
                break;
            case 3:
                aquecedor.arrefecer();
                break;
            case 4:
                System.out.print("Introduce temperature:");
                option = sc.nextInt();
                aquecedor.setTemp(option);
                break;
            case 5:
                System.out.println("Brand is " + aquecedor.brand);
                break;
            case 0:
                app();
                break;
            default:
                System.out.println("Ahm?!?");
                aquecedorPlay();
        }
    }

    public static void torradeiraPlay() {
        while (option != 0) {
            System.out.println("HELLO TORRADEIRA! WHAT YOU WANT TO DO?");
            System.out.print("[1]-TURN ON/TURN OFF\n[2]-ROAST\n[3]-SELECT TEMPERATURE\n[4]-CHECK BRAND\n[0]-EXIT\nOPTION:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("1-ON   2-OFF\nOPTION:");
                    option = sc.nextInt();
                    switch (option) {
                        case 1:
                            torradeira.ligar();
                            break;
                        case 2:
                            torradeira.desligar();
                            break;
                    }
                    break;
                case 2:
                    torradeira.torrar();
                    break;
                case 3:
                    System.out.print("Introduce temperature:");
                    option = sc.nextInt();
                    torradeira.setTemp(option);
                    break;
                case 4:
                    System.out.println("Brand is " + torradeira.brand);
                    break;
                case 0:
                    app();
                    break;
                default:
                    System.out.println("Ahm?!?");
                    torradeiraPlay();
            }
        }
    }
}