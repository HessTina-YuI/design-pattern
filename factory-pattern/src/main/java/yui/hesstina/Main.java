package yui.hesstina;

import yui.hesstina.framework.Factory;
import yui.hesstina.framework.Product;
import yui.hesstina.idcard.IDCard;
import yui.hesstina.idcard.IDCardFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        System.out.println("=========== 申请中 ===========");
        Product card1 = factory.create("小光");
        Product card2 = factory.create("希望");
        Product card3 = factory.create("木灵");

        System.out.println("========== 注册名单 ==========");
        ((IDCardFactory) factory).printOwners();

        System.out.println("=========== 使用中 ===========");
        card1.use();
        card2.use();
        card3.use();
    }

}
