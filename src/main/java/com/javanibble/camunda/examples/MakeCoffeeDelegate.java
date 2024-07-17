package com.javanibble.camunda.examples;

import com.sun.el.lang.ELArithmetic;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("makeCoffee")
public class MakeCoffeeDelegate implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(RetrieveCoffeeOrderDelegate.class.getName());

    public void execute(DelegateExecution execution) throws Exception {
        String coffeeOrder = (String) execution.getVariable("order");
try{
    int i=10/0;
}catch(Exception e){
    LOGGER.info(e.getMessage());
//throw new BpmnError("MYERROR");
}
        LOGGER.info("Order Coffee Process: " + execution.getCurrentActivityName() + " - " + coffeeOrder);
    }
}