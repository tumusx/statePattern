import org.junit.jupiter.api.Test
import state.*
import kotlin.test.assertEquals

class StatePatternTest {
    val stateOBJ = ObsDocument()

    @Test
    fun stateIsRead(){
        assertEquals(stateOBJ.isRead(), main())
    }

    @Test
    fun stateEdit(){
        assertEquals(stateOBJ.setStateOBJ(DocumentEdit()), main())
    }
}