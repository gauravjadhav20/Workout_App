package com.example.a7minutesworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jack",
            R.drawable.jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val wallSit= ExerciseModel(
            2,
            "Wall Sit",
            R.drawable.wall_sit,
            false,
            false
        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(
            3,
            "Push Up",
            R.drawable.pushup,
            false,
            false
        )
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(
            4,
            "Abdominal Crunch",
            R.drawable.abdominal_crunch,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(
            5,
            "Step-Up On Chair",
            R.drawable.step_up_on_chair,
            false,
            false
        )
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(
            6,
            "Squat",
            R.drawable.squat,
            false,
            false
        )
        exerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel(
            7,
            "Tricep Dip On Chair",
            R.drawable.tricep_dip_on_chair,
            false,
            false
        )
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(
            8,
            "Plank",
            R.drawable.plank,
            false,
            false
        )
        exerciseList.add(plank)

        val highKneeRunningInPlace = ExerciseModel(
            9,
            "High Knee Running In Place",
            R.drawable.high_knee_running_in_place,
            false,
            false
        )
        exerciseList.add(highKneeRunningInPlace)

        val lunges = ExerciseModel(
            10,
            "Lunges",
            R.drawable.lunges,
            false,
            false
        )
        exerciseList.add(lunges)

        val pushupAndRotation = ExerciseModel(
            11,
            "Push up And Rotation",
            R.drawable.pushup_and_rotation,
            false,
            false
        )
        exerciseList.add(pushupAndRotation)

        val sidePlank = ExerciseModel(
            12,
            "Side Plank",
            R.drawable.side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)


        return exerciseList

    }
}