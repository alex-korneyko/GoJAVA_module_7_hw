package ua.goit.gojava.servicePackage;


public class ExpressionElement {

    public ElementType elementType;

    public int number;

    public ExpressionElement(ElementType elementType) {
        this.elementType = elementType;
    }

    public ExpressionElement(ElementType elementType, int number) {
        this(elementType);
        this.number = number;
    }

    @Override
    public String toString() {
        if (elementType == ElementType.INT) {
            return String.valueOf(number);
        }

        switch (elementType) {
            case PLUS:
                return "+";
            case MINUS:
                return "-";
            case DIVIDE:
                return "/";
            case MULTIPLY:
                return "*";
            case EQUALLY:
                return "=";
            case OPEN_PARENTHESIS:
                return "(";
            case CLOSE_PARENTHESIS:
                return ")";
            default:
                return "";
        }
    }

    @Override
    public ExpressionElement clone(){

        return new ExpressionElement(this.elementType, this.number);
    }

    public boolean equals(Object element){
        return this.elementType == ((ExpressionElement)element).elementType;
    }


}
