package com.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  private String currentlyPlaying = "";
  private boolean isPaused = false;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    String[] output = new String[videoLibrary.getVideos().size()];

    for(int i = 0; i < videoLibrary.getVideos().size(); i++){
      output[i] = videoLibrary.getVideos().get(i).getTitle() + " (" + videoLibrary.getVideos().get(i).getVideoId() + ") " + videoLibrary.getVideos().get(i).getTags().toString().replaceAll(",","");
    }

    Arrays.sort(output);
    System.out.println("Here's a list of all available videos:");
    for(int i = 0; i < videoLibrary.getVideos().size(); i++){
      System.out.println(output[i]);
    }
  }

  public void playVideo(String videoId) {

      if (videoLibrary.getVideo(videoId) != null){
        String title = videoLibrary.getVideo(videoId).getTitle();
        if(currentlyPlaying.equals("") == true){

          currentlyPlaying = title;
          System.out.println("Playing video: " + title);
          isPaused = false;

        }

        else{

          System.out.println("Stopping video: " + currentlyPlaying);
          currentlyPlaying = title;
          System.out.println("Playing video: " + title);
          isPaused = false;

        }
      }
    else {

      System.out.println("Cannot play video: Video does not exist");

    }

  }

  public void stopVideo() {

    if(currentlyPlaying.equals("") != true){

      System.out.println("Stopping video: " + currentlyPlaying);
      currentlyPlaying = "";

    }
    else {

      System.out.println("Cannot stop video: No video is currently playing");

    }

  }

  public void playRandomVideo() {

    if(videoLibrary.getVideos().size() > 0){

      playVideo(videoLibrary.getVideos().get((int) Math.random() * videoLibrary.getVideos().size()).getVideoId());

    }
    else{

      System.out.println("Cannot play video: No videos available");

    }
  }

  public void pauseVideo() {

    if(currentlyPlaying.equals("") == true){

      System.out.println("Cannot pause video: No video is currently playing");

    }
    else{

      if(isPaused == false){

        System.out.println("Pausing video: " + currentlyPlaying);
        isPaused = true;

      }
      else{

        System.out.println("Video already paused: " + currentlyPlaying);

      }

    }

  }

  public void continueVideo() {

    if(currentlyPlaying.equals("") == true){

      System.out.println("Cannot continue video: No video is currently playing");

    }
    else{

      if(isPaused == true){

        System.out.println("Continuing video: " + currentlyPlaying);
        isPaused = false;

      }
      else{

        System.out.println("Cannot continue video: Video is not paused");

      }

    }


  }

  public String currentlyPlayingID(){
    if (currentlyPlaying.equals("") != true) {

      for (int i = 0; i < videoLibrary.getVideos().size(); i++) {

        if (videoLibrary.getVideos().get(i).getTitle().equals(currentlyPlaying)) {

          return videoLibrary.getVideos().get(i).getVideoId();

        }

      }

    }
    return null;
  }

  public void showPlaying() {

    if(currentlyPlaying.equals("") == true){

      System.out.println("No video is currently playing");

    }
    else{


      String output = "Currently playing: " + currentlyPlaying + " (" + currentlyPlayingID() + ") " + videoLibrary.getVideo(currentlyPlayingID()).getTags().toString().replaceAll(",","");
      if(isPaused == true){

        output += " - PAUSED";

      }
      System.out.println(output);
    }

  }

//End of Part 1


  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}