package com.azraaticipia.moviecatalogimdb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import android.content.Intent;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private ArrayList<Movie> movies;

    public MovieAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void updateList(ArrayList<Movie> newMovies) {
        movies = newMovies;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie, parent, false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        Movie movie = movies.get(position);

        holder.textTitle.setText(movie.getTitle());
        holder.textGenre.setText(movie.getGenre());
        holder.textRating.setText("Rating: " + movie.getRating());

        if (movie.getPosterResId() != 0) {
            holder.imagePoster.setImageResource(movie.getPosterResId());
        }

        holder.itemView.setOnClickListener(v -> {

            holder.itemView.setOnClickListener(view -> {

                Intent intent = new Intent(v.getContext(), MovieDetailsActivity.class);

                intent.putExtra("title", movie.getTitle());
                intent.putExtra("genre", movie.getGenre());
                intent.putExtra("rating", movie.getRating());
                intent.putExtra("description", movie.getDescription());
                intent.putExtra("posterResId", movie.getPosterResId());

                v.getContext().startActivity(intent);
            });
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView imagePoster;
        TextView textTitle;
        TextView textGenre;
        TextView textRating;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            imagePoster = itemView.findViewById(R.id.imagePoster);
            textTitle = itemView.findViewById(R.id.textTitle);
            textGenre = itemView.findViewById(R.id.textGenre);
            textRating = itemView.findViewById(R.id.textRating);
        }
    }
}
