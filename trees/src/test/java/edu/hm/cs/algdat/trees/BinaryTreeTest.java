package  edu.hm.cs.algdat.trees;

import org.junit.Assert;
import org.junit.Test;

import edu.hm.cs.algdat.trees.BinaryTree;
import edu.hm.cs.algdat.trees.DfsOrder;
import edu.hm.cs.algdat.trees.TreeNode;

public class BinaryTreeTest {

  private static final BinaryTree<Character> TREE = new BinaryTree<>(
        new TreeNode<>('S', 
            new TreeNode<>('O', 
                new TreeNode<>('G', 
                    new TreeNode<>('A', null, null), 
                    new TreeNode<>('L', null, null)), 
                null), 
            new TreeNode<>('U', 
                new TreeNode<>('T', 
                    new TreeNode<>('R', null, null), 
                    new TreeNode<>('I', null, null)), 
                new TreeNode<>('M', 
                    new TreeNode<>('H', null, null), 
                    null))));
  
    
  @Test
  public void testSize() {
    Assert.assertEquals(11, TREE.getSize());
  }

  @Test
  public void testHeight() {
    Assert.assertEquals(4, TREE.getHeight());
  }
  
  @Test
  public void testLeafCount() {
    Assert.assertEquals(5, TREE.getLeafCount());
  }
  
  @Test
  public void testContainsPositive() {
    Assert.assertTrue(TREE.contains('H'));
  }
  
  @Test
  public void testContainsNegative() {
    Assert.assertFalse(TREE.contains('Y'));
  }
  
  @Test
  public void testInOrder() {
    StringBuilder sb = new StringBuilder();
    TREE.visitNodesDfs(sb::append, DfsOrder.INORDER);
    Assert.assertEquals("AGLOSRTIUHM", sb.toString());
  }
  
  @Test
  public void testPreOrder() {
    StringBuilder sb = new StringBuilder();
    TREE.visitNodesDfs(sb::append, DfsOrder.PREORDER);
    Assert.assertEquals("SOGALUTRIMH", sb.toString());
  }
  
  @Test
  public void testPostOrder() {
    StringBuilder sb = new StringBuilder();
    TREE.visitNodesDfs(sb::append, DfsOrder.POSTORDER);
    Assert.assertEquals("ALGORITHMUS", sb.toString());
  }
  
  @Test
  public void testLevelOrder() {
    StringBuilder sb = new StringBuilder();
    TREE.visitNodesBfs(sb::append);
    Assert.assertEquals("SOUGTMALRIH", sb.toString());
  }

}
