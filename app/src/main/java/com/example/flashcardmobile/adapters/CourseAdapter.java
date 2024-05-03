package com.example.flashcardmobile.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flashcardmobile.R;
import com.example.flashcardmobile.model.Course;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder>{

    private final ArrayList<Course> listCourse;

    public CourseAdapter(ArrayList<Course> listCourse){
        this.listCourse = listCourse;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_course, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        Course course = listCourse.get(position);
        if(course == null) return;

        holder.tvCourseTitle.setText(course.getName());
        holder.tvCourseTitle.setTooltipText(course.getName());
        holder.civTeacherAvatar.setImageResource(R.drawable.man_avatar);
        holder.tvTeacherName.setText(course.getTeacher().getName());
        holder.tvCardSetQuantity.setText(course.getListCardSet().size() + " bộ thẻ");
        holder.tvMemberQuantity.setText(course.getListMember().size() + " thành viên");
    }

    @Override
    public int getItemCount() {
        return listCourse.size();
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder{

        private final TextView tvCourseTitle, tvTeacherName, tvCardSetQuantity, tvMemberQuantity;
        private final CircleImageView civTeacherAvatar;
        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCourseTitle = itemView.findViewById(R.id.tvCourseTitle);
            tvTeacherName = itemView.findViewById(R.id.tvTeacherName);
            tvCardSetQuantity = itemView.findViewById(R.id.tvCardSetQuantity);
            tvMemberQuantity = itemView.findViewById(R.id.tvMemberQuantity);
            civTeacherAvatar = itemView.findViewById(R.id.civTeacherAvatar);
        }
    }

}
