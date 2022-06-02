package com.app.testRightstep.service;

import com.app.testRightstep.model.Circle;
import com.app.testRightstep.model.Color;
import com.app.testRightstep.model.Figure;
import com.app.testRightstep.repository.FigureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FigureService {

    private FigureRepository figureRepository;

    public FigureService(FigureRepository figureRepository) {
        this.figureRepository = figureRepository;
    }

    public List<Circle> getCirclesOrderByRadius() {
        return figureRepository.getCirclesOrderByRadius();
    }

    public List<Figure> getRectanglesOrderByDiagonal() {
        return figureRepository.getRectanglesOrderByDiagonal();
    }

    public List<Figure> getTrianglesOrderByHeight() {
        return figureRepository.getTrianglesOrderByHeight();
    }

    public List<Figure> getAllFigures(String color) {
        if (color == null) {
            return figureRepository.getAllFiguresOrderByArea();
        }else {
            return figureRepository.getAllFiguresWishColorOrderByArea(Color.valueOf(color.toUpperCase()));
        }
    }

    public void save(Figure figure) {
        figureRepository.save(figure);
    }
}
