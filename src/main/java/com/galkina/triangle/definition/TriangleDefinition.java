package com.galkina.triangle.definition;

import com.galkina.triangle.entity.Triangle;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

public class TriangleDefinition {
    public static final Logger LOG = Logger.getLogger(TriangleDefinition.class);

    public static boolean isTriangleExisting(Triangle triangle){
        return  !((triangle.getC().getX() - triangle.getA().getX())*(triangle.getB().getX() - triangle.getA().getX())
                == (triangle.getC().getY() - triangle.getA().getY())*(triangle.getB().getY() - triangle.getA().getY()));
    }

    public static boolean isRectangular(Triangle triangle){
        if(isTriangleExisting(triangle)) {

            ArrayList<Double> list = new ArrayList<>();
            list.add(triangle.getAc());
            list.add(triangle.getAb());
            list.add(triangle.getBc());
            Collections.sort(list);

            boolean isRect = Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(2), 2);

            if (isRect) {
                LOG.info("Triangle "+triangle.toString()+" is rectangular.");
            } else {
                LOG.info("Triangle "+triangle.toString()+" isn't rectangular.");
            }
            return isRect;
        }
        LOG.info("Triangle "+triangle.toString()+" don't exist.");
        return false;
    }
}
