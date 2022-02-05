package com.elmohandes.basicfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.elmohandes.basicfitnessapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Animation imgAnimationPage,titleAnimationPage,bgProgressAnimationPage;
    Animation btnExerciseAnimationPage,bgProgressTopAnimationPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        imgAnimationPage = AnimationUtils.loadAnimation(this,R.anim.image_anim);
        titleAnimationPage = AnimationUtils.loadAnimation(this,R.anim.title_anim);
        bgProgressAnimationPage = AnimationUtils.
                loadAnimation(this,R.anim.bgprogress_anim);
        btnExerciseAnimationPage = AnimationUtils.
                loadAnimation(this,R.anim.btnexercise_anim);
        bgProgressTopAnimationPage = AnimationUtils.
                loadAnimation(this,R.anim.bgprogresstop_anim);


        binding.mainImageFitness.startAnimation(imgAnimationPage);
        binding.mainTxtTitle.startAnimation(titleAnimationPage);
        binding.mainTxtSubtitle.startAnimation(titleAnimationPage);
        binding.mainBgProgress.startAnimation(bgProgressAnimationPage);
        binding.mainTxtExercise.startAnimation(btnExerciseAnimationPage);
        binding.mainBgProgresstob.startAnimation(bgProgressTopAnimationPage);

        binding.mainTxtExercise.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this
                    ,WorkoutActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(intent);

        });

    }
}