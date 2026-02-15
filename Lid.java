
/**
 * Write a description of class Lid here.
 *
 * @Rodriguez-Villamizar
 * @1 (15/02/2026)
 */
public class Lid {
    private int nCup; 
    private Rectangle view;
    private static final int SCALE = 20;

    public Lid(int size, String color) {
        this.nCup = nCup;
        int height = 1 * SCALE;
        int width = (nCup * 10) + 40;        
        view = new Rectangle();
        view.changeColor(color);
        view.changeSize(height, width);
        }
    /**
     * Make the lid visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        view.makeVisible();
        }

}