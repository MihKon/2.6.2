package com.company;

public class Rectangle extends Figure implements Moveable{
    private float width;
    private float height;

    Rectangle(float x, float y, float h, float w){
        super(x, y);
        this.height = h;
        this.width = w;
    }

    @Override
    public float getArea() {
        return this.height*this.width;
    }

    @Override
    public float getPerimeter() {
        return 2*(this.width+this.height);
    }

    @Override
    public void move(float dx, float dy) {
        this.x+=dx;
        this.y+=dy;
    }

    @Override
    public void resize(float k) {
        this.width*=k;
        this.height*=k;
    }

    @Override
    public String toString() {
        System.out.println("Rectangle");
        System.out.println("Center: ("+(this.x+this.width/2)+", "+(this.y+this.height/2)+")");
        System.out.println("Height: "+this.height);
        return "Width: "+this.width;
    }
}
