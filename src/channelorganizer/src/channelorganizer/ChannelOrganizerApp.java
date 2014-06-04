/**
 * 
 */
package channelorganizer;

/**
 * @author Matias
 *
 */
public class ChannelOrganizerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		YouTubeManager youTubeManager = new YouTubeManager();
		String channelName = "Google Developers";
		String channelId = youTubeManager.getChannelId(channelName);
		
		String test = "";

	}

}
