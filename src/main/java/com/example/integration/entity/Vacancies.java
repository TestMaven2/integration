package com.example.integration.entity;

import java.util.ArrayList;
import java.util.List;

public class Vacancies {

    private List<VacancySimple> items = new ArrayList<>();

    public Vacancies() {
    }

    public List<VacancySimple> getItems() {
        return items;
    }

    public void setItems(List<VacancySimple> items) {
        this.items = items;
    }
}