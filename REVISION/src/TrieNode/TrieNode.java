package TrieNode;

public class TrieNode{
    TrieNode[] children ;
    boolean isEndOfWord ;

    public TrieNode(){
        this.children = new TrieNode[26];
        this.isEndOfWord = false;
    }

    public static void insert(TrieNode root, String key){
        TrieNode currNode = root;
        for(int i=0;i<key.length();i++){
            char curr = key.charAt(i);
            if(currNode.children[curr-'a']==null){
                TrieNode newNode = new TrieNode();
                currNode.children[curr-'a'] = newNode;
            }
            currNode = currNode.children[curr-'a'];
        }
        currNode.isEndOfWord = true;
    }

    public static boolean search(TrieNode root, String key){
        TrieNode currNode = root;
        for(int i=0;i<key.length();i++){
            char curr = key.charAt(i);
            if(currNode.children[curr-'a']==null) return false;
            currNode = currNode.children[curr-'a']; //proceed
        }
        return currNode.isEndOfWord;
    }
// we can either run this code in other class by making Main class as public
// and TrieNode class as just class
    public static void main (String[] args) {
        TrieNode root = new TrieNode();
        TrieNode.insert(root,"apple");
        TrieNode.insert(root,"app");
        TrieNode.insert(root,"by");
        TrieNode.insert(root,"bye");
        TrieNode.insert(root,"ball");
        TrieNode.insert(root,"bat");
        System.out.println("Do bat exist? "+ TrieNode.search(root,"bat"));
        System.out.println("Do app exist? "+ TrieNode.search(root,"app"));
        System.out.println("Do by exist? "+ TrieNode.search(root,"by"));
        System.out.println("Do ask exist? "+ TrieNode.search(root,"ask"));
    }
}
