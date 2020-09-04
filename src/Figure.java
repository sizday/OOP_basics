abstract class Figure{

    private float x;
    private float y;

    Figure(float x, float y){
        this.x=x;
        this.y=y;
    }
    float getX() { return x; };
    float getY() { return y; };
    public abstract float getPerimeter();
    public abstract float getArea();
}

