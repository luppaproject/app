package com.project.hackathon.camara.app.webservice;

import android.provider.SyncStateContract;

import com.project.hackathon.camara.app.model.InformationSuspected;
import com.project.hackathon.camara.app.model.Suspected;
import com.project.hackathon.camara.app.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by matheuscatossi on 6/4/17.
 */


public interface APIInterface {

    @GET(Constants.BIDDING_ALL)
    Call<List<Suspected>> getAllSuspected();

//    @POST(Constants.POST_MEMBROS_UPDATE)
//    Call<Suspected> postMembrosUpdate(@Path("id") String id, @Body Membro membro);

    @GET(Constants.BIDDING_BY_ID)
    Call<InformationSuspected> getBiddingById(@Path("id") String id);


}
