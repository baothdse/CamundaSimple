package com.example.workflow.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named
public class RecordColorTask implements JavaDelegate {
    private static final Logger log = LoggerFactory.getLogger(RecordColorTask.class);

    @Override
    public void execute(DelegateExecution execution) {
        log.info("You have selected {}", execution.getVariable("favoriteColor"));
    }
}