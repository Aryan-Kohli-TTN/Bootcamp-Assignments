package com.assignment.SpringBasics.operations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Subract")
public class SubractOperation implements Operation {
    @Override
    public int perform_task(int a ,int b){
        return (a-b);
    }
}
