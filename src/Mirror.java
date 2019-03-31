import java.util.ArrayList;
import java.util.List;

public class Mirror {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val= val;
        }
    }
   public static List<TreeNode> list = new ArrayList<>();
    public static List<TreeNode> getMirror(TreeNode root){


        if(root==null) return list ;
        list.add(root);
        //System.out.println(root.val);//为什么要在这里打印根节点的值？
        //if(root.left==null&&root.right==null) return list;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //list.add(root.left);
        //list.add(root.right);
        getMirror(root.left);
        getMirror(root.right);
        return list;
    }
//    public static List<TreeNode> print(TreeNode root){
//        List<TreeNode> list = new ArrayList<>();
//        if(root==```                ``` null) return  list;
//    }
    public static void main(String[] args) {
        TreeNode node1  = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left=node2;
        node1.right =node3;
        node2.left=node4;
        node2.right=node5;
        List<TreeNode> list = getMirror(node1);
        for(TreeNode node :list){
            System.out.println(node.val);
        }

    }
}
