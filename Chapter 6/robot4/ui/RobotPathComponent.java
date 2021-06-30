package visual.robot4.ui;

import visual.robot4.Robot;
import visual.robot4.RobotLine;

import javax.swing.*;
import java.awt.*;

public class RobotPathComponent extends JComponent {
    private Robot robot;

    public RobotPathComponent(Robot robot) {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //перебераем все линии, которые сохранились у робота
        for (RobotLine r1 : robot.getLines()) {
            //для каждой линии получаем координаты
            int x1 = (int) Math.round(r1.getX1());
            int y1 = (int) Math.round(r1.getY1());
            int x2 = (int) Math.round(r1.getX2());
            int y2 = (int) Math.round(r1.getY2());
            //И рисуем линию с координатами
            g.drawLine(x1, y1, x2, y2);

        }
    }
}
