package Trie;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trie t = new trie();
		t.addWord("art");
		t.addWord("arc");
		t.addWord("and");
		t.addWord("ant");
		t.addWord("an");
		t.addWord("bug");
		t.addWord("bugs");
		t.addWord("sea");
		t.addWord("see");
		t.addWord("seen");
		
		System.out.println(t.searchWord("and"));
		System.out.println(t.searchWord("se"));
		System.out.println(t.searchWord("buy"));
	}

}
