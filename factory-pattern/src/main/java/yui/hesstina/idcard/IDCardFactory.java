package yui.hesstina.idcard;

import yui.hesstina.framework.Factory;
import yui.hesstina.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List<IDCard> owners = new ArrayList<>();

    public void printOwners() {
        owners.stream().forEach(owner -> System.out.println(" 编号 " + owner.getId() + " 名字 " + owner.getOwner()));
    }

    @Override
    protected Product createProduct(String owner) {
        if (owners.isEmpty()) {
            return new IDCard(0, owner);
        }
        return new IDCard(owners.size(), owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add((IDCard) product);
    }
}
