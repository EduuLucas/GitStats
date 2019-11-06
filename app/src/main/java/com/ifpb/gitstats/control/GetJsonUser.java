package com.ifpb.gitstats.control;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.ifpb.gitstats.model.User;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class GetJsonUser extends AsyncTask<Void, Void, User>{

    private String user;

    public GetJsonUser(String user) {

        this.user = user;

    }

    @Override
    protected User doInBackground(Void... voids) {

        StringBuilder resposta = new StringBuilder();

        if (this.user != null){

            try {

                URL url = new URL("https://api.github.com/users/" + user);

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setDoOutput(true);
                connection.setConnectTimeout(5000);

                connection.connect();

                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    resposta.append(scanner.next());
                }

            } catch (MalformedURLException e){
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return new Gson().fromJson(resposta.toString(), User.class);

    }

    protected void onPostExecute(User result) {

    }

}
