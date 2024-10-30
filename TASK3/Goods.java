public class Goods {
    private int height;
    private int width;
    private int length;
    private String nameObject;

    Goods(String nameObject, int height, int wigth, int length) {
        this.width = wigth;
        this.height = height;
        this.length = length;
        this.nameObject = nameObject;
    }


    public String toString() {
        return getNameObject() + " Height: " + getHeight() + " Length: " + getLength() + " Width: " + getWidth() + ";";
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getNameObject() {
        return nameObject;
    }
}
