
package com.ieglobe.electionapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Gallery_Response {

    @SerializedName("gallery")
    @Expose
    private String gallery;

    /**
     * 
     * @return
     *     The gallery
     */
    public String getGallery() {
        return gallery;
    }

    /**
     * 
     * @param gallery
     *     The gallery
     */
    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

}
