package com.assignment.SpringBasics.operations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("Add")
public class AddOperation implements Operation{
    @Override
    public int perform_task(int a ,int b){
        return (a+b);
    }
}
