package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by weidner on 18/01/17.
 */
@Component
public class FooBaseBeanCollector extends BaseBeanCollector<Foo> {
    public FooBaseBeanCollector() {
        super("foo base extra class");
    }
}
