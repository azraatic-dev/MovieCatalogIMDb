package com.azraaticipia.moviecatalogimdb;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import android.widget.Button;

public class MovieDetailsActivity extends AppCompatActivity {

    private ImageView imageDetailsPoster;
    private TextView textDetailsTitle;
    private TextView textDetailsGenre;
    private TextView textDetailsRating;
    private TextView textDetailsDescription;
    private RecyclerView recyclerViewActors;
    private ActorAdapter actorAdapter;
    private Button buttonFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        imageDetailsPoster = findViewById(R.id.imageDetailsPoster);
        textDetailsTitle = findViewById(R.id.textDetailsTitle);
        textDetailsGenre = findViewById(R.id.textDetailsGenre);
        textDetailsRating = findViewById(R.id.textDetailsRating);
        textDetailsDescription = findViewById(R.id.textDetailsDescription);
        recyclerViewActors = findViewById(R.id.recyclerViewActors);
        buttonFavorite = findViewById(R.id.buttonFavorite);

        String title = getIntent().getStringExtra("title");
        String genre = getIntent().getStringExtra("genre");
        float rating = getIntent().getFloatExtra("rating", 0);
        String description = getIntent().getStringExtra("description");
        int posterResId = getIntent().getIntExtra("posterResId", 0);

        textDetailsTitle.setText(title);
        textDetailsGenre.setText(genre);
        textDetailsRating.setText("Rating: " + rating);
        textDetailsDescription.setText(description);

        if (posterResId != 0) {
            imageDetailsPoster.setImageResource(posterResId);
        }

        ArrayList<Movie> movies = MovieData.getMovies();

        Movie selectedMovie = null;

        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                selectedMovie = movie;
                break;
            }
        }

        if (selectedMovie != null) {

            Movie finalSelectedMovie = selectedMovie;

            if (finalSelectedMovie.isFavorite()) {
                buttonFavorite.setText("Remove from Favorites");
            } else {
                buttonFavorite.setText("Add to Favorites");
            }

            buttonFavorite.setOnClickListener(view -> {

                finalSelectedMovie.setFavorite(!finalSelectedMovie.isFavorite());

                if (finalSelectedMovie.isFavorite()) {
                    buttonFavorite.setText("Remove from Favorites");
                } else {
                    buttonFavorite.setText("Add to Favorites");
                }
            });

            actorAdapter = new ActorAdapter(finalSelectedMovie.getActors());

            recyclerViewActors.setLayoutManager(
                    new LinearLayoutManager(
                            this,
                            LinearLayoutManager.HORIZONTAL,
                            false
                    )
            );

            recyclerViewActors.setAdapter(actorAdapter);
        }
    }
}