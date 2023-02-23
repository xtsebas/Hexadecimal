public class HextoBin {
    /**
     * Checks if the Hexadecimal number isn't longer than 3 characters
     * @param hex
     * @return
     */
    public static String HextoBinary (String hex){
        String Binary = "";
        if (hex.length()>3 || hex.length()==0){
            System.out.println("Su hexadecimal tiene mas de 3 caracteres");
        }else {
            Binary = transform(hex);
        }
        return Binary;
    }

    /**
     * Transforms the Hexadecimal number to Binary number
     * @param hex
     * @return
     */
    private static String transform (String hex){
        String binary= "";
        String digit = "";
        for (int i = 0; i < hex.length(); i++) {
            char Digit= hex.charAt(i);
            switch (Digit){
                case '0': digit = "0000"; break;
                case '1': digit = "0001"; break;
                case '2': digit = "0010"; break;
                case '3': digit = "0011"; break;
                case '4': digit = "0100"; break;
                case '5': digit = "0101"; break;
                case '6': digit = "0110"; break;
                case '7': digit = "0111"; break;
                case '8': digit = "1000"; break;
                case '9': digit = "1001"; break;
                case 'A': digit = "1010"; break;
                case 'B': digit = "1011"; break;
                case 'C': digit = "1100"; break;
                case 'D': digit = "1101"; break;
                case 'E': digit = "1110"; break;
                case 'F': digit = "1111"; break;
                case 'a': digit = "1010"; break;
                case 'b': digit = "1011"; break;
                case 'c': digit = "1100"; break;
                case 'd': digit = "1101"; break;
                case 'e': digit = "1110"; break;
                case 'f': digit = "1111"; break;
                default: digit = ""; break;
            }
            binary += digit;
        }
        return binary;
    }
}
