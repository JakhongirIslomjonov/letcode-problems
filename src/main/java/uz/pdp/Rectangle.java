package uz.pdp;

public class Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length >= 0.0 && length <= 20.0) {
            this.length = length;
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (length >= 0.0 && length <= 20.0) {
            this.width = width;
        }
    }

    public  float perimeter(float length, float width) {
        float v = width + length;
        return 2 * v;
    }

    public  float area(float length, float width) {
        float c = width * length;
        return c;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

//area

}
