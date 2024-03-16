public class BinarytoDecimalAndDecimaltoBinary {
    public static int decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }

        int binary = 0;
        int place = 1;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * place;
            decimal /= 2;
            place *= 10;
        }

        return binary;
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int place = 1;
        while (binary > 0) {
            int remainder = binary % 10;
            decimal += remainder * place;
            binary /= 10;
            place *= 2;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(BinarytoDecimalAndDecimaltoBinary.decimalToBinary(304));
        System.out.println(BinarytoDecimalAndDecimaltoBinary.binaryToDecimal(1010));
    }
}