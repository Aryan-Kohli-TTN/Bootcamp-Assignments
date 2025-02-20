package com.demo.service;

import com.sun.org.apache.xpath.internal.objects.XStringForChars;
import org.junit.After;
import org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.demo.domain.Order;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class OrderServiceTest {
    static class Order_and_String{
        Order order;
        String cc;
        public Order_and_String(Order order, String cc)
        {
            this.order=order;
            this.cc=cc;
        }
    }
    static OrderService orderService ;
    private Order order_input;
    private String cc_input;

    @BeforeClass
    public static void beforeClass()
    {
        orderService = OrderService.getInstance();
    }

    @Parameterized.Parameters
    public static Collection<Order_and_String> test(){
        List<Order_and_String> list= new ArrayList<>();
        list.add(new Order_and_String(new Order(10,"cine",100),"ABCD"));
        list.add(new Order_and_String(new Order(20000,"ds",21),"dne"));
        list.add(new Order_and_String(new Order(132,"feun",325),"cohbdus"));
        list.add(new Order_and_String(new Order(212,"ein",21),"vjn"));
        return list;
    }

    public OrderServiceTest(Order_and_String os){
        this.order_input=os.order;
        this.cc_input=os.cc;
    }

    @Test
    public void testPlaceOrder_1(){
        assertTrue(orderService.placeOrder(order_input,cc_input));
    }
    @Test
    public void testPlaceOrder_2(){
        assertTrue(orderService.placeOrder(order_input,cc_input));
        // comment 
    }
    @Test
    public void testPlaceOrder_3(){
        assertTrue(orderService.placeOrder(order_input,cc_input));
    }
    @Test
    public void testPlaceOrder_4(){
        assertTrue(orderService.placeOrder(order_input,cc_input));
    }


    @Test(expected = RuntimeException.class)
    public void testPlaceOrder_exception_1(){
        orderService.placeOrder(new Order(10,"ujsn",21));
    }

    @Test(expected = RuntimeException.class)
    public void testPlaceOrder_exception_2(){
        orderService.placeOrder(null);
    }
}