package com.galkina.triangle.creater;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.entity.Triangle;
import com.galkina.triangle.exception.NotEnoughArgumentsException;
import org.apache.log4j.Logger;
import java.util.List;


public class TriangleBuilder {
    public static final Logger LOG = Logger.getLogger(TriangleBuilder.class);

    public static Triangle createTriangle(List<Point> list) throws NotEnoughArgumentsException {
        if(!list.isEmpty()&&list.size()==3) {
            Triangle triangle = new Triangle(list.get(0), list.get(1), list.get(2));
            LOG.info(triangle.toString() + " is created. ");
            return triangle;
        }
        else throw new NotEnoughArgumentsException();
    }
}
