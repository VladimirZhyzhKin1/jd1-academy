package edu.javacourse.ui;

import javax.swing.*;

public class ShapeApplication {
    public static void main(String[] args) {
        //создаем графическое окно
        ShapeFrame of = new ShapeFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //делаем окно видимым
        of.setVisible(true);
    }
}
