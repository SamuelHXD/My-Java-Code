package BaseProject.FileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
            PersonSerimp per = new PersonSerimp("孙子",50);
            oos.writeObject(per);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
