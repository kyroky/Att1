package org.example.model;

public class Location {
    private String country;
    private Integer port;

    private Integer playerId;

    public Location(String country, Integer port, Integer playerId) {
        this.country = country;
        this.port = port;
        this.playerId = playerId;
    }

    public Location() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country='" + country + '\'' +
                ", port=" + port +
                ", playerId=" + playerId +
                '}';
    }
}
