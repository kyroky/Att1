package org.example.model;

public class Game {
    private Integer id;
    private Integer kill;
    private Integer deaths;
    private Integer assists;
    private Integer playerId;
    public Game(Integer id, Integer kill, Integer deaths, Integer assists, Integer playerId) {
        this.id = id;
        this.kill = kill;
        this.deaths = deaths;
        this.assists = assists;
        this.playerId = playerId;
    }

    public Game() {
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

    public Integer getKill() {
        return kill;
    }

    public void setKill(Integer kill) {
        this.kill = kill;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", kill=" + kill +
                ", deaths=" + deaths +
                ", assists=" + assists +
                ", playerId=" + playerId +
                '}';
    }
}
