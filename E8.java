import com.sun.scenario.effect.impl.prism.ps.PPSTwoSamplerPeer;

import javax.swing.*;
import java.awt.*;

public class E8 {
    public static void main(String[] args) {
        Graphics2D g2=(Graphics2D) g;
        Rectangle sq1 =new Rectangle(100,100,100,100);
        g2.setComposite(color.pink);
        g2.fill(sq1);
        g2.fill(sq1);
        Rectangle sq2 =new Rectangle(250,100,100,100);
        g2.setColor(Color.pink.darker());
        g2.fill(sq2);
        g2.fill(sq2);
    }
}
