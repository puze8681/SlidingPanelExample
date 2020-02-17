package kr.puze.slidepanel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sothree.slidinguppanel.SlidingUpPanelLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sliding_layout.addPanelSlideListener(object: SlidingUpPanelLayout.PanelSlideListener{
            override fun onPanelSlide(panel: View?, slideOffset: Float) {
            }

            override fun onPanelStateChanged(panel: View?, previousState: SlidingUpPanelLayout.PanelState?, newState: SlidingUpPanelLayout.PanelState?
            ) {
                when(newState){
                    SlidingUpPanelLayout.PanelState.EXPANDED->{
                        text1.text = "EXPANDED"
                    }
                    SlidingUpPanelLayout.PanelState.COLLAPSED->{
                        text1.text = "COLLAPSED"
                    }
                    SlidingUpPanelLayout.PanelState.ANCHORED->{
                        text1.text = "ANCHORED"
                    }
                    SlidingUpPanelLayout.PanelState.HIDDEN->{
                        text1.text = "HIDDEN"
                    }
                    SlidingUpPanelLayout.PanelState.DRAGGING->{
                        text1.text = "DRAGGING"
                    }
                    else->{

                    }
                }
            }

        })
    }
}
