package Homeworks.S4Hw1JSON.Classes;

import Homeworks.S4Hw1JSON.Interfaces.ReadFromFile;

import java.io.*;


public class FReader implements ReadFromFile {

    @Override
    public void printFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Homeworks/S4Hw1JSON/data/data.txt"));
        String line = "";
        int counter = 1;
        System.out.println("\nФайл data.txt содержит следующие строки:");
        while ((line = reader.readLine())!=null){
            System.out.printf("%d. %s\n", counter++, line);
        }
        System.out.println();
        reader.close();
    }

    @Override
    public <E> E getElementFromFile(String type) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Homeworks/S4Hw1JSON/data/data.txt"));
        String line = "";
        while ((line = reader.readLine())!=null){
            if((line.charAt(0) == '"') && (String.class.getSimpleName().equals(type))){
                line = line.substring(1,line.length()-1);
                reader.close();
                return (E) line;
            } else if ((Character.isDigit((line.length()>1?line.charAt(1):line.charAt(0)))) &&
                      (int.class.getSimpleName().equals(type))) {
                Integer num = Integer.parseInt(line);
                reader.close();
                return (E) num;
            } else if ((line.charAt(0) == '{') && (type.equals("TestObject"))) {
                TestObject result = new ClassFromJson(line).create();
                reader.close();
                return (E) result;
            }
        }
        reader.close();
        return null;
    }
}
