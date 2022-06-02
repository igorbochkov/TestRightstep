package com.app.testRightstep.repository;

import com.app.testRightstep.model.Circle;
import com.app.testRightstep.model.Color;
import com.app.testRightstep.model.Figure;

import java.util.List;

public interface FigureRepository {

    List<Circle> getCirclesOrderByRadius();

    List<Figure> getRectanglesOrderByDiagonal();

    List<Figure> getTrianglesOrderByHeight();

    public List<Figure> getAllFiguresWishColorOrderByArea(Color color);

    List<Figure> getAllFiguresOrderByArea();

    void save(Figure figure);
}
