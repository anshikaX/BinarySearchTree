import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree obj = new BinarySearchTree();
        int ch;

        do
        {
            System.out.println("\n1.Create \n2.Search \n3.Insert \n4.Delete \n5.DeleteFull \n6.Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    obj.create();
                    break;

                case 2:
                    System.out.println("Enter the value to search");
                    int value = sc.nextInt();
                    Nnode temp=obj.search(BinarySearchTree.root,value);
                    if(temp==null)
                    {
                        System.out.println("Value doesn't exist");
                    }
                    else
                    {
                        System.out.println("Value exists");
                        System.out.println("Value is: " +temp.data);
                    }
                    break;

                case 3:
                    System.out.println("Enter the value to insert");
                    int value1 = sc.nextInt();
                    obj.insert(BinarySearchTree.root,value1);
                    break;

                case 4:
                    System.out.println("Enter the value to delete");
                    int key = sc.nextInt();
                    obj.delete(BinarySearchTree.root,key);
                    break;

                case 5:
                    obj.delete_BST();
                    break;

                case 6:
                    System.out.println("Exit");
                    break;
            }

        }while(ch !=6);


    }
}
