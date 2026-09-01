package com.azraaticipia.moviecatalogimdb;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity {

    private RecyclerView recyclerViewFavorites;
    private MovieAdapter movieAdapter;
    private ArrayList<Movie> favoriteMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        recyclerViewFavorites = findViewById(R.id.recyclerViewFavorites);

        favoriteMovies = new ArrayList<>();

        for (Movie movie : MovieData.getMovies()) {

            if (movie.isFavorite()) {
                favoriteMovies.add(movie);
            }
        }

        movieAdapter = new MovieAdapter(favoriteMovies);

        recyclerViewFavorites.setLayoutManager(
                new LinearLayoutManager(this)
        );

        recyclerViewFavorites.setAdapter(movieAdapter);
    }
}