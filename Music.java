/*
 * Josh Pollmann
 * 11/20/14
 * This class contains the constructor and methods for Music objects
 */
public class Music {

	private String myTitle;
	private int myYear;
	private String mySinger;
	
	public Music(String title, int year, String singer){
		myTitle = title;
		myYear = year;
		mySinger = singer;
	}
	
	public String toString(){
		return this.myTitle + ", " + this.myYear + ", " + this.mySinger;
	}

	public String getMyTitle() {
		return myTitle;
	}

	public int getMyYear() {
		return myYear;
	}

	public String getMySinger() {
		return mySinger;
	}
	
	
}
