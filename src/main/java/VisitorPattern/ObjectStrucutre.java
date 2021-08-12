package VisitorPattern;

import VisitorPattern.Interface.Element;
import VisitorPattern.Interface.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStrucutre {
    private List<Element> list = new ArrayList<Element>();
    public void accept(Visitor visitor){
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            ((Element)iterator.next()).accept(visitor);
        }

    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }
}
