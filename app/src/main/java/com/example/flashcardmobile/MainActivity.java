package com.example.flashcardmobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.flashcardmobile.databinding.ActivityMainBinding;
import com.example.flashcardmobile.fragments.CardsFragment;
import com.example.flashcardmobile.fragments.HomeFragment;
import com.example.flashcardmobile.fragments.ProfileFragment;
import com.example.flashcardmobile.fragments.CoursesFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Fragment homeFragment;
    private Fragment cardsFragment;
    private Fragment coursesFragment;
    private Fragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activeFragment(new HomeFragment());
        setEvent();
    }

    void setEvent(){
        binding.bottomNavigation.setOnItemSelectedListener(menuItem -> {
            int itemId = menuItem.getItemId();
            if(itemId == R.id.home){
                if(homeFragment == null) homeFragment = new HomeFragment();
                activeFragment(homeFragment);
            } else if(itemId == R.id.cards){
                if(cardsFragment == null) cardsFragment = new CardsFragment();
                activeFragment(new CardsFragment());
            } else if(itemId == R.id.courses){
                if(coursesFragment == null) coursesFragment = new CoursesFragment();
                activeFragment(coursesFragment);
            } else if(itemId == R.id.profile){
                if(profileFragment == null) profileFragment = new ProfileFragment();
                activeFragment(profileFragment);
            }
            return true;
        });
    }

    void activeFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragment);
        transaction.commit();
    }
}