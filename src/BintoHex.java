public class BintoHex {

    /**
     * Checks if the expression has more or less than 12 characters,
     * if not calls another method to convert the expression to hexadecimal.
     *
     * @param bin Binary number to convert
     * @return Hexadecimal value
     */
    public static String HextoBinary (String bin){
        String hex = "";
        if (bin.length()!=12){
            System.out.println("Su número binario cuenta con más o menos de 12 caracteres");
            hex = "valor no válido";
        }else {
            hex = Convert(bin);
        }
        return hex;
    }

    /**
     * Separates binary expression into 3 parts of 4 characters
     * and converts them to their refered value in hexadecimal.
     *
     * @param number Complete binary expression
     * @return Hexadecimal value
     */
    public static String Convert(String number){
        String hexadecimal = "";

        String bin_p1 = number.substring(0, 4);
        String bin_p2 = number.substring(4, 8);
        String bin_p3 = number.substring(8, 12);

        String h1 = value(bin_p1);
        String h2 = value(bin_p2);
        String h3 = value(bin_p3);

        if (h1.equals("NI") || h2.equals("NI") || h3.equals("NI")){
            hexadecimal = "NÚMERO NO VÁLIDO \n\t Intentalo de nuevo.";
        } else {
            hexadecimal = h1 + h2 + h3;
        }

        return hexadecimal;
    }

    /**
     * Transforms the Binary number to Hexadecimal
     *
     * @param bin 4 character binary expression
     * @return Equivalent Hexadecimal
     */
    private static String value(String bin) {
        switch (bin) {
            case "0001": //1 en decimal
                return "1";

            case "0010": //2 en decimal
                return "2";

            case "0011": //3 en decimal
                return "3";

            case "0100": //4 en decimal
                return "4";

            case "0101": //5 en decimal
                return "5";

            case "0110": //6 en decimal
                return "6";

            case "0111": //7 en decimal
                return "7";

            case "1000": //8 en decimal
                return "8";

            case "1001": //9 en decimal
                return "9";

            case "1010": //10 en decimal
                return "A";

            case "1011": //11 en decimal
                return "B";

            case "1100": //12 en decimal
                return "C";

            case "1101": //13 en decimal
                return "D";

            case "1110": //14 en decimal
                return "E";

            case "1111": //15 en decimal
                return "F";

            default:
                return "NI";
        }
    }

}
