package testexam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class VideoCollection {

	private ArrayList<VideoStorageMedia> videos;

	public VideoCollection() {
		videos = new ArrayList<>();
	}

	public void addVideo(VideoStorageMedia video) {
		videos.add(video);
	}

	public void loadVideoCollection(File file) throws VideoLoadException {
		try (FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			videos = (ArrayList<VideoStorageMedia>) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw new VideoLoadException();
		}
	}

	public Integer getIndexByMovieDescription(String description) {
		for (int i = 0; i < videos.size(); i++) {
			Movie movie = videos.get(i).getMovie();
			String movieDescription = movie.getDescription();
			if (movieDescription.equals(description)) {
				return i;
			}
		}
		return null;
	}

	public ArrayList<VideoStorageMedia> getVideos() {
		return videos;
	}

}
