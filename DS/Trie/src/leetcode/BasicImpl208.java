package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BasicImpl208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Trie trie = new Trie();
		 
		 //boolean result = trie.search("abcd");
		 
		 //trie.insert("abcd");
		 
		 
		 LinkedList<Integer> ll = new LinkedList<>();
		 
		 ll.add(1);
		 
		 ll.add(2);
		 
		
		 
		// System.out.println(result);
	}

}



class TrieNode {
    // Initialize your data structure here.
    
    Map<Character, TrieNode> children;
    
    boolean endOfWord ;
    
    public TrieNode() {
        
        this.children = new HashMap<>();
        this.endOfWord = false;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        
        TrieNode current = root;
        
        for(Character ch: word.toCharArray())
        {
            TrieNode tempNode = current.children.get(ch);
            
            if(tempNode == null)
            {
                tempNode = new TrieNode();
                current.children.put(ch,tempNode );
            }
            
            current = tempNode;
        }
        
        current.endOfWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        
        TrieNode current = root;
        
        for(Character ch : word.toCharArray())
        {
            if(current == null)
                return false;
            current = current.children.get(ch);
        }
        
        return current.endOfWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        
        for(Character ch : prefix.toCharArray())
        {
            if(current == null)
                return false;
            current = current.children.get(ch);
        }
        
        return true;
    }
}




