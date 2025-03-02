package com.assignment.SpringBasics.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BusinessLogic {
    public Operation operation ;

    @Autowired
    public BusinessLogic(@Qualifier("Add") Operation operation){
        this.operation=operation;
    }


    /*
    answer 5 -  here currently Operation interface is implmented by 3 classes for resolving ambiquities i can use
        qualifier,primary,named , byname

        PREFEREENCE ORDER IS
        Qualifier>Primary>Named

//    @Autowired
//    Operation multiplyOperation;
//  here it will perform multiply task but if

    @Autowired
//    Operation multiplyOperation;
if any componet has primary then it is preferred.
       Then the Primary will be preferred over multiply

    @Autowired
    @Qualifier("Subract")
//    Operation multiplyOperation;
    it will prefer Subract it will have more priorty than primary

    * */
    public int do_operation(int a, int b){
        return operation.perform_task(a,b);
//        return operation.perform_task(a,b);
    }
}
