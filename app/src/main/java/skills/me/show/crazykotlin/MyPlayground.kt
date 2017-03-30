package skills.me.show.crazykotlin

/**
 * Created by Reizinho on 29/03/17.
 */
class MyPlayground {

    /**
     * 1) Imutability vs.Mutability
     *
     * 2) Immediate assignment
     *
     * 3) Inferred assignment
     *
     * 4) Type Required when no initializer is provided
     */

    fun immutabilityVsMutability() {
        val banana = 0
        banana = 0 + 1

        var bananaMutable = 0
        bananaMutable = bananaMutable + 1
    }

    fun assignments() {
        val someBananas: Int = 0 //imediate
        val bananas = 0 //inferred
        val bananasInit: Int
    }


}
