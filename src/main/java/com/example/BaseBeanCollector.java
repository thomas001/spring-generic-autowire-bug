package com.example;

import javax.annotation.PostConstruct;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by weidner on 18/01/17.
 */
public class BaseBeanCollector<C extends Base>  {

    @Autowired(required = false)
    private List<? extends C> beans = Collections.emptyList();


    // Triggers errors...two beans found
//    @Autowired(required = false)
//    private C bean;

    public BaseBeanCollector(String name) {
        this.name = name;
    }

    private final String name;

    @PostConstruct
    public void printBeans() {
        System.err.println(MessageFormat.format("Beans for {0}: {1}", name, beans));
    }
}
