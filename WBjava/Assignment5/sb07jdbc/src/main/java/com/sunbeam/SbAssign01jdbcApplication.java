package com.sunbeam;

import com.sunbeam.daos.FoodItemDao;
import com.sunbeam.daos.UserDao;
import com.sunbeam.pojos.FoodItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SbAssign01jdbcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbAssign01jdbcApplication.class, args);
    }

    @Autowired
    private UserDao userDao;
    @Autowired

    private FoodItemDao foodItemDao;

    @Override
    public void run(String... args) throws Exception {
//        try {
//            User u = userDao.findByEmail("nilesh@gmail.com");
//            System.out.println("Found: " + u);
//        } catch (EmptyResultDataAccessException e) {
//            System.out.println("User Not Found.");
//        }
//        User u = new User(0, "Harry", "har@gmail.com", "har123", "7517554740");
//        int cnt = userDao.save(u);
//        System.out.println("Users Saved: " + cnt);
//    }
//        try {
//            FoodItem foodItem = foodItemDao.findbyfid(1);
//            System.out.println("Found: " + fid );
//        }catch (EmptyResultDataAccessException e){
//            System.out.println("Fid Not Found.");
//        }
//        try {
//            FoodItem foodItem = foodItemDao.findbyId(2);
//            System.out.println("Found :" + foodItem);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        FoodItem foodItem = new FoodItem(7, "Noodels", 50, "Veg Noodles", "Noodles.jpg", "Veg");
//        int cnt = foodItemDao.save(foodItem);
//        System.out.println("FoodItem Saved: " + cnt);

//        int fid = 4;
//        double price = 80.0;
//        int cnt = foodItemDao.updatePrice(fid, price);
//        System.out.println("Food Items Updated: " + cnt);

        try {
            List<FoodItem> foodItem = foodItemDao.findByType("veg");
            System.out.println("Found :"+ foodItem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}