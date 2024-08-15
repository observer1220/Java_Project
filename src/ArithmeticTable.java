import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ArithmeticTable extends JPanel implements KeyListener, MouseListener {
    String type;
    int n;

    public ArithmeticTable() {
        addKeyListener(this);
        addMouseListener(this);

        type = JOptionPane.showInputDialog("您要一個加法表或乘法表(A OR M)?");
        n = Integer.parseInt(JOptionPane.showInputDialog("您希望的介面大小為?"));
    }

    @Override
    public void paintComponent(Graphics g) {
        requestFocusInWindow();

        int w = getWidth(), h = getHeight();
        int x = 0, y = 0;
        int cellWidth = w / n, cellHeight = h / n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1) {
                    g.setColor(Color.yellow);
                    g.fillRect(x, y, cellWidth, cellHeight);
                }
                g.setColor(Color.black);
                g.drawRect(x, y, cellWidth, cellHeight);

                if (i == 1) {
                    g.drawString("" + j, x + 5, y + 20);
                } else if (j == 1) {
                    g.drawString("" + i, x + 5, y + 20);
                } else {
                    int value;
                    if (type.equalsIgnoreCase("a")) {
                        value = i + j;
                    } else {
                        value = i * j;
                    }
                    g.drawString("" + value, x + 5, y + 20);
                }

                x += cellWidth;
            }
            x = 0;
            y += cellHeight;
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400); // 設置GUI大小
        window.setContentPane(new ArithmeticTable());
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
