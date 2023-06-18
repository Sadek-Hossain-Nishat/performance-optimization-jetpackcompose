package com.example.performanceoptimizationcomposeuiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text


import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.performanceoptimizationcomposeuiapp.optimization1.MainViewModel
import com.example.performanceoptimizationcomposeuiapp.optimization1.RgbSelector
import com.example.performanceoptimizationcomposeuiapp.optimization3.CustomGrid
import com.example.performanceoptimizationcomposeuiapp.optimization3.FeedViewModel
import com.example.performanceoptimizationcomposeuiapp.ui.theme.PerformanceOptimizationComposeUiAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PerformanceOptimizationComposeUiAppTheme {
                
                /***

                val viewModel = viewModel<MainViewModel>()
                val chageColorLambda = remember<(Color)->Unit>{
                    {
                        viewModel.changeColor(it)
                    }
                }

                var color by remember{
                    mutableStateOf(Color.Red)
                }


                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center) {

                    RgbSelector(color = color // pass another parameter instead of view model color
                    //viewModel.color
                        , onColorClick ={

                        color = it

                    } //LET'S TRY ANOTHER THING
                    //chageColorLambda //another alternative passing lambda

                    //viewModel::changeColor //alternative representation of passing lambda function

                        /****
                         onColorClick={ it

                                viewModel.changeColor(it)
                        }
                         */
                    )



                }
                
                ***/
                
                
                val viewModel = viewModel<FeedViewModel>()
                
                val feeds = viewModel.feeds
                
                Column(modifier = Modifier.fillMaxSize()) {
                    
                    CustomGrid(feeds = feeds,
                    modifier = Modifier.fillMaxWidth())
                    
                    Button(onClick = viewModel::rearrangeFeeds) {
                        
                        Text(text = "Suffle feedssh")
                        
                    }
                    
                }



            }
        }
    }
}

