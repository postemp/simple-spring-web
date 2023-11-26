package ru.otus.java.basic.spring.dto;

public class ProductDTO { // наружу отдаем только DTO, это урезанная версия сущности
    private String title;
    private int cost;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }



    public ProductDTO(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public ProductDTO() {
    }
}
