package com.galkina.triangle.calculation;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.entity.Triangle;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;


public class TriangleProperties {
    public static final Logger LOG = Logger.getLogger(TriangleProperties.class);

    public boolean isTriangleExists(Triangle triangle){
        boolean isExist = !((triangle.getC().getX() - triangle.getA().getX())*(triangle.getB().getX() - triangle.getA().getX())
                == (triangle.getC().getY() - triangle.getA().getY())*(triangle.getB().getY() - triangle.getA().getY()));
        return  isExist;
    }

    public boolean isRectangular(Triangle triangle){
        if(isTriangleExists(triangle)) {
            LOG.info("Triangle exists.");

            ArrayList<Double> list = new ArrayList<Double>();
            list.add(triangle.getAc());
            list.add(triangle.getAb());
            list.add(triangle.getBc());
            Collections.sort(list);

            boolean isRect = Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(2), 2);

            if (isRect) {
                LOG.info("Is rectangular.");
            } else {
                LOG.info("Isn't rectangular");
            }
            return isRect;
        }
        LOG.info("Triangle don't exist.");
        return false;
    }
}
