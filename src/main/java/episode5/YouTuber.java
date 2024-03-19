package episode5;

public class YouTuber {
	//AccessMOdifier, Return type, Method () or function//
	//Method with Parameter and it can be used only within the method or function and it can not be used outside
	//Method overloading ex. println - we can pass any value to this string or int or boolean
	
	public static void main(String[] args) {
		YouTuber YT = new YouTuber();
		YT.deletevideo("testing");
		YT.deletevideo("testing1");
		YT.deletevideo("testing2");
		System.out.println(true);
		YT.deletevideo(11);
	}
	
	private void deletevideo(String videoID) {
		
		System.out.println("Video deleted - " + videoID);		
	}
	
	private void deletevideo(int totalvideo) {
		
		System.out.println("total video count - " + totalvideo);		
	}
	
	public void CreateVideo() {
		System.out.println("Video Created");
		
	}
	
	private boolean UploadVideo() {
		System.out.println("uploading");
		return true;
//return statement should be always at the end
		
	}
	
	public String ShareVideo() {
		System.out.println("sharing");
		return "facebook";
		
	}
}
