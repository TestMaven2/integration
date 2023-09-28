package com.example.integration.controller;

import com.example.integration.entity.Vacancies;
import com.example.integration.entity.VacancySimple;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/vacancies")
public class VacancyController {

    private String url = "https://api.hh.ru/vacancies";
    private RestTemplate template = new RestTemplate();

    @GetMapping
    public List<VacancySimple> getFirstFive() {
        RequestEntity<String> requestEntity = new RequestEntity<>(HttpMethod.GET, URI.create(url));
        ResponseEntity<Vacancies> response = template.exchange(requestEntity, Vacancies.class);
        return response.getBody().getItems().stream().limit(5).toList();
    }
}