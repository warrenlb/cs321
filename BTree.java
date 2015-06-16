/**
 * BTree implementation
 * @author csilkwor
 *
 */
public class BTree {
	/**
	 * Defines a BTree node
	 * @author csilkwor
	 *
	 * @param <E>
	 */
	private class BTreeNode<E> {
		BTreeNode(){
			
		}
		
	}//End BTree class
	
	private int[] keys;
	private BTree[] objs;
	private int order;
	
	BTree(int n){
		keys = new int[n - 1];
		objs = new BTree[n];
		order = n;
		for (int i = 0; i < n; i++)
            objs[i] = null;
	}
	
	/**
	 * Determines whether the node is a leaf node
	 * @return true if the node is a leaf node, false otherwise
	 */
	private boolean isLeaf(){
		for (int i = 0; i < order; i++){
			if(objs[i] != null){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Determines whether the tree is full
	 * @return true if the BTree is full, false otherwise.
	 */
	private boolean isFull(){
		for (int i = 0; i < order; i++){
			if(objs[i] == null){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Inserts into the BTree
	 * @param key
	 */
	public void insert(){
		
	}

}
