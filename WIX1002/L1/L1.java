import java.awt.*;
import javax.swing.*;

public class L1 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] amounts = { 2500, 1600, 2000, 2700, 3200, 800 };
        String[] months = { "Jan 2016", "Feb 2016", "Mar 2016", "Apr 2016", "May 2016", "Jun 2016" };
        int barWidth = 50;
        int x = 50;
        for (int i = 0; i < amounts.length; i++) {
            int barHeight = amounts[i] / 10;
            g.setColor(Color.BLUE);
            g.fillRect(x, 400 - barHeight, barWidth, barHeight);
            g.setColor(Color.BLACK);
            g.drawString(months[i], x + (barWidth / 4), 420);
            g.drawString(String.valueOf(amounts[i]), x + (barWidth / 4), 400 - barHeight - 5);
            x += barWidth + 20;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Total Sales of Product A");
        L1 panel = new L1();
        frame.add(panel);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
