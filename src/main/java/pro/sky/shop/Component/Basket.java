package pro.sky.shop.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.shop.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Item> items = new ArrayList<>();
    public void add(List<Item> items){
        this.items.addAll(items);
    }
    public List<Item> get(){
        return Collections.unmodifiableList(items);
    }
}
