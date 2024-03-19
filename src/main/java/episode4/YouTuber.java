package episode4;

public class YouTuber {
	//AccessMOdifier, Return type, Method () or function//
	

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
