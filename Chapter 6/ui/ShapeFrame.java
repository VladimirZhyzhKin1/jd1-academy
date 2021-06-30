package edu.javacourse.ui;

import edu.javacourse.ui.components.OvalComponent;
import edu.javacourse.ui.components.RectangleComponent;
import edu.javacourse.ui.components.TriangleComponent;

import javax.swing.*;
import java.awt.*;

public class ShapeFrame extends JFrame {
    public ShapeFrame() {
        //устанавливаем LayoutManager в виде таблицы размерами 2 строки на 3 столбца
        setLayout(new GridLayout(2, 3));
        //создаем и "укладываем" на форму компоненты разных классов
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());

        //устанавливаем координаты и размер окна
        setBounds(200, 200, 450, 350);
    }


}
