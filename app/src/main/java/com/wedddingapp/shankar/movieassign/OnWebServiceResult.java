package com.wedddingapp.shankar.movieassign;



//Interface to fetch the response from the internet.
public interface OnWebServiceResult
{
    //abstract method.
    public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
