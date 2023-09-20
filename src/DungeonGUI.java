import javax.swing.*;

public class DungeonGUI {
    private JFrame frame;
    private Dungeon dungeon;

    public DungeonGUI(Dungeon dungeon) {
        this.dungeon = dungeon;
        frame = new JFrame("Dungeon Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new DungeonPanel(dungeon));
        frame.setVisible(true);
    }
}
