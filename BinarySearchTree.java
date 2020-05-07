import java.util.Scanner;
public class BinarySearchTree
{
    static Nnode root=null;
    Scanner sc = new Scanner(System.in);

    //To create a root node
    public void create()
    {
        System.out.println("Enter the value");
        int value=sc.nextInt();
        Nnode newNode = new Nnode();
        newNode.data=value;
        root=newNode;
    }

    //To search for an element in Binary Search Tree
    public Nnode search(Nnode root,int value)
    {
        if(root==null)
        {
           return null;
        }
        else if(root.data==value)
        {
            return root;
        }
        else if(root.data>value)
        {
            return search(root.left,value);
        }
        else
        {
            return search(root.right,value);
        }

    }

    //Insert an element in Binary Search Tree
    public Nnode insert(Nnode root,int value)
    {
        if(root==null)
        {
            Nnode temp = new Nnode();
            temp.data=value;
            root=temp;
        }
        else if(root.data>=value)
        {
            root.left=insert(root.left,value);
        }
        else
        {
            root.right=insert(root.right,value);
        }
        return root;
    }

    //To find the successor
    //Successor is the least value on the right subtree
    public int Successor(Nnode root)
    {
        int successor=root.data;
        while(root.left!=null)
        {
            successor=root.left.data;
            root=root.left;
        }
        return successor;
    }

    //Deletion of an element in Binary Search Tree
    public Nnode delete(Nnode root,int value)
    {
        if(root==null)
        {
            return null;
        }
        else if(root.data>value)
        {
            root.left=delete(root.left,value);
        }
        else if(root.data<value)
        {
            root.right=delete(root.right,value);
        }
        else
        {
            //Delete a node if it has two children
            if(root.left!=null && root.right!=null)
            {
                root.data=Successor(root.right);
                root.right=delete(root.right,root.data);
            }
            //Delete a node if it has one left child
            else if(root.left!=null && root.right==null)
            {
                root=root.left;
            }
            //Delete a node if it has one right child
            else if(root.left==null && root.right!=null)
            {
                root=root.right;
            }
            //Delete a leaf node(No children exist)
            else
            {
                root=null;
            }
        }
        return root;
    }

    public void delete_BST()
    {
        root=null;
    }

}
