package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {
    
    @Autowired
    private ShippingService shippingService;


    public double TotalNotShipping(Order order){

        return order.getBasic() - (order.getBasic()*(order.getDiscount()/100.00));

    }


    public double Total(Order order){
        return TotalNotShipping(order) + shippingService.Shippment(order);
    }


    public ShippingService getShippingService() {
        return shippingService;
    }


    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }


}
