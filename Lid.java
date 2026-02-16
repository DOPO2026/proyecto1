/**
 * Write a description of class Lid here.
 *
 * @Rodriguez-Villamizar
 * @1 (15/02/2026)
 */
public class Lid {
    public static final int SCALE = 20;
    private Rectangle lid;
    private int nCup; 

    public Lid(int nCup, int size, String color) {
        this.nCup = nCup;
        int height = 1 * SCALE;
        int width = (nCup * 10) + 40;        
        lid = new Rectangle();
        lid.changeColor(color);
        lid.changeSize(height, width);
        }
        
    /**
     * Make the lid visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        lid.makeVisible();
        }
    
    public void makeInvisible() {
        lid.makeInvisible();
    }
}