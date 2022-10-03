package Seminars.S4T1JSON;

import java.io.IOException;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws IOException {
    JSONmanager m = new JSONmanager("file.txt");
    StringBuilder sb = new StringBuilder();
    sb.append("Hello").append(" world");
    m.write(sb, true);
    m.read();
    Cat c = new Cat(6, 6);
    System.out.println(c);

    }
}
