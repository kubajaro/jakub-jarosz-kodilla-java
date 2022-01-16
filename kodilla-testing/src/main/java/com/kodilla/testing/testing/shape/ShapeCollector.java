package com.kodilla.testing.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        if(shapes.contains(shape)){
            shapes.remove(shape);
            return true;
        }else{
            return false;
        }
    }

    public Shape getFigure(int figureNumber){
        Shape resultShape = null;
        if(figureNumber >= 0 && figureNumber < shapes.size()){
            resultShape = shapes.get(figureNumber);
        }
        return resultShape;
    }

    public boolean showFigures(){
        if(!shapes.isEmpty()){
            for(Shape shape: shapes){
                System.out.println(shape);
            }
            return true;
        }else {
            return false;
        }
    }

}
