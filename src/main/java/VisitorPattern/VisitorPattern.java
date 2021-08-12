package VisitorPattern;

public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStrucutre os = new ObjectStrucutre();
        os.add(new ElementA());
        os.add(new ElementB());
        VisitorA visitorA = new VisitorA();
        os.accept(visitorA);
        System.out.println("--------------------");
        os.accept(new VisitorB());
    }
}
