import java.util.*;
public class ArrayTree
{
    static class TreeNode
    {
        String arr[];
        int LastUsedIndex;

        public TreeNode(int size)
        {
            arr = new String[size+1];
            this.LastUsedIndex = 0;
            System.out.println("array created ");
        }
        boolean isFull()
        {
            if(arr.length - 1 == LastUsedIndex){
                return true;
            }
            else{
                return false;
            }
        }
        public void insert(String val)
        {
            if(!isFull()){
                arr[LastUsedIndex+1] = val;
                LastUsedIndex++;
                System.out.println("Inserted successfully");
            }
            else
            {
                System.out.println("array is full");
            }
        }
        public void preOrder(int index)//uses recursion
        {
            if(index > LastUsedIndex)//there is no values present after the LUI and the given index comes after the LUI
            {
                return;
            }
            System.out.println(arr[index]+" ");
            preOrder( index * 2);
            preOrder( index * 2 + 1);
        }
        public void inOrder(int index)//uses recursion
        {
            if(index > LastUsedIndex)//there is no values present after the LUI and the given index comes after the LUI
            {
                return;
            }
            inOrder( index * 2);
            System.out.println(arr[index]+" ");
            inOrder( index * 2 + 1);
        }
        public void postOrder(int index)//uses recursion
        {
            if(index > LastUsedIndex)//there is no values present after the LUI and the given index comes after the LUI
            {
                return;
            }
            postOrder( index * 2);
            postOrder( index * 2 + 1);
            System.out.println(arr[index]+" ");
        }
        public void levelOrder()
        {
            for(int i = 1;i <= LastUsedIndex;i++)
            {
                System.out.println(arr[i]+" ");
            }
        }
        public int search(String val)
        {
            for(int i = 1;i <= LastUsedIndex;i++)
            {
                if(arr[i].equals(val))
                {
                    System.out.println("found");
                    return i;
                }
            }
            System.out.println(" not present in the array");
                    return -1;
        }
        public void delete(String val)
        {
            int location = search(val);
            if(location == -1)
            {
                return;
            }
            else
            {
                arr[location] = arr[LastUsedIndex];
                LastUsedIndex--;
                System.out.println("successfully deleted");
            }
        }
        public void deleteBT()
        {
            try{
                arr = null;
                System.out.println(" deleted successfully");
            }
            catch(Exception e){
                System.out.println(" something happened");
            }
        }
        public static void main(String args[])
        {
            TreeNode tree = new TreeNode(6);
            tree.insert("A");
            tree.insert("B");
            tree.insert("C");
            tree.insert("D");
            tree.insert("E");
    
            System.out.println("PreOrder Traversal:");
            tree.preOrder(1);
    
            System.out.println("\nInOrder Traversal:");
            tree.inOrder(1);
    
            System.out.println("\nPostOrder Traversal:");
            tree.postOrder(1);
    
            System.out.println("\nLevelOrder Traversal:");
            tree.levelOrder();
    
            tree.delete("C");
            System.out.println("\nAfter deleting C, LevelOrder Traversal:");
            tree.levelOrder();
    
            tree.deleteBT();

        }
    }  
}
