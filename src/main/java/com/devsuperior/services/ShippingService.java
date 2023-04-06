package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class ShippingService {
    

    public double Shippment(Order order){
        
        double amount = order.getBasic() - (order.getBasic()*(order.getDiscount()/100.00));

        if (amount < 100){

            return 20.00;
        }else if (amount < 200){

            return 12.00;
        } else {

            return 0;
        }

    }
}
