package pro.sky.shop.Repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import pro.sky.shop.model.Item;

import java.util.HashMap;
import java.util.Map;

@Component
public class ItemShop {
    private final Map<Integer, Item> itemsMap = new HashMap<>();
    @PostConstruct
    public void init(){
        int idConter = 1;
        itemsMap.put(idConter, new Item(idConter++, "Часы"));
        itemsMap.put(idConter, new Item(idConter++, "Брелок"));
        itemsMap.put(idConter, new Item(idConter++, "Подставка"));
    }
    public Item get(int id){
        return itemsMap.get(id);
    }

}
