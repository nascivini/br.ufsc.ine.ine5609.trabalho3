
public class Tree {

    private Tree root;
    private int data;
    private Tree left;
    private Tree right;

    public Tree(int data, Tree root) {
        this.root = root;
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Tree getRoot() {
        return root;
    }

    public void setRoot(Tree root) {
        this.root = root;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public void insere(int data) {
    	if(!(this.data == 0)){
    		if(data < this.root.getData()){
    			this.setLeft(new Tree(data, this));
    		}
    		else{
    			this.setRight(new Tree(data, this));
    		}
    		//TO DO
    	} 
    	else {
    		this.data = data;
    	}
    }
}
