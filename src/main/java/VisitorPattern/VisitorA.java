package VisitorPattern;

public class VisitorA implements Visitor {
    public void visit(ElementA elementA) {
        System.out.println("输出 elementA"+elementA.opA());
    }

    public void visit(ElementB elementB) {
        System.out.println("输出 elementB"+elementB.opB());
    }
}
