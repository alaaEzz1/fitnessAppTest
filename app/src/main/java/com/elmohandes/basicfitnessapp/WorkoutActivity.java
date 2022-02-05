package com.elmohandes.basicfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.elmohandes.basicfitnessapp.databinding.ActivityWorkoutBinding;

public class WorkoutActivity extends AppCompatActivity {

    ActivityWorkoutBinding binding;
    Animation bgProgressAnim , btnExerciseAnim ,titleAnim ,imageAnim , bgProgressTopAnm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        binding = ActivityWorkoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        bgProgressAnim = AnimationUtils.loadAnimation(this,R.anim.bgprogress_anim);
        btnExerciseAnim = AnimationUtils.loadAnimation(this,R.anim.btnexercise_anim);
        titleAnim = AnimationUtils.loadAnimation(this,R.anim.title_anim);
        imageAnim = AnimationUtils.loadAnimation(this,R.anim.image_anim);
        bgProgressTopAnm = AnimationUtils.loadAnimation(this,R.anim.bgprogresstop_anim);

        binding.workoutLinearBicep.startAnimation(bgProgressAnim);
        binding.workoutLinearChest.startAnimation(bgProgressAnim);
        binding.workoutLinearLeg.startAnimation(bgProgressTopAnm);
        binding.workoutLinearShoulder.startAnimation(bgProgressTopAnm);
        binding.workoutTxtExercise.startAnimation(btnExerciseAnim);
        binding.workoutTxtTitle.startAnimation(titleAnim);
        binding.workoutTxtIntro.startAnimation(titleAnim);
        binding.workoutTxtBody.startAnimation(imageAnim);
        binding.workoutTxtSubtitle.startAnimation(imageAnim);

    }
}