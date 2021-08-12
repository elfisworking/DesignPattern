package VisitorPattern;

public class ElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String opB(){
        return "elementB do opB";
    }
}
