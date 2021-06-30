package edu.javacourse.uiTest;

import javax.swing.*;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame sf = new JFrame();
        sf.setTitle("First Window");
        //устанавливаем свойство - завершитьприложение при закрытии окна
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //выставим координаты  и размеры
        //Верхний левый угол - первые два числа 100 и 100
        //Ширина и высота - вторые два числа 400 и 200
        sf.setBounds(100, 100, 400, 200);
        //отобразим окно сделав его видимым
        sf.setVisible(true);
    }
}
