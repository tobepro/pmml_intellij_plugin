package editor.table

import com.intellij.openapi.diagnostic.Logger
import com.intellij.ui.treeStructure.treetable.TreeTableModel

import enums.DataFieldTypeEnum
import model.DataField
import javax.swing.JTree
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.DefaultTreeModel

class DataFieldTreeTableModel(private val fieldList: List<DataField>) : DefaultTreeModel(null), TreeTableModel {
    private val logger = Logger.getInstance(DataFieldTreeTableModel::class.java)
    
    private lateinit var myTree : JTree
    
    init {
        val root = DefaultMutableTreeNode()
        fieldList.forEach { root.add(DefaultMutableTreeNode(it, false)) }
        setRoot(root)
    }

    override fun setTree(tree: JTree?) {
        myTree = tree!!
        tree.isRootVisible = false
    }
    
    override fun getColumnClass(column: Int): Class<*> {
        return when(column) {
            DataFieldTreeTable.NAME_COLUMN -> String::class.java
            DataFieldTreeTable.DATA_TYPE_COLUMN -> DataFieldTypeEnum::class.java
            else -> String::class.java
        }
    }

    override fun getColumnName(column: Int): String {
        return when(column) {
            DataFieldTreeTable.NAME_COLUMN -> "字段名"
            DataFieldTreeTable.DATA_TYPE_COLUMN -> "类型"
            else -> "其它"
        }
    }

    override fun isCellEditable(node: Any?, column: Int): Boolean {
        return true
    }

    override fun setValueAt(value: Any?, node: Any?, column: Int) {
        val field = (node as DefaultMutableTreeNode).userObject as DataField
        when(column) {
            DataFieldTreeTable.NAME_COLUMN -> field.name = value as String
            DataFieldTreeTable.DATA_TYPE_COLUMN -> field.type = value as DataFieldTypeEnum
            else -> logger.error("setValue column={} error", column.toString())
        }
    }

    override fun getColumnCount(): Int {
        return 2
    }

    override fun getValueAt(node: Any?, column: Int): Any {
        if (column == 0) {
            return node!!
        }

        val obj = (node as DefaultMutableTreeNode).userObject as DataField
        return when(column) {
            DataFieldTreeTable.NAME_COLUMN -> obj.name
            DataFieldTreeTable.DATA_TYPE_COLUMN-> obj.type
            else -> {
                obj.name
                logger.error("getValue column={} error", column.toString())
            }
        }
    }
}