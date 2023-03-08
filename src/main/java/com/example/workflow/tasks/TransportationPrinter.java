package com.example.workflow.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import java.util.Map;

@Named
public class TransportationPrinter implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(TransportationPrinter.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Double money = Double.parseDouble((String) delegateExecution.getVariable("money"));
        log.info("Money: {}", money);
        log.info("Selected Transportation 1: {}", delegateExecution.getVariable("selectedTransportation"));
        log.info("Transportation: {}", delegateExecution.getVariable("transportation"));
        Map<String,Object> selectedTransportation =
                (Map<String, Object>) delegateExecution.getVariable("selectedTransportation");
        Map<String,Object> selectedStation =
                (Map<String, Object>) delegateExecution.getVariable("selectedStation");
        //Map<String,Object> beverageDecision = (Map<String, Object>) delegateExecution.getVariable("beverageDecision");
        //Map<String,Object> beverageDecision = (Map<String, Object>) delegateExecution.getVariable("beverageDecision");

        log.info("Selected transportation: {}", selectedTransportation.get("transportation"));
        log.info("Selected Station: {}", selectedStation.get("station"));
    }
}
