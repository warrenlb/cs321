
public class BTree {
	
	private class BTreeNode<E> {
		BTreeNode(){
			
		}
		
	}
	
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
	
	private boolean isLeaf(){
		for (int i = 0; i < order; i++){
			if(objs[i] != null){
				return false;
			}
		}
		return true;
	}
	
	private boolean isFull(){
		for (int i = 0; i < order; i++){
			if(objs[i] == null){
				return false;
			}
		}
		return true;
	}
	
	public void insert(int key){
		
	}

}
