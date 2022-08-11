package com.epam.rd.autotasks.figures;

import static java.lang.Math.*;

class Circle extends Figure {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        if (center == null || radius <= 0)
            throw new IllegalArgumentException();

        this.center = center;
        this.radius = radius;
    }

    @Override
    public Point centroid() {
        return this.center;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (!(figure instanceof Circle))
            return false;

        double delta = 4.440892098500626E-16;

        double ax = ((Circle) figure).center.getX();
        double ay = ((Circle) figure).center.getY();

        double r = ((Circle) figure).radius;

        return (abs(ax - center.getX()) <= delta && abs(ay - center.getY()) <= delta && abs(radius - r) <= delta);
    }
}
