package com.example.workflow.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import java.util.Map;

@Named
public class RecordCakeTask implements JavaDelegate {
    private static final Logger log = LoggerFactory.getLogger(RecordCakeTask.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Map<String,Object> cakeDecision = (Map<String, Object>) delegateExecution.getVariable("cakeDecision");
        log.info("Based on your selected color {} suggested cake is {}",
                delegateExecution.getVariable("favoriteColor"),
                cakeDecision.get("suggestedCake"));
    }
}
