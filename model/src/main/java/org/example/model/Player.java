package org.example.model;

import java.util.List;

public class Player {
    private Integer playerId;
    private String nickname;
    private List<Skin> skins;
    private List<Game> gameHistory;
    private List<Agent> agents;
    private Location location;

    public Player(Integer id, String nickname, List<Skin> skins, List<Game> gameHistory, List<Agent> agents, Location location) {
        this.playerId = id;
        this.nickname = nickname;
        this.skins = skins;
        this.gameHistory = gameHistory;
        this.agents = agents;
        this.location = location;
    }

    public Player() {
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Skin> getSkins() {
        return skins;
    }

    public void setSkins(List<Skin> skins) {
        this.skins = skins;
    }

    public List<Game> getGameHistory() {
        return gameHistory;
    }

    public void setGameHistory(List<Game> gameHistory) {
        this.gameHistory = gameHistory;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", nickname='" + nickname + '\'' +
                ", skins=" + skins +
                ", gameHistory=" + gameHistory +
                ", agents=" + agents +
                ", location=" + location +
                '}';
    }
}
