public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width + height) * 2;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        String message;
        return message = String.format(
                "AREA = %.2f "
                + "PERIMETER = %.2f "
                + "DIAGONAL = %.2f ",
                area(), perimeter(), diagonal());
    }
}
