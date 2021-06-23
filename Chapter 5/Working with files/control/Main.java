package control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person("V", "A", 10);
        //save Person
        FileOutputStream fileOutput = new FileOutputStream("Person.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(person);
        fileOutput.close();
        outputStream.close();

        //load Person
        FileInputStream fileStream = new FileInputStream("Person.dat");
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        //objectStream.readObject();
        System.out.println(objectStream.readObject());
        fileStream.close();
        objectStream.close();
    }

}
