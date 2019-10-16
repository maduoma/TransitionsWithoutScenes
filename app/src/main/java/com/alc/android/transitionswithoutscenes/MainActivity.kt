package com.alc.android.transitionswithoutscenes

import android.os.Build
import android.os.Bundle

import android.transition.Fade
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

	private var visibility = false

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

	}

	@RequiresApi(Build.VERSION_CODES.KITKAT)
	fun fadeAnimation(view: View) {

		val transition = Fade()

		TransitionManager.beginDelayedTransition(sceneRoot, transition)

		txvDescription.visibility = if (visibility) View.INVISIBLE else View.VISIBLE
		visibility = !visibility
	}

	@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
	fun slideEffect(view: View) {

		val transition = Slide(Gravity.END)
		TransitionManager.beginDelayedTransition(sceneRoot, transition)

		txvDescription.visibility = if (visibility) View.INVISIBLE else View.VISIBLE
		visibility = !visibility
	}
}
