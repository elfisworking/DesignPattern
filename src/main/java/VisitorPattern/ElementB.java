package VisitorPattern;

import VisitorPattern.Interface.Element;
import VisitorPattern.Interface.Visitor;

public class ElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String opB(){
        return "elementB do opB";
    }
}
