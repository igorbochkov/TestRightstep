package com.app.testRightstep.model;

import javax.persistence.Entity;

@Entity
public class Triangle extends Figure {

    private Double foot;

    private Double height;

    public Triangle() {
    }

    public Triangle(Color color, Double side, Double height) {
        super(color);
        this.foot = side;
        this.height = height;
        setPerimeter(calculatePerimeter());
        setArea(calculateArea());
    }

    @Override
    protected Double calculateArea() {
        return (foot * height) / 2;
    }

    @Override
    protected Double calculatePerimeter() {
        return 3 * foot;
    }

    public Double getFoot() {
        return foot;
    }

    public void setFoot(Double foot) {
        this.foot = foot;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
