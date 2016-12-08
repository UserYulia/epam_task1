package com.galkina.triangle.parser;

import com.galkina.triangle.entity.Point;
import com.galkina.triangle.reader.DataReader;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class PointsParser {
    public static final Logger LOG = Logger.getLogger(PointsParser.class);
    public static final int POINTS_COUNT = 3;

    public List<Point> parse(List<String> list){
        ArrayList<Point> points = new ArrayList<Point>();

        for(int i = 0; i<POINTS_COUNT; i++){
            String[] s = list.get(i).split("[^0-9-]");
            points.add(new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }
        return points;
    }

    public static void main(String[] args) {
        PointsParser parser = new PointsParser();
        parser.parse(new DataReader().readData("src/main/resources/data.txt"));

    }
}
