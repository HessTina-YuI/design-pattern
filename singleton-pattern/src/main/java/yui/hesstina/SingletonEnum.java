package yui.hesstina;

public class SingletonEnum {

    private enum Instance {

        INSTANCE;

        private SingletonEnum instance;

        Instance() {
            instance = new SingletonEnum();
        }

        public SingletonEnum getEnum() {
            return instance;
        }
    }

    private SingletonEnum(){

    }

    public static SingletonEnum getInstance() {
        return Instance.INSTANCE.getEnum();
    }

    public void getTest() {
        System.out.println("生成单例 - 枚举方法");
    }

}
