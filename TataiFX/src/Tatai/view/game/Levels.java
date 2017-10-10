package Tatai.view.game;

public enum Levels {
	
	PractiseEasy("PractiseEasy"), PractiseHard("PractiseHard"), RealEasy("RealEasy"), RealHard("RealHard");
	
	private final String level;

	private Levels(String level) {
		this.level = level;
	}

	public String getNumber() {
		return level;
	}

}
