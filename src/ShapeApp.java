import shape.ShapeContainer;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ShapeApp extends JFrame
  {
  private static final long serialVersionUID = 1L;
  private ShapeContainer shapeContainer = new ShapeContainer();
  public ShapeApp()
    {
    createMenue();
    this.add(shapeContainer);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400,400);
    this.setVisible(true);
    }
  
  public void createMenue()
    {
    JMenu menu = new JMenu("Modes");
    createMenuItem(menu, "Insert", e -> shapeContainer.setMode(ShapeContainer.mode.INSERT));
    createMenuItem(menu, "Move", e -> shapeContainer.setMode(ShapeContainer.mode.MOVE));
    createMenuItem(menu, "Delete", e -> shapeContainer.setMode(ShapeContainer.mode.DELETE));
    createMenuItem(menu, "Mark", e -> shapeContainer.setMode(ShapeContainer.mode.MARK));
    createMenuItem(menu, "Unmark", e -> shapeContainer.setMode(ShapeContainer.mode.UNMARK));
    createMenuItem(menu, "Resize", e -> shapeContainer.setMode(ShapeContainer.mode.RESIZE));
    JMenuBar menuBar = new JMenuBar();
    menuBar.add(menu);
    this.setJMenuBar(menuBar);
    }
  
  private void createMenuItem(JMenu menu, String label, ActionListener listener)
    {
    JMenuItem menuItem = new JMenuItem(label);
    menuItem.addActionListener(listener);
    menu.add(menuItem);
    }
  
  public static void main(String args[])
    {
    new ShapeApp(); // obs egentligen SwingUtilities ...
    }
  }
