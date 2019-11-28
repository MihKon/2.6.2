package com.company;

public class Circle extends Figure implements Moveable{
    private float radius;

    Circle(float x, float y, float r){
        super(x, y);
        this.radius = r;
    }
    @Override
    public float getArea() {
        return (float)(Math.PI*this.radius*this.radius);
    }

    @Override
    public float getPerimeter() {
        return (float)(2*Math.PI*this.radius);
    }

    @Override
    public void move(float dx, float dy) {
        this.x+=dx;
        this.y+=dy;
    }

    @Override
    public void resize(float k) {
        this.radius*=k;
    }

    @Override
    public String toString() {
        System.out.println("Circle");
        System.out.println("Center: ("+this.x+", "+this.y+")");
        return "Radius: "+this.radius;
    }
}
