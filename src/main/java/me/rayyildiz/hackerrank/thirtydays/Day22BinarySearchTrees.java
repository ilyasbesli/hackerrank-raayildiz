package me.rayyildiz.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * Created by rayyildiz on 9/19/16.
 */
public class Day22BinarySearchTrees {

    public static TreeNode insert(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static int getHeight(TreeNode root){
        int leftHeight = 0;
        int rightHeight = 0;

        if (root.left != null) {
            leftHeight = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            rightHeight = getHeight(root.right) + 1;
        }

        if ( leftHeight>rightHeight) return leftHeight;
        else return rightHeight;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
