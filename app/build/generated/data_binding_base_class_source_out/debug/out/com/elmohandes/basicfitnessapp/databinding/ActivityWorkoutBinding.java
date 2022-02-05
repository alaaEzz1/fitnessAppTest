// Generated by view binder compiler. Do not edit!
package com.elmohandes.basicfitnessapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.elmohandes.basicfitnessapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWorkoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View workoutBgProgress;

  @NonNull
  public final ImageView workoutImgBicep;

  @NonNull
  public final ImageView workoutImgChest;

  @NonNull
  public final ImageView workoutImgLeg;

  @NonNull
  public final ImageView workoutImgShoulder;

  @NonNull
  public final LinearLayout workoutLinearBicep;

  @NonNull
  public final LinearLayout workoutLinearChest;

  @NonNull
  public final LinearLayout workoutLinearLeg;

  @NonNull
  public final LinearLayout workoutLinearShoulder;

  @NonNull
  public final TextView workoutTxtBicep;

  @NonNull
  public final TextView workoutTxtBicepBody;

  @NonNull
  public final TextView workoutTxtBody;

  @NonNull
  public final TextView workoutTxtChest;

  @NonNull
  public final TextView workoutTxtChestBody;

  @NonNull
  public final TextView workoutTxtExercise;

  @NonNull
  public final TextView workoutTxtIntro;

  @NonNull
  public final TextView workoutTxtLeg;

  @NonNull
  public final TextView workoutTxtLegBody;

  @NonNull
  public final TextView workoutTxtShoulder;

  @NonNull
  public final TextView workoutTxtShoulderBody;

  @NonNull
  public final TextView workoutTxtSubtitle;

  @NonNull
  public final TextView workoutTxtTitle;

  private ActivityWorkoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull View workoutBgProgress, @NonNull ImageView workoutImgBicep,
      @NonNull ImageView workoutImgChest, @NonNull ImageView workoutImgLeg,
      @NonNull ImageView workoutImgShoulder, @NonNull LinearLayout workoutLinearBicep,
      @NonNull LinearLayout workoutLinearChest, @NonNull LinearLayout workoutLinearLeg,
      @NonNull LinearLayout workoutLinearShoulder, @NonNull TextView workoutTxtBicep,
      @NonNull TextView workoutTxtBicepBody, @NonNull TextView workoutTxtBody,
      @NonNull TextView workoutTxtChest, @NonNull TextView workoutTxtChestBody,
      @NonNull TextView workoutTxtExercise, @NonNull TextView workoutTxtIntro,
      @NonNull TextView workoutTxtLeg, @NonNull TextView workoutTxtLegBody,
      @NonNull TextView workoutTxtShoulder, @NonNull TextView workoutTxtShoulderBody,
      @NonNull TextView workoutTxtSubtitle, @NonNull TextView workoutTxtTitle) {
    this.rootView = rootView;
    this.workoutBgProgress = workoutBgProgress;
    this.workoutImgBicep = workoutImgBicep;
    this.workoutImgChest = workoutImgChest;
    this.workoutImgLeg = workoutImgLeg;
    this.workoutImgShoulder = workoutImgShoulder;
    this.workoutLinearBicep = workoutLinearBicep;
    this.workoutLinearChest = workoutLinearChest;
    this.workoutLinearLeg = workoutLinearLeg;
    this.workoutLinearShoulder = workoutLinearShoulder;
    this.workoutTxtBicep = workoutTxtBicep;
    this.workoutTxtBicepBody = workoutTxtBicepBody;
    this.workoutTxtBody = workoutTxtBody;
    this.workoutTxtChest = workoutTxtChest;
    this.workoutTxtChestBody = workoutTxtChestBody;
    this.workoutTxtExercise = workoutTxtExercise;
    this.workoutTxtIntro = workoutTxtIntro;
    this.workoutTxtLeg = workoutTxtLeg;
    this.workoutTxtLegBody = workoutTxtLegBody;
    this.workoutTxtShoulder = workoutTxtShoulder;
    this.workoutTxtShoulderBody = workoutTxtShoulderBody;
    this.workoutTxtSubtitle = workoutTxtSubtitle;
    this.workoutTxtTitle = workoutTxtTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWorkoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWorkoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_workout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWorkoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.workout_bg_progress;
      View workoutBgProgress = ViewBindings.findChildViewById(rootView, id);
      if (workoutBgProgress == null) {
        break missingId;
      }

      id = R.id.workout_img_bicep;
      ImageView workoutImgBicep = ViewBindings.findChildViewById(rootView, id);
      if (workoutImgBicep == null) {
        break missingId;
      }

      id = R.id.workout_img_chest;
      ImageView workoutImgChest = ViewBindings.findChildViewById(rootView, id);
      if (workoutImgChest == null) {
        break missingId;
      }

      id = R.id.workout_img_leg;
      ImageView workoutImgLeg = ViewBindings.findChildViewById(rootView, id);
      if (workoutImgLeg == null) {
        break missingId;
      }

      id = R.id.workout_img_shoulder;
      ImageView workoutImgShoulder = ViewBindings.findChildViewById(rootView, id);
      if (workoutImgShoulder == null) {
        break missingId;
      }

      id = R.id.workout_linear_bicep;
      LinearLayout workoutLinearBicep = ViewBindings.findChildViewById(rootView, id);
      if (workoutLinearBicep == null) {
        break missingId;
      }

      id = R.id.workout_linear_chest;
      LinearLayout workoutLinearChest = ViewBindings.findChildViewById(rootView, id);
      if (workoutLinearChest == null) {
        break missingId;
      }

      id = R.id.workout_linear_leg;
      LinearLayout workoutLinearLeg = ViewBindings.findChildViewById(rootView, id);
      if (workoutLinearLeg == null) {
        break missingId;
      }

      id = R.id.workout_linear_shoulder;
      LinearLayout workoutLinearShoulder = ViewBindings.findChildViewById(rootView, id);
      if (workoutLinearShoulder == null) {
        break missingId;
      }

      id = R.id.workout_txt_bicep;
      TextView workoutTxtBicep = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtBicep == null) {
        break missingId;
      }

      id = R.id.workout_txt_bicep_body;
      TextView workoutTxtBicepBody = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtBicepBody == null) {
        break missingId;
      }

      id = R.id.workout_txt_body;
      TextView workoutTxtBody = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtBody == null) {
        break missingId;
      }

      id = R.id.workout_txt_chest;
      TextView workoutTxtChest = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtChest == null) {
        break missingId;
      }

      id = R.id.workout_txt_chest_body;
      TextView workoutTxtChestBody = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtChestBody == null) {
        break missingId;
      }

      id = R.id.workout_txt_exercise;
      TextView workoutTxtExercise = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtExercise == null) {
        break missingId;
      }

      id = R.id.workout_txt_intro;
      TextView workoutTxtIntro = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtIntro == null) {
        break missingId;
      }

      id = R.id.workout_txt_leg;
      TextView workoutTxtLeg = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtLeg == null) {
        break missingId;
      }

      id = R.id.workout_txt_leg_body;
      TextView workoutTxtLegBody = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtLegBody == null) {
        break missingId;
      }

      id = R.id.workout_txt_shoulder;
      TextView workoutTxtShoulder = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtShoulder == null) {
        break missingId;
      }

      id = R.id.workout_txt_shoulder_body;
      TextView workoutTxtShoulderBody = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtShoulderBody == null) {
        break missingId;
      }

      id = R.id.workout_txt_subtitle;
      TextView workoutTxtSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtSubtitle == null) {
        break missingId;
      }

      id = R.id.workout_txt_title;
      TextView workoutTxtTitle = ViewBindings.findChildViewById(rootView, id);
      if (workoutTxtTitle == null) {
        break missingId;
      }

      return new ActivityWorkoutBinding((ConstraintLayout) rootView, workoutBgProgress,
          workoutImgBicep, workoutImgChest, workoutImgLeg, workoutImgShoulder, workoutLinearBicep,
          workoutLinearChest, workoutLinearLeg, workoutLinearShoulder, workoutTxtBicep,
          workoutTxtBicepBody, workoutTxtBody, workoutTxtChest, workoutTxtChestBody,
          workoutTxtExercise, workoutTxtIntro, workoutTxtLeg, workoutTxtLegBody, workoutTxtShoulder,
          workoutTxtShoulderBody, workoutTxtSubtitle, workoutTxtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
