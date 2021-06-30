package edu.javacourse.ui1;

import javax.swing.*;

public class OvalFrame extends JFrame {
    public OvalFrame() {
        //создаем объект типа OvalComponent
        OvalComponent oc = new OvalComponent();
        //Используем метод класса JFrame для добавления компонента на главную панель
        add(oc);
        //устанавливаем координаты и размеры окна
        setBounds(200, 200, 300, 250);
    }
}
