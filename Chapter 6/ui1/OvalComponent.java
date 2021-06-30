package edu.javacourse.ui1;

import javax.swing.*;
import java.awt.*;

//наследуемся от стандартного класса, который используется для создания  компонентов на форме
public class OvalComponent extends JComponent {
    //переопределяем метод рисования, в который  передается объект класса Graphics

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Используем Graphics для рисования овала с отступами
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
