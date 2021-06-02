import com.sun.source.tree.BinaryTree;

public class BinaryTreeMaxDeptTest {

    private int maxDept(BinaryTreePo btree){
        if(btree == null){
            return 0;
        }

        if (btree.right == null || btree.left == null){
            return 1;
        }

        int maxl = Math.max(maxDept(btree.left),maxDept(btree.right)) + 1;

        return maxl;
    }

    public static void main(String[] args) {
        BinaryTreePo btree = new BinaryTreePo();

        BinaryTreePo left = new BinaryTreePo();

        BinaryTreePo right = new BinaryTreePo();


        btree.left = left;
        btree.right = right;
        btree.setVal(1);

        left.setVal(2);
        right.setVal(3);

        int deptl = new BinaryTreeMaxDeptTest().maxDept(btree);
        System.out.println(">>>>>>>>>>>>" + deptl);

    }

}
