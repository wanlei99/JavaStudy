package com.binarytree;

import javax.swing.tree.TreeNode;
import java.util.Stack;

/**
 * @ClassName BinaryTree
 * @Description TODO
 * @Author WL
 * @Date 2020/11/10
 **/
    public class BinaryTree {
    private TreeNode  root = null;

    public BinaryTree(){
        root = new TreeNode(1, "A");
    }

    public class TreeNode{
        private int index;
        private String data;
        private TreeNode leftChild;
        private TreeNode rightChild;


        public int getIndex() {
            return index;
        }


        public void setIndex(int index) {
            this.index = index;
        }


        public String getData() {
            return data;
        }


        public void setData(String data) {
            this.data = data;
        }


        public TreeNode(int index,String data){
            this.index = index;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    /**
     * 构建二叉树
     *         A
     *     B       C
     * D      E        F
     */
    public void createBinaryTree(){
        TreeNode nodeB = new TreeNode(2, "B");
        TreeNode nodeC = new TreeNode(3, "C");
        TreeNode nodeD = new TreeNode(4, "D");
        TreeNode nodeE = new TreeNode(7, "E");
        TreeNode nodeF = new TreeNode(9, "F");
        TreeNode nodeG = new TreeNode(10, "G");
        TreeNode nodeH = new TreeNode(12, "H");
        root.leftChild = nodeB;
        root.rightChild = nodeC;
        nodeB.leftChild = nodeD;
        nodeD.rightChild = nodeF;
        nodeF.leftChild = nodeH;
        nodeC.rightChild = nodeE;
        nodeE.leftChild = nodeG;
    }

    /**
     * 求二叉树的高度
     * @author WL
     *
     */
    public int getHeight(){
        return getHeight(root);
    }

    private int getHeight(TreeNode node) {
        if(node == null){
            return 0;
        }else{
            int i = getHeight(node.leftChild);
            int j = getHeight(node.rightChild);
            return (i<j)?j+1:i+1;
        }
    }

    /**
     * 获取二叉树的结点数
     * @author WL
     *
     */
    public int getSize(){
        return getSize(root);
    }


    private int getSize(TreeNode node) {
        if(node == null){
            return 0;
        }else{
            return 1+getSize(node.leftChild)+getSize(node.rightChild);
        }
    }

    /**
     * 前序遍历——递归
     * @author WL
     *
     */
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }else{
            System.out.print(node.getData());
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    /**
     * 前序遍历——非递归
     */

    public void nonRecOrder(TreeNode node){
        if(node == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(node);
        while(!stack.isEmpty()){
            //出栈和进栈
            //弹出根结点
            TreeNode n = stack.pop();
            //压入子结点
            System.out.print(n.getData());
            if(n.rightChild!=null){
                stack.push(n.rightChild);

            }
            if(n.leftChild!=null){
                stack.push(n.leftChild);
            }
        }
    }
    /**
     * 中序遍历——递归
     * @author WL
     *
     */
    public void midOrder(TreeNode node){
        if(node == null){
            return;
        }else{
            midOrder(node.leftChild);
            System.out.print(node.getData());
            midOrder(node.rightChild);
        }
    }

    /**
     * 后序遍历——递归
     * @author WL
     *
     */
    public void postOrder(TreeNode node){
        if(node == null){
            return;
        }else{
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.print(node.getData());
        }
    }
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();

        int height = binaryTree.getHeight();
        System.out.println("树的高度treeHeight:"+height);

        int size = binaryTree.getSize();
        System.out.println("结点数treeSize:"+size);

        System.out.print("前序遍历 data:");
        binaryTree.preOrder(binaryTree.root);

        System.out.print("\n中序遍历 data:");
        binaryTree.midOrder(binaryTree.root);

        System.out.print("\n后序遍历 data:");
        binaryTree.postOrder(binaryTree.root);

        System.out.print("\n前序非递归遍历 data:");
        binaryTree.nonRecOrder(binaryTree.root);
    }
    }

