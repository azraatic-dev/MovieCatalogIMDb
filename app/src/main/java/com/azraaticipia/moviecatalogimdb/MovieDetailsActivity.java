package com.azraaticipia.moviecatalogimdb;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MovieDetailsActivity extends AppCompatActivity {

    private ImageView imageDetailsPoster;
    private TextView textDetailsTitle;
    private TextView textDetailsGenre;
    private TextView textDetailsRating;
    private TextView textDetailsDescription;
    private RecyclerView recyclerViewActors;
    private ActorAdapter actorAdapter;

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

        int moviePosition = getIntent().getIntExtra("moviePosition", 0);

        ArrayList<Movie> movies = MovieData.getMovies();

        Movie movie = movies.get(moviePosition);

        actorAdapter = new ActorAdapter(movie.getActors());

        recyclerViewActors.setLayoutManager(
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.HORIZONTAL,
                        false
                )
        );

        recyclerViewActors.setAdapter(actorAdapter);

        textDetailsTitle.setText(movie.getTitle());
        textDetailsGenre.setText(movie.getGenre());
        textDetailsRating.setText("Rating: " + movie.getRating());
        textDetailsDescription.setText(movie.getDescription());

        if (movie.getPosterResId() != 0) {
            imageDetailsPoster.setImageResource(movie.getPosterResId());
        }
    }
}