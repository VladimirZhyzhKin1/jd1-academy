package abstractThem.frame;

import abstractThem.components.OvalComponent;
import abstractThem.components.RectangleComponent;
import abstractThem.components.TriangleComponent;

import javax.swing.*;
import java.awt.*;

public class ShapeFrame extends JFrame {
    public ShapeFrame() {
        //Устанавливаем LayoutManager (менеджера компоновки) в виде таблицы
        //размерами 2 строки на 3 столбца
        setLayout(new GridLayout(2, 3)); //Grid - макет

        //создаем и "укладываем" на форму компоненты разных классов
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new OvalComponent());

        //устанавливаем координаты и размеры окна
        setBounds(200, 200, 450, 350);
    }
}
