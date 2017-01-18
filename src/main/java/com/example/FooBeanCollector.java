package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by weidner on 18/01/17.
 */
public class FooBeanCollector extends BeanCollector<Foo>
{
    public FooBeanCollector() {
        super("foo extra class");
    }

}
