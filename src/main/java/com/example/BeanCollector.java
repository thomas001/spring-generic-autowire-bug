package com.example;

import javax.annotation.PostConstruct;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by weidner on 18/01/17.
 */
public class BeanCollector <C> {

    @Autowired(required = false)
    private List<C> beans = Collections.emptyList();

    @Autowired(required = false)
    private C bean;

    public BeanCollector(String name) {
        this.name = name;
    }

    private final String name;

    @PostConstruct
    public void printBeans() {
        System.err.println(MessageFormat.format("Beans for {0}: {1} and {2}", name, beans, bean));
    }
}
