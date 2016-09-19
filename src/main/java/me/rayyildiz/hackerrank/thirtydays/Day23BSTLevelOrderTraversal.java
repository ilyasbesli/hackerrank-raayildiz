package me.rayyildiz.hackerrank.thirtydays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by rayyildiz on 9/19/16.
 */
public class Day23BSTLevelOrderTraversal {

    static void levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()){
            TreeNode cur = q.remove();
            System.out.print(cur.data+" ");
            if ( cur.left != null) q.add(cur.left);
            if ( cur.right!= null) q.add(cur.right);
        }
    }

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

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
