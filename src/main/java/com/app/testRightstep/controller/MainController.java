package com.app.testRightstep.controller;

import com.app.testRightstep.model.Circle;
import com.app.testRightstep.model.Color;
import com.app.testRightstep.model.Figure;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MainController {

    @GetMapping
    public @ResponseBody Figure get() {
        Circle circle = new Circle(Color.GREEN, 1.);

        return circle;
    }

}
