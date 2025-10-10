package com.Sunbeam.controllers;


import com.Sunbeam.daos.FoodItemDao;
import com.Sunbeam.pojos.FoodItem;
import com.Sunbeam.pojos.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class FoodController {
    @Autowired
    private FoodItemDao foodDao;
    @GetMapping("/foods")
    public Resp<List<FoodItem>> getAllFood() throws Exception {
        List<FoodItem> list = foodDao.findAll();
        return Resp.success(list);
    }
    @GetMapping("/food/{fid}")
    public Resp<FoodItem> getFoodById(@PathVariable("fid") int fid) throws Exception {
        FoodItem item = foodDao.findById(fid);
        if(item == null)
            return Resp.error("Item Not Found.");
        return Resp.success(item);
    }
    @GetMapping("/food/bytype/{type}")
    public Resp<?> getFoodByType(@PathVariable("type") String type) throws Exception {
        List<FoodItem> list = foodDao.findByType(type);
        return Resp.success(list);
    }
    @PostMapping(value="/food")
    public Resp<?> addFood(@RequestBody FoodItem item) throws Exception {
        int cnt = foodDao.save(item);
        return Resp.success("Item Saved");
    }
    @PutMapping("/food/{fid}")
    public Resp<?> updateFood(@PathVariable("fid") int fid,
                              @RequestBody FoodItem item) throws Exception {
        item.setFid(fid);
        int cnt = foodDao.update(item);
        if(cnt == 0)
            return Resp.error("Item Not Found.");
        return Resp.success("Item Updated");
    }
    @DeleteMapping("/food/{fid}")
    public Resp<?> deleteFoodById(@PathVariable("fid") int fid) throws Exception {
        int cnt = foodDao.deleteById(fid);
        if(cnt == 0)
            return Resp.error("Item Not Found.");
        return Resp.success("Item Deleted");
    }
}
