package com.abed.flexiimagegallery.data;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Abed on 19/06/2016.
 */

public class PhotosGridRow {

    public List<GalleryPhoto> photos;
    public int starting_number;

    public PhotosGridRow(int starting_number) {
        this.starting_number = starting_number;
        photos = new LinkedList<>();
    }

    public void add(GalleryPhoto photo) {
        photos.add(photo);
    }

    public GalleryPhoto get(int index) {
        return photos.get(index);
    }

    public int size() {
        return photos.size();
    }
}
