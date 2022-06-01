package com.app.testRightstep.model;

import javax.persistence.Entity;

@Entity
public class Rectangle extends Figure {

    private Double side1;

    private Double side2;

    private Double diagonal;

    public Rectangle() {

    }

    public Rectangle(Color color, Double side1, Double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        setArea(calculateArea());
        setPerimeter(calculatePerimeter());
        this.diagonal = calculateDiagonal();
    }

    @Override
    protected Double calculateArea() {
        return side1 * side2;
    }

    @Override
    protected Double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

    protected Double calculateDiagonal() {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }


    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    public Double getDiagonal() {
        return diagonal;
    }
}
