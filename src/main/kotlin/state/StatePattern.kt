package state


interface StateInterface {
    fun isReadDocument(stateDocument: ObsDocument)

}

class DocumentRead : StateInterface {
    override fun isReadDocument(stateDocument: ObsDocument) {
        println("reading document")
    }

}


class DocumentEdit : StateInterface {
    override fun isReadDocument(stateDocument: ObsDocument) {
        println("editing document")
    }

}

class DocumentSend : StateInterface {
    override fun isReadDocument(stateDocument: ObsDocument) {
        println("send Document")
    }
}

class ObsDocument {
    private var stateDocument: StateInterface? = null

    init {
        stateDocument = DocumentRead()
    }

    fun setStateOBJ(stateOBJ: StateInterface) {
        stateDocument = stateOBJ
    }

    fun isRead() = stateDocument?.isReadDocument(this)
}

 fun main() {
    val stateOBJ = ObsDocument()

    stateOBJ.isRead()
    stateOBJ.setStateOBJ(DocumentEdit())

}