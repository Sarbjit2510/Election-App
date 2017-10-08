
package com.ieglobe.electionapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Gallery_Model {

    @SerializedName("response")
    @Expose
    private List<Gallery_Response> response = new ArrayList<Gallery_Response>();
    @SerializedName("status")
    @Expose
    private Integer status;

    /**
     * 
     * @return
     *     The response
     */
    public List<Gallery_Response> getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    public void setResponse(List<Gallery_Response> response) {
        this.response = response;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
