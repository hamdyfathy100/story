package com.story.and.tales;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {

    Activity activity;
    ArrayList<StoryData> storyData;

    public StoryAdapter(Activity activity, ArrayList<StoryData> storyData) {
        this.activity = activity;
        this.storyData = storyData;
    }

    @NonNull
    @Override
    public StoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.list_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.MyViewHolder holder, int position) {
        Picasso
                .get()
                .load(storyData.get(position).getLinkImage())
                .placeholder(R.drawable.ic_image)
                .error(R.drawable.ic_error)
                .into(holder.imageStory);
        holder.nameStory.setText(storyData.get(position).getNameStory());
    }

    @Override
    public int getItemCount() {
        return storyData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageStory;
        private TextView nameStory;
        private CardView parent;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameStory = itemView.findViewById(R.id.name_story);
            imageStory = itemView.findViewById(R.id.image_story);
            parent = itemView.findViewById(R.id.CardView);
        }
    }
}
