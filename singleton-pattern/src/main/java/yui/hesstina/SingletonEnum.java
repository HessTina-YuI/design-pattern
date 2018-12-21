package yui.hesstina;

public class SingletonEnum {

    private enum Instance {

        INSTANCE;

        private SingletonEnum instance;

        private Instance() {
            new SingletonEnum();
        }

        public SingletonEnum getEnum() {
            return instance;
        }
    }

    private SingletonEnum(){
        System.out.println("生成单例 - 枚举方法");
    }

    public static SingletonEnum getInstance() {
        return Instance.INSTANCE.getEnum();
    }

}
