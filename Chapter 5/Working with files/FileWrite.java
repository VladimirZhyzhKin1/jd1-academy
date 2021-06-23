import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;

        try {

            File name = new File("file.txt");
            System.out.println(name.getAbsoluteFile());
            System.out.println(name.canRead());
            System.out.println(name.delete());//мы удаляем файл, поэтому все остальное не выполняется и false до того как createNewFile()
            System.out.println("name.canRead() " + name.canRead());
            System.out.println("name.exists() " + name.exists());
            System.out.println("name.createNewFile() " + name.createNewFile());
            System.out.println("name.exists() " + name.exists());

            fileIn = new FileReader("file.txt");
            fileOut = new FileWriter("copied_file.txt");


            int a;
            //копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);//чтение содержимого file.txt и запись в файл в copied_file.txt
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }

        }
    }
}
