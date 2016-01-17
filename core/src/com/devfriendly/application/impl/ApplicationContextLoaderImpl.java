package com.devfriendly.application.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devfriendly.application.ApplicationContextLoader;
import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Patrick Fey on 15.01.2016.
 */
public class ApplicationContextLoaderImpl implements ApplicationContextLoader {
    private final List<String> springConfigs;
    private final ApplicationContext applicationContext;

    public ApplicationContextLoaderImpl(List<String> springConfigs) {
        final List<String> coreConfigs = Arrays.asList("core-application-context.xml");
        this.springConfigs = ImmutableList.<String>builder().addAll(coreConfigs)
                .addAll(springConfigs).build();
        applicationContext = new ClassPathXmlApplicationContext(this.springConfigs.toArray(new String[springConfigs.size()]));

    }

    @Override
    public ApplicationContext getContext() {
        return applicationContext;
    }

    public List<String> getSpringConfigs() {
        return springConfigs;
    }
}
