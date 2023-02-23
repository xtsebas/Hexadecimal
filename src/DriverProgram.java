import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cual desea? \n1. De Hexadecimal a Binario\n2. De Binario a Hexadecimal");
        int option = in.nextInt();
        in.nextLine();
        switch (option){
            case 1:
                System.out.println("Ingrese su numero en hexadecimal");
                String hexa= in.nextLine();
                String Bi= HextoBin.HextoBinary(hexa);
                System.out.println("Su expresion en Hexadecimal es: " + hexa + "\nNumero en binario: " + Bi);
                break;
            case 2:
                break;
            default:
                System.out.println("NO ELIGIO NINGUNA DE LAS OPCIONES ANTERIORES");
                break;
        }
    }
}
