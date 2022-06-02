package com.app.testRightstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Circle extends Figure {

    @Column
    private Double radius;

    public Circle() {
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
    }

    @Override
    protected Double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected Double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    public Double getRadius() {
        return radius;
    }

}
