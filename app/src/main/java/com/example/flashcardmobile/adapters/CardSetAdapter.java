package com.example.flashcardmobile.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flashcardmobile.R;
import com.example.flashcardmobile.model.CardSet;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CardSetAdapter extends RecyclerView.Adapter<CardSetAdapter.CardSetViewHolder> {
    private final List<CardSet> listCardSet;

    public CardSetAdapter(List<CardSet> listCardSet) {
        this.listCardSet = listCardSet;
    }

    @NonNull
    @Override
    public CardSetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card_set, parent, false);
        return new CardSetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardSetViewHolder holder, int position) {
        CardSet item = listCardSet.get(position);
        if(item == null ) return;

        holder.tvTitle.setText(item.getName());
        holder.tvTitle.setTooltipText(item.getName());
        holder.tvQuantity.setText(item.getQuantity() + " từ vựng");
        holder.civAvatar.setImageResource(item.getOwnerAvatar());
        holder.tvOwnerName.setText(item.getOwnerName());
    }

    @Override
    public int getItemCount() {
        if(listCardSet == null) return 0;
        return listCardSet.size();
    }

    public class CardSetViewHolder extends RecyclerView.ViewHolder{
        private final TextView tvTitle, tvQuantity, tvOwnerName;
        private CircleImageView civAvatar;
        public CardSetViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvQuantity = itemView.findViewById(R.id.tvQuantity);
            tvOwnerName = itemView.findViewById(R.id.tvOwnerName);
            civAvatar = itemView.findViewById(R.id.civAvatar);
        }
    }
}
