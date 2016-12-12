package com.galkina.triangle.creater;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.entity.Triangle;
import com.galkina.triangle.exception.NotEnoughArgumentsException;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class TriangleListCreator {
    public static final Logger LOG = Logger.getLogger(TriangleListCreator.class);
    public static final int POINTS_IN_TRIANGLE_COUNT = 3;

    public static List<Triangle> createTriangles(List<Point> points) throws NotEnoughArgumentsException {
        List<Triangle> triangles = new ArrayList<>();

        if(!points.isEmpty()&&points.size()>=POINTS_IN_TRIANGLE_COUNT) {
            int trianglesCount = points.size()/POINTS_IN_TRIANGLE_COUNT;
            for (int i = 0; i < POINTS_IN_TRIANGLE_COUNT*trianglesCount; i += POINTS_IN_TRIANGLE_COUNT) {
                Triangle triangle = new Triangle(points.get(i), points.get(i + 1), points.get(i + 2));
                LOG.info(triangle.toString() + " is created. ");
                triangles.add(triangle);
            }
            return triangles;
        }
        else throw new NotEnoughArgumentsException();
    }
}
