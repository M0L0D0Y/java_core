package lesson1;

public class Hello {
    public static void main(String[] args) {

//        String name = "Yuri";
//        String lastName = "Molodyko";
//        System.out.print(name + " " + lastName);

        //Логический тип данных, true - 1, false - 0, bit
        boolean answer = false;

        //Byte
        //8 bit в ряд - byte
        byte myByte = 127;
        byte myByteMin = -128;

        //Short - целое число, которое состоит из двух byte
        short myShort = 32767;
        short myShortMin = -32768;

        //Integer - целое число, которое состоит из 4 byte
        int myNumber = 2_147_483_647 ;
        int myNumberMin = -2_147_483_648;

        //Long - целое число, которое состоит из 8 byte
        long myLong = 9223372036854775807L;
        long myLongMin = -9223372036854775808L;

        //Double - вещественно число, которое состоит из 8 byte
        double myBottle = 0.75;
        //Float - вещественное число, которое состоит из 4 byte
        float cola = 0.33F;

        double myDouble = 1.12345678901234567890;
        float myFloat = 1.12345678901234567890F;
//        System.out.println(myDouble);
//        System.out.println(myFloat);

        //Character - Символ, 2 байт
        int a = 99_000;
        char letter = 70;
        System.out.println(letter);
    }
}
