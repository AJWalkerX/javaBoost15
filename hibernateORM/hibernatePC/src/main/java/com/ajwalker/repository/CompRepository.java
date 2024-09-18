package com.ajwalker.repository;

import com.ajwalker.entity.Components;

public class CompRepository extends RepositoryManager<Components, Long> {
    public CompRepository() {
        super(Components.class);
    }
}
