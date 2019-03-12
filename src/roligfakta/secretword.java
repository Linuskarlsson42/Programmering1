package roligfakta;

public class secretword {
	
	private String originalWord;
	
	private String invertedWord;
	
	

	public void secretWord(String word) {
		
		this.originalWord = word;
		this.invertedWord = word;
		
		
	}
	
	public void guess(char c) {
		invertedWord.replace(c, '-');
		
		
	}
	
	public boolean isComplete() {
		return !invertedWord.contains("-");
	}
	
	public String show() {
		String out = "";
		for (int i = 0; i < originalWord.length(); i++) {
			char org = originalWord.charAt(i);
			char inv = invertedWord.charAt(i);
			if(org == inv ) {
			out += "_";
			}
			
			else {
				out += org;
			}
		}
		return out;
		
	}
}
