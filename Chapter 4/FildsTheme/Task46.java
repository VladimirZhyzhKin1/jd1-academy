package FildsTheme;

import java.io.File;

//Задание 46
//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
public class Task46 {
    public static void main(String[] args) {
        File listFiles = new File("D://");
        File[] listTableFiles = listFiles.listFiles();//File[] listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
        printFiles(listTableFiles);
        System.out.println(" ");
        printDirectory(listTableFiles);
    }

    private static void printFiles(File[] listTableFiles) {
        System.out.println("All Files from Disk D:// ");
        for (File position : listTableFiles) {
            if (position.isFile()) {
                System.out.println(position.getName() + "\t file");
            }
        }
    }

    private static void printDirectory(File[] listTableFiles) {
        System.out.println("All Directories from Disk D://");
        for (File position : listTableFiles) {
            if (position.isDirectory()) {
                System.out.println(position.getName() + "\t folder");
            }
        }
    }
}
