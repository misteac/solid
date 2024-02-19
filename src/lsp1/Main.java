package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        square.getArea();
        Rectangle rectangle = new Rectangle(1,5);
        rectangle.getArea();
        System.out.printf("In a rectangle side A = %d, side B = %d\n", square.getArea(), rectangle.getArea());
        ShapeView view = new ShapeView(square);
        view.showArea();
    }
}
