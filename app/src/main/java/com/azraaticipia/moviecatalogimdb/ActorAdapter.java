package com.azraaticipia.moviecatalogimdb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder> {

    private ArrayList<Actor> actors;

    public ActorAdapter(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    @NonNull
    @Override
    public ActorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_actor, parent, false);

        return new ActorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActorViewHolder holder, int position) {

        Actor actor = actors.get(position);

        holder.textActorName.setText(actor.getName());

        if (actor.getImageResId() != 0) {
            holder.imageActor.setImageResource(actor.getImageResId());
        }
    }

    @Override
    public int getItemCount() {
        return actors.size();
    }

    public static class ActorViewHolder extends RecyclerView.ViewHolder {

        ImageView imageActor;
        TextView textActorName;

        public ActorViewHolder(@NonNull View itemView) {
            super(itemView);

            imageActor = itemView.findViewById(R.id.imageActor);
            textActorName = itemView.findViewById(R.id.textActorName);
        }
    }
}