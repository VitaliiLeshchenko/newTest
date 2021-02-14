package com.example.demo.controllers;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping(path = "/requestBody")
    public @ResponseBody String addNewItemJSON(@RequestBody Item item) {
        Item newItem = itemRepository.save(item);
        return newItem.toString();
    }

    @PostMapping()
    public String addNewItemTEXT(
            @RequestParam String sku,
            @RequestParam String description,
            @RequestParam String sale_code,
            Model model) {
        if (sku.equals("sku5")) {
            return "itemResult";
        }
        Item newItem = itemRepository.save(new Item(sku, description, sale_code));
        model.addAttribute("sku", newItem.getSku());
        model.addAttribute("description", newItem.getDescription());
        model.addAttribute("sale_code", newItem.getSale_code());
        return "itemResult";
    }


    @GetMapping()
    public String getItem(){
        return "item";
    }

}
