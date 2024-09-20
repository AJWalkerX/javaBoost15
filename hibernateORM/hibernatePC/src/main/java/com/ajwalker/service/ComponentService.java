package com.ajwalker.service;

import com.ajwalker.entity.Components;
import com.ajwalker.repository.CompRepository;



public class ComponentService extends ServiceManager<Components, Long> {

    private final CompRepository componentRepository;

    public ComponentService() {
        this(new CompRepository());
    }

    private ComponentService(CompRepository componentRepository) {
        super(componentRepository);
        this.componentRepository = componentRepository;
    }
}
