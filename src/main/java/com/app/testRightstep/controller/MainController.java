package com.app.testRightstep.controller;

import com.app.testRightstep.model.Circle;
import com.app.testRightstep.model.Figure;
import com.app.testRightstep.service.FigureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class MainController {

    private final FigureService figureService;

    public MainController(FigureService figureService) {
        this.figureService = figureService;
    }

    @GetMapping(path = "circles")
    public List<Circle> getCircles() {
        return figureService.getCirclesOrderByRadius();
    }

    @GetMapping(path = "triangles")
    public List<Figure> getTriangles() {
        return figureService.getTrianglesOrderByHeight();
    }

    @GetMapping(path = "rectangles")
    public List<Figure> getRectangles() {
        return figureService.getRectanglesOrderByDiagonal();
    }

    @GetMapping(path = "figures")
    public List<Figure> getFigures(@RequestParam(required = false, name = "c") String color) {
        return figureService.getAllFigures(color);
    }

}
