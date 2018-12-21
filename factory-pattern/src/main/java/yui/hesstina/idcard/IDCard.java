package yui.hesstina.idcard;

import yui.hesstina.framework.Product;

public class IDCard extends Product {

    private Integer id;
    private String owner;

    IDCard(Integer id, String owner) {
        System.out.println(" 制作 " + owner + " 的ID卡 编号为 " + id + " ");
        this.id = id;
        this.owner = owner;
    }

    public Integer getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println(" 使用 " + owner + " 的ID卡 编号为 " + id + " ");
    }

}
