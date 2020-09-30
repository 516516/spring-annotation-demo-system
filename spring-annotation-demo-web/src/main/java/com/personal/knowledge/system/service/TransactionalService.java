package com.personal.knowledge.system.service;

import org.springframework.transaction.annotation.Transactional;

public interface TransactionalService {
    @Transactional
    public void addMath();
}
