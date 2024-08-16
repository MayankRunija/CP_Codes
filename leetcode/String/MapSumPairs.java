class MapSum {

    static class TreeNode{
        String key;
        int val;
        TreeNode next;
        
        public TreeNode(String key, int val){
            this.key = key;
            this.val = val;
        }
    }
    
    TreeNode root; 
    
    public MapSum() {
        root = new TreeNode("", -1);
    }
    
    public void insert(String key, int val) {
        TreeNode node = root;
        boolean flag = false;
        while(node != null && node.next != null){
           if(key.equals(node.key)){
              node.val = val;
              flag = true; 
          
           } 
           node = node.next;
        }
        
        if(!flag){
          if(!key.equals(node.key)){
              node.next = new TreeNode(key, val);  
          }else{
              node.val = val; 
          }  
          
        }
        
           
        
    }
    
    public int sum(String prefix) {
        TreeNode node = root;
        int sum = 0;
        while(node != null){
            if(node.key.startsWith(prefix)){
                sum += node.val;
            }
            node = node.next;
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
