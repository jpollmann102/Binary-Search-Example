
public class TestMusic2 {

	public static void printMusic(Music[] music){
		for(int i = 0; i < music.length; i++){
			System.out.println(music[i].toString());
		}
	}
	
	// sort --> 1 = year, 2 = title, 3 = singer
	public static void insertionSort(Music[] music, int sort){
		if(sort == 1){	
			for(int i = 0; i < music.length; i++){
				Music next = music[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMyYear() > music[e - 1].getMyYear()){
						insertIndex = e;
					}else{
						music[e] = music[e - 1];
					}
					e--;
				}
				music[insertIndex] = next;
			}
		}else if(sort == 2){
			for(int i = 0; i < music.length; i++){
				Music next = music[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMyTitle().compareTo(music[e - 1].getMyTitle()) > 0){
						insertIndex = e;
					}else{
						music[e] = music[e - 1];
					}
					e--;
				}
				music[insertIndex] = next;
			}
		}else if(sort == 3){
			for(int i = 0; i < music.length; i++){
				Music next = music[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMySinger().compareTo(music[e - 1].getMySinger()) > 0){
						insertIndex = e;
					}else{
						music[e] = music[e - 1];
					}
					e--;
				}
				music[insertIndex] = next;
			}
		}
	}
	
	public static void searchYear(Music[] music, int year){
		System.out.println("Search - Year - " + year);
		int high = music.length;
		int low = -1;
		int probe;
		while(high - low > 1){
			probe = (high + low) / 2;
			if(music[probe].getMyYear() > year){
				high = probe;
			}else{
				low = probe;
			}
		}
		if((low >= 0) && (music[low].getMyYear() == year)){
			System.out.println("Found: " + music[low].toString());
		}else{
			System.out.println("Not Found");
		}
	}
	
	public static void searchTitle(Music[] music, String title){
		System.out.println("Search - Title - " + title);
		int high = music.length;
		int low = -1;
		int probe;
		while(high - low > 1){
			probe = (high + low) / 2;
			if(music[probe].getMyTitle().compareTo(title) > 0){
				high = probe;
			}else{
				low = probe;
			}
		}
		if((low >= 0) && (music[low].getMyTitle().compareTo(title) == 0)){
			System.out.println("Found: " + music[low].toString());
		}else{
			System.out.println("Not Found");
		}
	}
	
	public static void searchSinger(Music[] music, String singer){
		System.out.println("Search - Singer - " + singer);
		int high = music.length;
		int low = -1;
		int probe;
		while(high - low > 1){
			probe = (high + low) / 2;
			if(music[probe].getMySinger().compareTo(singer) > 0){
				high = probe;
			}else{
				low = probe;
			}
		}
		if((low >= 0) && (music[low].getMySinger().compareTo(singer) == 0)){
			System.out.println("Found: " + music[low].toString());
		}else{
			System.out.println("Not Found");
		}
	}
	
	public static void main(String[] args){
		
		Music[] myMusic = new Music[10];
		
		myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
		myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
		myMusic[2] = new Music("What If It's You", 1995, "Reba McEntire");
		myMusic[3] = new Music("Misunderstood", 2001, "Pink");
		myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
		myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
		myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
		myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
		myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
		myMusic[9] = new Music("White Flag", 2004, "Dido");

		printMusic(myMusic);
		System.out.println();
		insertionSort(myMusic, 1);
		searchYear(myMusic, 2005);
		System.out.println();
		searchYear(myMusic, 2006);
		System.out.println();
		insertionSort(myMusic, 2);
		searchTitle(myMusic, "Misunderstood");
		System.out.println();
		searchTitle(myMusic, "Under Paid");
		System.out.println();
		insertionSort(myMusic, 3);
		searchSinger(myMusic, "Darth Maul");
		System.out.println();
		searchSinger(myMusic, "Dido");
	}
}
