package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private Integer count;

    public Generator(Integer count) {
        this.count = count;
    }

    public List<Player> generate(){
        List<Player> players = new ArrayList<>();
        for (int i = 1; i < count+1; i++) {
            Player player = new Player();
            player.setPlayerId(i);
            player.setNickname("Player_"+i);

            List<Skin> skins = new ArrayList<>();
            for (int j = 1; j < new Random().nextInt(1, 20); j++) {
                skins.add(new Skin(
                        i*(count+1)*10+j,
                        SkinName.values()[new Random().nextInt(0, SkinName.values().length)].name(),
                        new Random().nextInt(200, 20000),
                        i
                        )
                );
            }
            player.setSkins(skins);

            List<Game> games = new ArrayList<>();
            for (int j = 1; j < new Random().nextInt(1, 20); j++) {
                games.add(new Game(
                        i*(count+1)*10+j,
                        new Random().nextInt(0, 50),
                        new Random().nextInt(0, 50),
                        new Random().nextInt(0, 50),
                        i
                        )
                );
            }
            player.setGameHistory(games);

            List<Agent> agents = new ArrayList<>();
            for (int j = 1; j < new Random().nextInt(1, 20); j++) {
                agents.add(new Agent(
                        i*(count+1)*10+j,
                        AgentNames.values()[new Random().nextInt(0, AgentNames.values().length)].name(),
                        new Random().nextInt(0, 1000),
                        new Random().nextInt(0, 500),
                        i
                        )
                );
            }
            player.setAgents(agents);

            Location location = new Location(
                    CountryNames.values()[new Random().nextInt(0, CountryNames.values().length)].name(),
                    new Random().nextInt(200, 1000),
                    i
            );
            player.setLocation(location);
            players.add(player);
        }
        return players;
    }

}
