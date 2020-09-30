package com.personal.knowledge.system.service;

import com.personal.knowledge.system.model.Model;
import org.springframework.transaction.annotation.Transactional;

public interface ModelService {
    public Model testDemo(Long modelId);

    public void f();

    @Transactional
    public void addModel(Model model);
}
