package VisitorPattern;

public class ElementA implements Element {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String opA(){
        return "elementA do opA";
    }
}
