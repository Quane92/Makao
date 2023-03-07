package org.example.client;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class MakaoView implements MouseListener {
    private Image image;

    public MakaoView() {
        try {
            image = ImageIO.read(MakaoView.class.getResource("/MojKraj.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void tick() {

    }


    public void render(Graphics2D g) {
        //g.translate(200,200);
        int shapeWidth = 100;
        int shapeHeight = 100;
        g.setColor(Color.BLUE);
        g.fillRect(GuiParams.WIDTH / 2 - shapeWidth / 2, GuiParams.HEIGHT / 2 - shapeHeight / 2, 100, 100);
        g.drawString("Test", 990, 700);
        g.drawImage(image, 100, 100, 100, 100, null);
        //g.translate(-200,-200);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("MouseReleased");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
