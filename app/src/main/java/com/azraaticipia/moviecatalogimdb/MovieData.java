package com.azraaticipia.moviecatalogimdb;

import java.util.ArrayList;

public class MovieData {
        private static final ArrayList<Movie> movies = createMovies();

        public static ArrayList<Movie> getMovies() {
            return movies;
        }

        private static ArrayList<Movie> createMovies() {

            ArrayList<Movie> movies = new ArrayList<>();

        // INCEPTION
        ArrayList<Actor> inceptionActors = new ArrayList<>();
        inceptionActors.add(new Actor("Leonardo DiCaprio", 0));
        inceptionActors.add(new Actor("Joseph Gordon-Levitt", 0));
        inceptionActors.add(new Actor("Elliot Page", 0));
        inceptionActors.add(new Actor("Tom Hardy", 0));
        inceptionActors.add(new Actor("Ken Watanabe", 0));

        movies.add(new Movie(
                "Inception",
                "Sci-Fi / Thriller",
                8.8f,
                "A skilled thief enters people's dreams to steal their secrets. " +
                        "He is given a chance to erase his past by planting an idea in someone's mind.",
                R.drawable.poster_inception,
                inceptionActors
        ));

        // INTERSTELLAR
        ArrayList<Actor> interstellarActors = new ArrayList<>();
        interstellarActors.add(new Actor("Matthew McConaughey", 0));
        interstellarActors.add(new Actor("Anne Hathaway", 0));
        interstellarActors.add(new Actor("Jessica Chastain", 0));
        interstellarActors.add(new Actor("Michael Caine", 0));
        interstellarActors.add(new Actor("Mackenzie Foy", 0));

        movies.add(new Movie(
                "Interstellar",
                "Sci-Fi / Drama",
                8.7f,
                "A group of astronauts travels through a wormhole in search of a new home for humanity. " +
                        "Their journey challenges the limits of time, space and human connection.",
                R.drawable.poster_interstellar,
                interstellarActors
        ));

        // THE DARK KNIGHT
        ArrayList<Actor> darkKnightActors = new ArrayList<>();
        darkKnightActors.add(new Actor("Christian Bale", 0));
        darkKnightActors.add(new Actor("Heath Ledger", 0));
        darkKnightActors.add(new Actor("Aaron Eckhart", 0));
        darkKnightActors.add(new Actor("Michael Caine", 0));
        darkKnightActors.add(new Actor("Gary Oldman", 0));

        movies.add(new Movie(
                "The Dark Knight",
                "Action / Crime",
                9.0f,
                "Batman faces a criminal mastermind known as the Joker. " +
                        "The conflict pushes Gotham City and its heroes to their limits.",
                R.drawable.poster_thedarkknight,
                darkKnightActors
        ));

        // TITANIC
        ArrayList<Actor> titanicActors = new ArrayList<>();
        titanicActors.add(new Actor("Leonardo DiCaprio", 0));
        titanicActors.add(new Actor("Kate Winslet", 0));
        titanicActors.add(new Actor("Billy Zane", 0));
        titanicActors.add(new Actor("Kathy Bates", 0));
        titanicActors.add(new Actor("Frances Fisher", 0));

        movies.add(new Movie(
                "Titanic",
                "Romance / Drama",
                7.9f,
                "Two young passengers from different social classes fall in love aboard the Titanic. " +
                        "Their relationship is tested when disaster strikes the ship.",
                R.drawable.poster_titanic,
                titanicActors
        ));

        // GLADIATOR
        ArrayList<Actor> gladiatorActors = new ArrayList<>();
        gladiatorActors.add(new Actor("Russell Crowe", 0));
        gladiatorActors.add(new Actor("Joaquin Phoenix", 0));
        gladiatorActors.add(new Actor("Connie Nielsen", 0));
        gladiatorActors.add(new Actor("Oliver Reed", 0));
        gladiatorActors.add(new Actor("Djimon Hounsou", 0));

        movies.add(new Movie(
                "Gladiator",
                "Action / Drama",
                8.5f,
                "A Roman general is betrayed and forced into slavery. " +
                        "He rises as a gladiator while seeking justice against the emperor who destroyed his family.",
                R.drawable.poster_gladiator,
                gladiatorActors
        ));

        // AVATAR
        ArrayList<Actor> avatarActors = new ArrayList<>();
        avatarActors.add(new Actor("Sam Worthington", 0));
        avatarActors.add(new Actor("Zoe Saldana", 0));
        avatarActors.add(new Actor("Sigourney Weaver", 0));
        avatarActors.add(new Actor("Stephen Lang", 0));
        avatarActors.add(new Actor("Michelle Rodriguez", 0));

        movies.add(new Movie(
                "Avatar",
                "Sci-Fi / Adventure",
                7.9f,
                "A former Marine travels to the distant world of Pandora. " +
                        "There he becomes involved in the conflict between humans and the native Na'vi people.",
                R.drawable.poster_avatar,
                avatarActors
        ));

        // JOKER
        ArrayList<Actor> jokerActors = new ArrayList<>();
        jokerActors.add(new Actor("Joaquin Phoenix", 0));
        jokerActors.add(new Actor("Robert De Niro", 0));
        jokerActors.add(new Actor("Zazie Beetz", 0));
        jokerActors.add(new Actor("Frances Conroy", 0));
        jokerActors.add(new Actor("Brett Cullen", 0));

        movies.add(new Movie(
                "Joker",
                "Crime / Drama",
                8.4f,
                "A struggling entertainer faces rejection and isolation in Gotham City. " +
                        "His experiences gradually transform him into the criminal figure known as the Joker.",
                R.drawable.poster_joker,
                jokerActors
        ));

        // THE MATRIX
        ArrayList<Actor> matrixActors = new ArrayList<>();
        matrixActors.add(new Actor("Keanu Reeves", 0));
        matrixActors.add(new Actor("Laurence Fishburne", 0));
        matrixActors.add(new Actor("Carrie-Anne Moss", 0));
        matrixActors.add(new Actor("Hugo Weaving", 0));
        matrixActors.add(new Actor("Joe Pantoliano", 0));

        movies.add(new Movie(
                "The Matrix",
                "Sci-Fi / Action",
                8.7f,
                "A computer hacker discovers that the world around him is a simulated reality. " +
                        "He joins a group of rebels fighting against the machines that control humanity.",
                R.drawable.poster_thematrix,
                matrixActors
        ));

        // FORREST GUMP
        ArrayList<Actor> forrestGumpActors = new ArrayList<>();
        forrestGumpActors.add(new Actor("Tom Hanks", 0));
        forrestGumpActors.add(new Actor("Robin Wright", 0));
        forrestGumpActors.add(new Actor("Gary Sinise", 0));
        forrestGumpActors.add(new Actor("Mykelti Williamson", 0));
        forrestGumpActors.add(new Actor("Sally Field", 0));

        movies.add(new Movie(
                "Forrest Gump",
                "Drama / Romance",
                8.8f,
                "A kind-hearted man experiences several major moments in American history. " +
                        "Throughout his life, he remains devoted to the woman he has loved since childhood.",
                R.drawable.poster_forrestgump,
                forrestGumpActors
        ));

        // THE SHAWSHANK REDEMPTION
        ArrayList<Actor> shawshankActors = new ArrayList<>();
        shawshankActors.add(new Actor("Tim Robbins", 0));
        shawshankActors.add(new Actor("Morgan Freeman", 0));
        shawshankActors.add(new Actor("Bob Gunton", 0));
        shawshankActors.add(new Actor("William Sadler", 0));
        shawshankActors.add(new Actor("Clancy Brown", 0));

        movies.add(new Movie(
                "The Shawshank Redemption",
                "Drama",
                9.3f,
                "A banker is sentenced to prison for a crime he says he did not commit. " +
                        "Over the years, he forms an important friendship and quietly holds on to hope.",
                R.drawable.poster_theshawshankredemption,
                shawshankActors
        ));

        // THE GODFATHER
        ArrayList<Actor> godfatherActors = new ArrayList<>();
        godfatherActors.add(new Actor("Marlon Brando", 0));
        godfatherActors.add(new Actor("Al Pacino", 0));
        godfatherActors.add(new Actor("James Caan", 0));
        godfatherActors.add(new Actor("Robert Duvall", 0));
        godfatherActors.add(new Actor("Diane Keaton", 0));

        movies.add(new Movie(
                "The Godfather",
                "Crime / Drama",
                9.2f,
                "The aging leader of a powerful crime family prepares to pass control to the next generation. " +
                        "His reluctant son gradually becomes deeply involved in the family business.",
                R.drawable.poster_thegodfather,
                godfatherActors
        ));

        // PULP FICTION
        ArrayList<Actor> pulpFictionActors = new ArrayList<>();
        pulpFictionActors.add(new Actor("John Travolta", 0));
        pulpFictionActors.add(new Actor("Samuel L. Jackson", 0));
        pulpFictionActors.add(new Actor("Uma Thurman", 0));
        pulpFictionActors.add(new Actor("Bruce Willis", 0));
        pulpFictionActors.add(new Actor("Ving Rhames", 0));

        movies.add(new Movie(
                "Pulp Fiction",
                "Crime / Drama",
                8.9f,
                "Several connected stories follow criminals, hitmen and other characters in Los Angeles. " +
                        "Their choices lead to unexpected and often violent consequences.",
                R.drawable.poster_pulpfiction,
                pulpFictionActors
        ));

        // FIGHT CLUB
        ArrayList<Actor> fightClubActors = new ArrayList<>();
        fightClubActors.add(new Actor("Brad Pitt", 0));
        fightClubActors.add(new Actor("Edward Norton", 0));
        fightClubActors.add(new Actor("Helena Bonham Carter", 0));
        fightClubActors.add(new Actor("Meat Loaf", 0));
        fightClubActors.add(new Actor("Jared Leto", 0));

        movies.add(new Movie(
                "Fight Club",
                "Drama / Thriller",
                8.8f,
                "An unhappy office worker forms an unusual friendship with a charismatic stranger. " +
                        "Together they create an underground fight club that grows into something much larger.",
                R.drawable.poster_fightclub,
                fightClubActors
        ));

        // THE FELLOWSHIP OF THE RING
        ArrayList<Actor> fellowshipActors = new ArrayList<>();
        fellowshipActors.add(new Actor("Elijah Wood", 0));
        fellowshipActors.add(new Actor("Ian McKellen", 0));
        fellowshipActors.add(new Actor("Viggo Mortensen", 0));
        fellowshipActors.add(new Actor("Sean Astin", 0));
        fellowshipActors.add(new Actor("Orlando Bloom", 0));

        movies.add(new Movie(
                "The Lord of the Rings: The Fellowship of the Ring",
                "Fantasy / Adventure",
                8.9f,
                "A young hobbit is given the dangerous task of carrying a powerful ring. " +
                        "He begins a journey with a group of companions who must protect him and the fate of Middle-earth.",
                R.drawable.poster_lordoftherings,
                fellowshipActors
        ));

        // THE RETURN OF THE KING
        ArrayList<Actor> returnKingActors = new ArrayList<>();
        returnKingActors.add(new Actor("Elijah Wood", 0));
        returnKingActors.add(new Actor("Viggo Mortensen", 0));
        returnKingActors.add(new Actor("Ian McKellen", 0));
        returnKingActors.add(new Actor("Sean Astin", 0));
        returnKingActors.add(new Actor("Orlando Bloom", 0));

        movies.add(new Movie(
                "The Lord of the Rings: The Return of the King",
                "Fantasy / Adventure",
                9.0f,
                "The final battle for Middle-earth begins as its armies prepare to face Sauron. " +
                        "Meanwhile, Frodo and Sam continue their dangerous journey toward Mount Doom.",
                R.drawable.poster_lordoftheringsking,
                returnKingActors
        ));

        // THE SILENCE OF THE LAMBS
        ArrayList<Actor> silenceActors = new ArrayList<>();
        silenceActors.add(new Actor("Jodie Foster", 0));
        silenceActors.add(new Actor("Anthony Hopkins", 0));
        silenceActors.add(new Actor("Scott Glenn", 0));
        silenceActors.add(new Actor("Ted Levine", 0));
        silenceActors.add(new Actor("Anthony Heald", 0));

        movies.add(new Movie(
                "The Silence of the Lambs",
                "Thriller / Crime",
                8.6f,
                "A young FBI trainee seeks the help of an imprisoned psychiatrist and serial killer. " +
                        "She hopes his insight will help her capture another dangerous murderer.",
                R.drawable.poster_thesilenceofthelambs,
                silenceActors
        ));

        // SAVING PRIVATE RYAN
        ArrayList<Actor> savingRyanActors = new ArrayList<>();
        savingRyanActors.add(new Actor("Tom Hanks", 0));
        savingRyanActors.add(new Actor("Matt Damon", 0));
        savingRyanActors.add(new Actor("Tom Sizemore", 0));
        savingRyanActors.add(new Actor("Edward Burns", 0));
        savingRyanActors.add(new Actor("Barry Pepper", 0));

        movies.add(new Movie(
                "Saving Private Ryan",
                "War / Drama",
                8.6f,
                "A group of soldiers is sent behind enemy lines during World War II. " +
                        "Their mission is to find and bring home a paratrooper whose brothers have been killed.",
                R.drawable.poster_savingprivateryan,
                savingRyanActors
        ));

        // THE GREEN MILE
        ArrayList<Actor> greenMileActors = new ArrayList<>();
        greenMileActors.add(new Actor("Tom Hanks", 0));
        greenMileActors.add(new Actor("Michael Clarke Duncan", 0));
        greenMileActors.add(new Actor("David Morse", 0));
        greenMileActors.add(new Actor("Bonnie Hunt", 0));
        greenMileActors.add(new Actor("James Cromwell", 0));

        movies.add(new Movie(
                "The Green Mile",
                "Drama / Fantasy",
                8.6f,
                "A prison guard meets a death-row inmate with an extraordinary gift. " +
                        "The experience forces him to question justice, compassion and the events happening around him.",
                R.drawable.poster_thegreenmile,
                greenMileActors
        ));

        // PARASITE
        ArrayList<Actor> parasiteActors = new ArrayList<>();
        parasiteActors.add(new Actor("Song Kang-ho", 0));
        parasiteActors.add(new Actor("Lee Sun-kyun", 0));
        parasiteActors.add(new Actor("Cho Yeo-jeong", 0));
        parasiteActors.add(new Actor("Choi Woo-shik", 0));
        parasiteActors.add(new Actor("Park So-dam", 0));

        movies.add(new Movie(
                "Parasite",
                "Thriller / Drama",
                8.5f,
                "A struggling family gradually becomes employed by a wealthy household. " +
                        "Their plan seems successful until unexpected secrets begin to surface.",
                R.drawable.poster_parasite,
                parasiteActors
        ));

        // WHIPLASH
        ArrayList<Actor> whiplashActors = new ArrayList<>();
        whiplashActors.add(new Actor("Miles Teller", 0));
        whiplashActors.add(new Actor("J. K. Simmons", 0));
        whiplashActors.add(new Actor("Paul Reiser", 0));
        whiplashActors.add(new Actor("Melissa Benoist", 0));
        whiplashActors.add(new Actor("Austin Stowell", 0));

        movies.add(new Movie(
                "Whiplash",
                "Drama / Music",
                8.5f,
                "A young drummer enters an elite music conservatory and wants to become one of the best. " +
                        "His demanding instructor pushes him beyond his physical and emotional limits.",
                R.drawable.poster_whiplash,
                whiplashActors
        ));

        return movies;
    }
}