package com.kariot.blogapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String API_KEY = "b066a94f47384f3e818eb99b5c2ef032"; // Sign up to https://newsapi.org/ to get API KEY and paste it here
    String API_URL = "https://newsapi.org/v2/top-headlines?country=in&apiKey=" + API_KEY;

    RecyclerView newsRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsRecycler = findViewById(R.id.recyclerNews);


        final ProgressDialog loader = new ProgressDialog(this);
        loader.setMessage("Loading data...");
        loader.setCancelable(false);
        loader.show();

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, API_URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                loader.dismiss();
                handleResponse(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                loader.dismiss();
                Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
                Log.e("ERROR", error.toString());
            }
        });
        MySingleton.getInstance(getApplicationContext()).addToRequestQueue(request);

    }

    private void handleResponse(JSONObject response) {

        ArrayList<ModelNews> newsArray = new ArrayList<>();

        try {
            JSONArray articlesArray = response.getJSONArray("articles");
            for (int i = 0; i < articlesArray.length(); i++) {
                JSONObject newsObject = (JSONObject) articlesArray.get(i);
                String newsTitle = newsObject.getString("title");
                String newsDesc = newsObject.getString("description");
                String newsURL = newsObject.getString("url");
                String newsImageURL = newsObject.getString("urlToImage");

                ModelNews newsItem = new ModelNews(newsTitle, newsDesc, newsImageURL, newsURL);
                newsArray.add(newsItem);
            }

            newsRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false));
            newsRecycler.setAdapter(new AdapterNews(getApplicationContext(), newsArray));


        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Inside Exception block", Toast.LENGTH_SHORT).show();
        }
   
    
    /*
    try{
      //will do some task, if any error occured jumbps to catch block  
    }catch (Exception e){
        //In case of any error, this block will be excuted
    }*/

    }
}