package HashMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import Generics.GenericHeap;

public class HEncoder {

	private HashMap<Character, String> encoder = new HashMap<>();
	private HashMap<String, Character> decoder = new HashMap<>();

	private static class Node {
		private char data;
		private int freq;
		Node left;
		Node right;

		private static final NodeComparator Ctor = new NodeComparator();

		private static class NodeComparator implements Comparator<Node> {
			@Override
			public int compare(Node n1, Node n2) {
				return n2.freq - n1.freq;
			}
		}

	}

	public HEncoder(String feeder) {

		// 1. Make frequency map
		HashMap<Character, Integer> fm = new HashMap<>();

		for (int i = 0; i < feeder.length(); i++) {
			Character ch = feeder.charAt(i);

			if (fm.containsKey(ch)) {
				fm.put(ch, fm.get(ch) + 1);
			} else {
				fm.put(ch, 1);
			}
		}

		// 2. Heap Creation
		GenericHeap<Node> heap = new GenericHeap<>(Node.Ctor);
		ArrayList<Character> keys = new ArrayList<>(fm.keySet());

		for (Character key : keys) {
			Node addNode = new Node();
			addNode.data = key;
			addNode.freq = fm.get(key);

			heap.add(addNode);
		}

		// 3. Take out two elements, merge and add

		while (heap.size() != 1) {
			Node one = heap.removeHP();
			Node two = heap.removeHP();

			Node merged = new Node();
			merged.freq = one.freq + two.freq;
			merged.left = one;
			merged.right = two;

			heap.add(merged);
		}

		// 4. fill encoder and decoder

		Node finalNode = heap.removeHP();
		fillEncoderDecoder(finalNode, "");
	}

	private void fillEncoderDecoder(Node node, String osf) {
		if (node.left == null && node.right == null) {
			encoder.put(node.data, osf);
			decoder.put(osf, node.data);
			return;
		}

		fillEncoderDecoder(node.left, osf + "0");
		fillEncoderDecoder(node.right, osf + "1");
	}

	public String compress(String ques) {
		String rv = "";

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			rv += encoder.get(ch);
		}
		return rv;
	}

	public String decompress(String encoded){
		String rv = "";
		
		String code = "";
		for(int i = 0; i < encoded.length(); i++){
			char ch = encoded.charAt(i);
			code += ch;
			if(decoder.containsKey(code)){
				rv += decoder.get(code);
				code = "";
			}
		}
		return rv;
	}

}
