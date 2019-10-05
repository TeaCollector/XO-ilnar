package ru.ilnar.xo.model;

public class Game {
    private final Player[] players;
    private final String name;
    private final Figure figure;

    public Game(final Player[] players,final String name,final Figure figure) {
        this.players = players;
        this.name = name;
        this.figure = figure;
    }

    public Player[] getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
