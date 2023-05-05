public class Rectangle {
    private float height;
    private float width;

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float calculateArea(){
        return this.width * this.height;
    }
}
