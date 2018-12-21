package yui.hesstina;

public class SingletonStatic {

    private static SingletonStatic instance;

    private SingletonStatic() {
        System.out.println("生成单例 - 静态模块方法");
    }

    static {
        instance = new SingletonStatic();
    }

    public static SingletonStatic getInstance() {
        return instance;
    }

}
