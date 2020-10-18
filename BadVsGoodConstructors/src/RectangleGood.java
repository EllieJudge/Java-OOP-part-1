public class RectangleGood {

    // This is a GOOD example of using constructors, called constructor chaining.

    private int x;
    private int y;
    private int width;
    private int height;

    // 1st constructor calls second
    public RectangleGood() {
        this(0, 0);
    }

    // 2nd constructor calls third
    public RectangleGood(int width, int height) {
        this(0, 0, width, height);
    }

    // 3rd constructor initializes everything
    public RectangleGood(int x, int y, int width, int height) {
        // initializes variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
