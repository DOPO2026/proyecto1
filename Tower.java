import java.util.ArrayList;
/**
 * Create the tower
 *
 * @author Rodriguez-Villamizar
 * @version 1 (15/02/2026)
 */
public class Tower {
    private int width;
    private int maxHeight;
    private boolean isVisible;
    private ArrayList<Cup> cups; 
    /**
     * Constructor
     */
    public Tower(int width, int maxHeight) {
        this.width = width;
        this.maxHeight = maxHeight;
        this.cups = new ArrayList<>();
        this.isVisible = false;
    }
    /**
     * Make this tower visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        this.isVisible = true;
        for(Cup c : cups) {
            c.makeVisible();
        }
    }
    /**
     * Make this tower invisible. If it was already invisible, do nothing.
     */
    public void testCreateCup() {
        Cup c1 = new Cup(1, "red");
        cups.add(c1);
        if (isVisible) c1.makeVisible();
    }
}