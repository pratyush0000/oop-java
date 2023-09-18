package Lab3;

import java.util.*;
class Circle
{
    double radius=1.0;
    String color="red";

    Circle()
    {

    }

    Circle(double radius)
    {
        this.radius=radius;

    }

    Circle(double radius, String color)
    {
        this.radius=radius;
        this.color=color;

    }

    public double getradius()
    {
        return this.radius;
    }

    public void setradius(double radius)
    {
        this.radius=radius;
    }

    public String getcolor()
    {
        return this.color;
    }

    public void setcolor(String color)
    {
        this.color=color;
    }

    public double getarea()
    {
        return (3.14 * this.radius * this.radius);
    }

    public String toString() {
        return "Circle[radius="+this.radius+" ,"+"color="+this.color+"]";
    }



}

class Cylinder extends Circle
{
    double height=1.0;
    Cylinder()
    {

    }
    Cylinder(double radius)
    {
        this.radius=radius;
    }
    Cylinder(double radius, double height)
    {
        this.radius=radius;
        this.height=height;

    }

    Cylinder(double radius, double height, String color)
    {
        this.radius=radius;
        this.height=height;
        this.color=color;


    }

    public double getheight()
    {
        return this.height;
    }

    public void setheight(double height)
    {
        this.height=height;
    }

    public double getvolume()
    {
        return (3.14*this.radius*this.radius*this.height);
    }



}
class HelloWorld {
    public static void main(String[] args) {

        Cylinder c=new Cylinder();
        System.out.println(c.toString());

    }
}

