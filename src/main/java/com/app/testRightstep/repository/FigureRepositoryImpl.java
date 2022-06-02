package com.app.testRightstep.repository;

import com.app.testRightstep.model.Circle;
import com.app.testRightstep.model.Color;
import com.app.testRightstep.model.Figure;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository()
@Transactional(readOnly = true)
public class FigureRepositoryImpl implements FigureRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Circle> getCirclesOrderByRadius() {
        return entityManager.createQuery("SELECT c FROM Circle c ORDER BY c.radius", Circle.class).getResultList();
    }

    @Override
    public List<Figure> getRectanglesOrderByDiagonal() {
        return entityManager.createQuery("SELECT r FROM Rectangle r ORDER BY r.diagonal", Figure.class).getResultList();
    }

    @Override
    public List<Figure> getTrianglesOrderByHeight() {
        return entityManager.createQuery("SELECT t FROM Triangle t ORDER BY t.height", Figure.class).getResultList();
    }

    @Override
    public List<Figure> getAllFiguresOrderByArea() {
        return entityManager.createQuery("SELECT f FROM Figure f ORDER BY f.area", Figure.class).getResultList();
    }

    @Override
    public List<Figure> getAllFiguresWishColorOrderByArea(Color color) {
        return entityManager.createQuery("SELECT f FROM Figure f WHERE f.color=:color ORDER BY f.area", Figure.class)
                .setParameter("color", color)
                .getResultList();
    }

    @Override
    @Transactional
    public void save(Figure figure) {
        if (figure.getId() == null) {
            entityManager.persist(figure);
        } else {
            entityManager.merge(figure);
        }
    }
}
