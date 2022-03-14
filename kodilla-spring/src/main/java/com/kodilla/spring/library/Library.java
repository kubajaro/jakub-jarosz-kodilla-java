package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;

public final class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDbController controller;

    public Library() {
    }

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
