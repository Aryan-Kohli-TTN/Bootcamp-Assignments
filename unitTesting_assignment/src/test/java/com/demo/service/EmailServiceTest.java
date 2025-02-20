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
public class EmailServiceTest {
    static class Order_and_String{
        Order order;
        String msg;
        public Order_and_String(Order order, String msg)
        {
            this.order=order;
            this.msg=msg;
        }
    }
    static EmailService emailService ;
    private Order order_input;
    private String msg_input;

    @BeforeClass
    public static void beforeClass()
    {
        emailService = EmailService.getInstance();
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

    public EmailServiceTest(Order_and_String os){
        this.order_input=os.order;
        this.msg_input=os.msg;
    }

    @Test
    public void testSendEmail_1(){
        assertTrue(emailService.sendEmail(order_input,msg_input));
    }
    @Test
    public void testSendEmail_2(){
        assertTrue(emailService.sendEmail(order_input,msg_input));
    }
    @Test
    public void testSendEmail_3(){
        assertTrue(emailService.sendEmail(order_input,msg_input));
    }
    @Test
    public void testSendEmail_4(){
        assertTrue(emailService.sendEmail(order_input,msg_input));
    }

    @Test(expected = RuntimeException.class)
    public void testSendEmail_exception_1(){
        emailService.sendEmail(new Order(10,"ujsn",21));
    }

    @Test(expected = RuntimeException.class)
    public void testSendEmail_exception_2(){
        emailService.sendEmail(null);
    }
}