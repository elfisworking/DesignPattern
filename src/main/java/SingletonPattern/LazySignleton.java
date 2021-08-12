package SingletonPattern;
// 懒汉式单例
public class LazySignleton {
    //保证 instance 在所有线程中同步
    private static  volatile  LazySignleton instance = null;
    private LazySignleton(){
        //private 避免类在外部被实例化
    }
    public static synchronized LazySignleton getInstance(){
        //getInstance 方法前加同步
        if( instance == null){
            instance = new LazySignleton();
        }
        return instance;
    }
}
