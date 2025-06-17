package example;

import java.util.*;
import java.util.stream.Collectors;

public class PlayerTest {

    static List<Player> players = new ArrayList<>();

    public static void main(String[] args) {

        players.add(new Player("Virat", 36, "Science", 2008, 63100.20));
        players.add(new Player("Dhoni", 42, "Arts", 2003, 85700.70));
        players.add(new Player("Sachin", 48, "Arts", 1994, 87800.60));
        players.add(new Player("Rahul", 47, "Commerce", 1998, 86900.50));
        players.add(new Player("Shubman", 26, "Science", 2019, 57400.80));
        players.add(new Player("Rohit", 37, "Arts", 2007, 67900.30));
        players.add(new Player("Jadeja", 37, "Commerce", 2009, 59900.00));
        players.add(new Player("Bumrah", 27, "Science", 2020, 55700.50));
        players.add(new Player("Shami", 36, "Arts", 2017, 60200.40));
        players.add(new Player("Ashwin", 38, "Commerce", 2018, 63100.10));
        players.add(new Player("Rishab", 29, "Arts", 2020, 51200.50));
        players.add(new Player("Hardik", 31, "Science", 2016, 60500.20));
        players.add(new Player("Axar", 33, "Arts", 2019, 62000.90));
        players.add(new Player("Yuvraj", 45, "Science", 2001, 79500.30));
        players.add(new Player("Tilak", 23, "Science", 2024, 41600.50));
        players.add(new Player("Abhishek", 22, "Arts", 2023, 45700.70));
        players.add(new Player("Sehwag", 47, "Arts", 1999, 87800.60));
        players.add(new Player("Kuldeep", 35, "Arts", 2021, 54100.00));
        players.add(new Player("Ishan", 27, "Commerce", 2022, 49200.10));


        // get all players name
        //getPlayerNames();

        // get all player names in sorted order
        //playerNamesSorted();

        // most senior player
        //oldestPlayer();

        // youngest player
        //youngestPlayer();

        // group by branch
        //groupByBranch();

        // name start with and age >
        //nameStartWithS();

        // most paid player
        //mostPaidPlayer();

        mostPaidPlayerByBranch();
    }


    // get all players name
    static void getPlayerNames() {
        List<String> studentNames = players.stream()
                                           .map(Player::name)
                                           .toList();
        System.out.println(studentNames);
    }

    // get all player names in sorted order
    static void playerNamesSorted() {
        players.stream()
               .map(Player::name)
               .sorted()
               .forEach(System.out::println);
    }

    // oldest player
    static void oldestPlayer() {
        players.stream()
               .max(Comparator.comparingInt(Player::age))
               .ifPresentOrElse(player -> System.out.println("Oldest player: "
                                                             + player.name()
                                                             + ", Age: "
                                                             + player.age()),
                                () -> System.out.println("No player found."));
    }

    // youngest player
    static void youngestPlayer() {
        players.stream()
               .min(Comparator.comparingInt(Player::age))
               .ifPresentOrElse(player -> System.out.println("Youngest player: "
                                                             + player.name()
                                                             + ", Age: "
                                                             + player.age()),
                                () -> System.out.println("No player found."));
    }

    static void groupByBranch() {
        players.stream()
               .collect(Collectors.groupingBy(Player::branch))
               .forEach((branch, playerList) -> System.out.println(branch + ":\n" + playerList));
    }

    // name start with and age >
    static void nameStartWithS() {
        players.stream()
               .filter(player -> player.name()
                                       .startsWith("S") && player.age() > 40)
               .forEach(System.out::println);
    }

    // most paid player
    static void mostPaidPlayer() {
        players.stream()
               .max(Comparator.comparingDouble(Player::fee))
               .ifPresentOrElse(player -> System.out.println("Most paid player: "
                                                             + player.name()
                                                             + ", Fee: "
                                                             + player.fee()),
                                () -> System.out.println("No player found!"));
    }

    // most paid player by each branch
    static void mostPaidPlayerByBranch() {
        Map<String, Optional<Player>> collect = players.stream()
                                                       .collect(Collectors.groupingBy(Player::branch,
                                                                                      Collectors.maxBy(Comparator.comparingDouble(
                                                                                              Player::fee))));
        collect.forEach((branch, pl) -> {
            System.out.println("Branch: " + branch + ", most paid player: " + pl.get()
                                                                                .name() + ", fee: " + pl.get()
                                                                                                        .fee());
        });
    }
}
