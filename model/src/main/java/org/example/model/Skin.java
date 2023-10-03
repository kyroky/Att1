package org.example.model;

public class Skin {
    private Integer id;
    private String name;
    private Integer cost;
    private Integer playerId;

    public Skin() {
    }

    public Skin(Integer id, String name, Integer cost, Integer playerId) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.playerId = playerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return "Skin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", playerId=" + playerId +
                '}';
    }
}
