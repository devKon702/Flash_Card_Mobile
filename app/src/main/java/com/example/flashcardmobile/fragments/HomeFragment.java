package com.example.flashcardmobile.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flashcardmobile.adapters.CardSetAdapter;
import com.example.flashcardmobile.adapters.CourseAdapter;
import com.example.flashcardmobile.databinding.FragmentHomeBinding;
import com.example.flashcardmobile.model.CardSet;
import com.example.flashcardmobile.model.Course;
import com.example.flashcardmobile.repositories.CardSetRepository;
import com.example.flashcardmobile.repositories.CourseRepository;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator3;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    ArrayList<CardSet> listCardSet;
    ArrayList<CardSet> listRecommendedCardSet;
    ArrayList<Course> listCourses;
    ArrayList<Course> listRecommendedCourses;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        listCardSet = CardSetRepository.getAllCardSet();
        listRecommendedCardSet = CardSetRepository.getAllCardSet();

        listCourses = CourseRepository.getAllCourses();
        listRecommendedCourses = CourseRepository.getAllCourses();
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Gắn giao diện cho các học phần phổ biến
        setPager2(binding.viewPagerCardset, binding.circleIndicatorCarset, new CardSetAdapter(listCardSet));
        // Gán giao diện cho các học phần đề xuất
        setPager2(binding.viewPagerRecommendedCardset, binding.circleIndicatorRecommendedCardset, new CardSetAdapter(listRecommendedCardSet));
        // Gán giao diện cho các lớp học phổ biến
        setPager2(binding.viewPagerCourse, binding.circleIndicatorCourse, new CourseAdapter(listCourses));
        // Gán giao diện cho các lớp học đè xuất
        setPager2(binding.viewPagerRecommendedCourse, binding.circleIndicatorRecommendedCourse, new CourseAdapter(listRecommendedCourses));
    }

    void setPager2(ViewPager2 viewPager, CircleIndicator3 circleIndicator, RecyclerView.Adapter adapter){
        viewPager.setOffscreenPageLimit(3);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);

        CompositePageTransformer pageTransformer = new CompositePageTransformer();
        pageTransformer.addTransformer(new MarginPageTransformer(40));
//        pageTransformer.addTransformer(new ViewPager2.PageTransformer() {
//            @Override
//            public void transformPage(@NonNull View page, float position) {
//                float r = 1 - Math.abs(position);
//                page.setScaleY(0.85f + r * 0.15f);
//            }
//        });
        viewPager.setPageTransformer(pageTransformer);

        viewPager.setAdapter(adapter);
        circleIndicator.setViewPager(viewPager);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}