package Seminars.S4T2;


public class Program {

    public static void main(String[] args) {
        JsonFileReader reader = new JsonFileReader();
        int value = reader.readObject(int.class);
        System.out.println(value);
        String str = reader.readObject(String.class);
        System.out.println(str);
    }
}
