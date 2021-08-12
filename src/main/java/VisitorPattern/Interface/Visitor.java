package VisitorPattern.Interface;


import VisitorPattern.ElementA;
import VisitorPattern.ElementB;

public interface Visitor {
    void visit(ElementA elementA);

    void visit(ElementB elementB);
}
