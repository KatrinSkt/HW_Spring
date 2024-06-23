package pro.sky.shop.Service;

import org.springframework.stereotype.Service;
import pro.sky.shop.Component.Basket;
import pro.sky.shop.Repository.ItemShop;
import pro.sky.shop.model.Item;

import java.util.List;

@Service
public class ShopService {
    private final ItemShop itemShop;
    private final Basket basket;

    public ShopService(ItemShop itemShop, Basket basket) {
        this.itemShop = itemShop;
        this.basket = basket;
    }

    public void add(List<Integer> ids) {
        basket.add(
                ids.stream()
                        .map(itemShop::get)
                        .toList()
        );
    }

    public List<Item> get() {
        return basket.get();
    }
}
