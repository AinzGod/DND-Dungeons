import javax.swing.*;
import java.awt.*;

public class DungeonPanel extends JPanel {
    private Dungeon dungeon;

    public DungeonPanel(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Aquí implementa la lógica para dibujar la matriz de la mazmorra en el panel.
    }
}
