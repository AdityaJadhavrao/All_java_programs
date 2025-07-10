package intervoew_programs_practise_Interface;

interface Sports {
	
	void startgame();
	void endgame();

}

class cricket implements Sports
{
	public void startgame()
	{
		System.out.println("Toss is done");
	}
	public void endgame()
	{
		System.out.println("India won the championship");
	}
}

class football implements Sports
{
	public void startgame()
	{
		System.out.println("Football game started, kick off");
	}
	public void endgame()
	{
		System.out.println("Game ended, whistle blowed");
	}
}