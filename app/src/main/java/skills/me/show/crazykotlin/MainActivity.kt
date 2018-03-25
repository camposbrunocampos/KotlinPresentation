package skills.me.show.crazykotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import skills.me.show.crazykotlin.models.AlphaBakeryKotlin

/**
 * Created by Reizinho on 29/03/17.
 */
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }

    /**
     * 1) Imutability vs.Mutability
     *
     * 2) Immediate assignment
     *
     * 3) Inferred assignment
     *
     * 4) Type Required when no initializer is provided
     */

    fun playground() {


    }











    /**
     * 2) Automatic Casts
     */





    fun automaticCast(obj: Any) {
        if (obj is String) {
            System.out.print(obj.length)
        }
    }

    fun getStringLength(obj: Any): Int? {
        if (obj !is String) return null

        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }
















    /**
     * 3) Switch -> When
     */


    fun usingWhen(number: String) {

        when(number) {
            1 -> System.out.print("um")
            2 -> System.out.print("dois")
            3 -> System.out.print("tres")
        }
    }















    /**
     * 3) Models use
     */
    fun usingModels() {
        val alphaBakery = AlphaBakeryKotlin(false, false, "panificadora")
        alphaBakery.hotBread = true
    }
}