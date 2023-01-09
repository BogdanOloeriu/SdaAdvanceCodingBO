package design.patterns.factory.pattern.ex1;

public class ShapeFactory {


    public Shape create(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
