package Homeworks.S4Hw1JSON.JSONManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Homeworks.S4Hw1JSON.Classes.Cat;
import Homeworks.S4Hw1JSON.Classes.ObjCatCreater;

public class JSONmanager {
    public String path;

    public JSONmanager(String path) {
        this.path = path;
    }

    public <E> void write(E data, boolean append) throws IOException {
        try (FileWriter writer = new FileWriter(this.path, append)) {

            if (data instanceof String) {
                writer.write("\"" + data.toString() + "\"");
            } else if (data instanceof Cat) {
                writer.write(((Cat) data).toJSONString());
            } else {
                writer.write(data.toString());
            }
            writer.append('\n');
            writer.flush();
        }
    }

    public <E> E read(String type) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str = "";

        while ((str = br.readLine()) != null) {
            if (Character.isDigit(str.charAt(0))) {
                Integer number = Integer.parseInt(str);
                br.close();
                return (E) number;
            } else if (str.charAt(0) == '"') {
                str = str.substring(1, str.length() - 1);
                br.close();
                return (E) str;
            } else if (str.charAt(0) == '{') {
                ObjCatCreater objCatCreater = new ObjCatCreater();
                Cat myCat = objCatCreater.createAnObjCat(str);
                br.close();
                return (E) myCat;
            }
        }
        br.close();
        return null;
    }
}