package SingletonPattern;

public class HungarySingleton {
    public static final HungarySingleton instance = new HungarySingleton();
    private HungarySingleton(){

    }

    public static HungarySingleton getInstance(){
        return instance;
    }

}
