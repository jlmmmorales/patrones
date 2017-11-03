package org.curso.accenture.factory;

public class MediaFactory implements Factory {
  public MultimediaFile createMedia(String type) {
    MultimediaFile file = null;
    if(type.equals("mp3")) {
      file = new MP3();
    }    
    if(type.equals("wav")) {
      file = new WAV();
    }
    return file;
  }

}
