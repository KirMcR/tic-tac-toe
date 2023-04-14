package com.my_projects.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.my_projects.tic_tac_toe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var moveNumber = 0
    private var binding: ActivityMainBinding? = null//создаем объет binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.scoreNumber?.text = " " + moveNumber.toString()
        setContentView(binding?.root)
        binding?.btn11?.setOnClickListener(this)
        binding?.btn12?.setOnClickListener(this)
        binding?.btn13?.setOnClickListener(this)
        binding?.btn21?.setOnClickListener(this)
        binding?.btn22?.setOnClickListener(this)
        binding?.btn23?.setOnClickListener(this)
        binding?.btn31?.setOnClickListener(this)
        binding?.btn32?.setOnClickListener(this)
        binding?.btn33?.setOnClickListener(this)
        binding?.back?.setOnClickListener(this)
//        binding?.startBtn?.setOnClickListener(View.OnClickListener {
//          supportFragmentManager.beginTransaction().replace(R.id.frame, PlayingScreen()).commit()
//            binding?.startBtn?.visibility=View.GONE
//        })
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_11 -> {
                if (moveNumber % 2 == 0) binding?.btn11?.setImageResource(R.drawable.cross)
                else binding?.btn11?.setImageResource(R.drawable.zero)
                binding?.btn11?.isEnabled = false
                moveNumber++
            }
            R.id.btn_12 -> {
                if (moveNumber % 2 == 0) binding?.btn12?.setImageResource(R.drawable.cross)
                else binding?.btn12?.setImageResource(R.drawable.zero)
                binding?.btn12?.isEnabled = false
                moveNumber++
            }
            R.id.btn_13 -> {
                if (moveNumber % 2 == 0) binding?.btn13?.setImageResource(R.drawable.cross)
                else binding?.btn13?.setImageResource(R.drawable.zero)
                binding?.btn13?.isEnabled = false
                moveNumber++
            }
            R.id.btn_21 -> {
                if (moveNumber % 2 == 0) binding?.btn21?.setImageResource(R.drawable.cross)
                else binding?.btn21?.setImageResource(R.drawable.zero)
                binding?.btn21?.isEnabled = false
                moveNumber++
            }
            R.id.btn_22 -> {
                if (moveNumber % 2 == 0) binding?.btn22?.setImageResource(R.drawable.cross)
                else binding?.btn22?.setImageResource(R.drawable.zero)
                binding?.btn22?.isEnabled = false
                moveNumber++
            }
            R.id.btn_23 -> {
                if (moveNumber % 2 == 0) binding?.btn23?.setImageResource(R.drawable.cross)
                else binding?.btn23?.setImageResource(R.drawable.zero)
                binding?.btn23?.isEnabled = false
                moveNumber++
            }
            R.id.btn_31 -> {
                if (moveNumber % 2 == 0) binding?.btn31?.setImageResource(R.drawable.cross)
                else binding?.btn31?.setImageResource(R.drawable.zero)
                binding?.btn31?.isEnabled = false
                moveNumber++
            }
            R.id.btn_32 -> {
                if (moveNumber % 2 == 0) binding?.btn32?.setImageResource(R.drawable.cross)
                else binding?.btn32?.setImageResource(R.drawable.zero)
                binding?.btn32?.isEnabled = false
                moveNumber++
            }
            R.id.btn_33 -> {
                if (moveNumber % 2 == 0) binding?.btn33?.setImageResource(R.drawable.cross)
                else binding?.btn33?.setImageResource(R.drawable.zero)
                binding?.btn33?.isEnabled = false
                moveNumber++
            }
            R.id.back -> {
                binding?.back?.visibility = View.GONE
            }

        }
        binding?.scoreNumber?.text = " " + moveNumber.toString()
    }
}