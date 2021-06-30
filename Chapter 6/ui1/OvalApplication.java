package edu.javacourse.ui1;

import javax.swing.*;

public class OvalApplication {
    public static void main(String[] args) {
        //создаем графическое окно
        OvalFrame of = new OvalFrame();
        of.setTitle("Oval");
        //задаем правило, по которому приложение завершиться при закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //делаем окно видимым
        of.setVisible(true);
    }
}
