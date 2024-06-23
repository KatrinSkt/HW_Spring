package pro.sky.shop.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shop.Service.ShopService;
import pro.sky.shop.model.Item;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        shopService.add(ids);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return shopService.get();
    }

}
