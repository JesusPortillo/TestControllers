package com.sofkaU.TestingControllers.service;

import com.sofkaU.TestingControllers.model.Widget;
import com.sofkaU.TestingControllers.repository.WidgetRepository;

import java.util.List;
import java.util.Optional;

public class WidgetServiceImpl implements WidgetService{

    private WidgetRepository repository;

    public WidgetServiceImpl(WidgetRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Widget> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Widget> findAll() {
        return repository.findAll();
    }

    @Override
    public Widget save(Widget widget) {
        widget.setVersion(widget.getVersion()+1);
        return repository.save(widget);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
