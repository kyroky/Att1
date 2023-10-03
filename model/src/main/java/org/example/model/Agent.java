package org.example.model;

public class Agent {
    private Integer id;
    private String name;
    private Integer gameHours;
    private Integer numberGames;
    private Integer playerId;

    public Agent(Integer id, String name, Integer gameHours, Integer numberGames, Integer playerId) {
        this.id = id;
        this.name = name;
        this.gameHours = gameHours;
        this.numberGames = numberGames;
        this.playerId = playerId;
    }

    public Agent() {
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
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

    public Integer getGameHours() {
        return gameHours;
    }

    public void setGameHours(Integer gameHours) {
        this.gameHours = gameHours;
    }

    public Integer getNumberGames() {
        return numberGames;
    }

    public void setNumberGames(Integer numberGames) {
        this.numberGames = numberGames;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gameHours=" + gameHours +
                ", numberGames=" + numberGames +
                ", playerId=" + playerId +
                '}';
    }
}
