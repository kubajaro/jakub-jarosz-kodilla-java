package com.kodilla.spring.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDbController controller;

    public Library(LibraryDbController controller) {
        this.controller = controller;
    }

    public void saveToDB() {
        controller.saveData();
    }

    public void loadFromDB() {
        controller.loadData();
    }
}
