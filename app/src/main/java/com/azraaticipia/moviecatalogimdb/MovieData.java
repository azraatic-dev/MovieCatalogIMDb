package com.azraaticipia.moviecatalogimdb;

import java.util.ArrayList;

public class MovieData {

    public static ArrayList<Movie> getMovies() {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie(
                "Inception",
                "Sci-Fi / Thriller",
                8.8f,
                "A skilled thief enters people's dreams to steal their secrets. " +
                        "He is given a chance to erase his past by planting an idea in someone's mind.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Interstellar",
                "Sci-Fi / Drama",
                8.7f,
                "A group of astronauts travels through a wormhole in search of a new home for humanity. " +
                        "Their journey challenges the limits of time, space and human connection.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "The Dark Knight",
                "Action / Crime",
                9.0f,
                "Batman faces a criminal mastermind known as the Joker. " +
                        "The conflict pushes Gotham City and its heroes to their limits.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Titanic",
                "Romance / Drama",
                7.9f,
                "Two young passengers from different social classes fall in love aboard the Titanic. " +
                        "Their relationship is tested when disaster strikes the ship.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Gladiator",
                "Action / Drama",
                8.5f,
                "A Roman general is betrayed and forced into slavery. " +
                        "He rises as a gladiator while seeking justice against the emperor who destroyed his family.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Avatar",
                "Sci-Fi / Adventure",
                7.9f,
                "A former Marine travels to the distant world of Pandora. " +
                        "There he becomes involved in the conflict between humans and the native Na'vi people.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Joker",
                "Crime / Drama",
                8.4f,
                "A struggling entertainer faces rejection and isolation in Gotham City. " +
                        "His experiences gradually transform him into the criminal figure known as the Joker.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "The Matrix",
                "Sci-Fi / Action",
                8.7f,
                "A computer hacker discovers that the world around him is a simulated reality. " +
                        "He joins a group of rebels fighting against the machines that control humanity.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Forrest Gump",
                "Drama / Romance",
                8.8f,
                "A kind-hearted man experiences several major moments in American history. " +
                        "Throughout his life, he remains devoted to the woman he has loved since childhood.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "The Shawshank Redemption",
                "Drama",
                9.3f,
                "A banker is sentenced to prison for a crime he says he did not commit. " +
                        "Over the years, he forms an important friendship and quietly holds on to hope.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "The Godfather",
                "Crime / Drama",
                9.2f,
                "The aging leader of a powerful crime family prepares to pass control to the next generation. " +
                        "His reluctant son gradually becomes deeply involved in the family business.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Pulp Fiction",
                "Crime / Drama",
                8.9f,
                "Several connected stories follow criminals, hitmen and other characters in Los Angeles. " +
                        "Their choices lead to unexpected and often violent consequences.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Fight Club",
                "Drama / Thriller",
                8.8f,
                "An unhappy office worker forms an unusual friendship with a charismatic stranger. " +
                        "Together they create an underground fight club that grows into something much larger.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "The Lord of the Rings: The Fellowship of the Ring",
                "Fantasy / Adventure",
                8.9f,
                "A young hobbit is given the dangerous task of carrying a powerful ring. " +
                        "He begins a journey with a group of companions who must protect him and the fate of Middle-earth.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "The Lord of the Rings: The Return of the King",
                "Fantasy / Adventure",
                9.0f,
                "The final battle for Middle-earth begins as its armies prepare to face Sauron. " +
                        "Meanwhile, Frodo and Sam continue their dangerous journey toward Mount Doom.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "The Silence of the Lambs",
                "Thriller / Crime",
                8.6f,
                "A young FBI trainee seeks the help of an imprisoned psychiatrist and serial killer. " +
                        "She hopes his insight will help her capture another dangerous murderer.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Saving Private Ryan",
                "War / Drama",
                8.6f,
                "A group of soldiers is sent behind enemy lines during World War II. " +
                        "Their mission is to find and bring home a paratrooper whose brothers have been killed.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "The Green Mile",
                "Drama / Fantasy",
                8.6f,
                "A prison guard meets a death-row inmate with an extraordinary gift. " +
                        "The experience forces him to question justice, compassion and the events happening around him.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Parasite",
                "Thriller / Drama",
                8.5f,
                "A struggling family gradually becomes employed by a wealthy household. " +
                        "Their plan seems successful until unexpected secrets begin to surface.",
                0,
                new ArrayList<>()
        ));

        movies.add(new Movie(
                "Whiplash",
                "Drama / Music",
                8.5f,
                "A young drummer enters an elite music conservatory and wants to become one of the best. " +
                        "His demanding instructor pushes him beyond his physical and emotional limits.",
                0,
                new ArrayList<>()
        ));

        return movies;
    }
}
