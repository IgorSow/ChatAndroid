package wildbeards.com.bluechat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;




public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        final TextView textView = findViewById(R.id.inputLogin);
        OkHttpClient client = new OkHttpClient();

        String url = "http://51.38.133.76:90/users";

        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(JSON, "{\"nick\":\"android3\",\"password\":\"eueka\"}");

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.i("-------------------", "nie dziala " + e + call);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()) {
                    final String myResponse = response.body().string();
                    Log.i("TTTTTTTTTTTU",myResponse);


                    LoginPage.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(myResponse);
                        }
                    });
                }
            }
        });




//                BufferedReader reader = null;
//                URL url = null;
//                try {
//                    url = new URL("http://51.38.133.76:90/users/50");
//                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                    connection.setRequestMethod("GET");
//                    connection.setDoInput(true);
//                    connection.connect();
//
//
//                    InputStream stream = connection.getInputStream();
//
//                    reader = new BufferedReader(new InputStreamReader(stream));
//
//                    StringBuffer stringBuffer = new StringBuffer();
//
//                    String line = "";
//                    while ((line = reader.readLine()) != null) {
//                        stringBuffer.append(line + "");
//                    }
//                    Log.i("TESTOWANIE", line);
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                } catch (ProtocolException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }


//        Http
//          HttpClients httpclient = new HttpClientBuilder().build();
//
//        URI uri = new URIBuilder()
//                .setScheme("http")
//                .setHost("www.google.com")
//                .setPath("/search")
//                .setParameter("q", "httpclient")
//                .setParameter("btnG", "Google Search")
//                .setParameter("aq", "f")
//                .setParameter("oq", "")
//                .build();
//
//        HttpGetHC4 httpGetHC4 = new HttpGetHC4("http://51.38.133.76:90/users/50");
//
//        httpclient.execute(h);
//
//
//
//        HttpGet getRequest = new HttpGet("http://51.38.133.76:90/users/50");
//
//        getRequest.addHeader("Content-Type", "application/json");
//        getRequest.addHeader("Access-Control-Allow-Origin", "*");
//        getRequest.addHeader("Access-Control-Allow-Origin", "true");
//        try {
//            HttpResponse httpResponse = HttpClientBuilder.create().build().execute(getRequest);
//            String content = EntityUtils.toString(httpResponse.getEntity());
//            Log.i("TEST", content);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        String url = "http://www.google.com/search?q=developer";
//
//        HttpClients client = new DefaultHttpClient();
//        HttpGet request = new HttpGet(url);
//
//        // add request header
//        request.addHeader("User-Agent", USER_AGENT);
//
//        HttpResponse response = client.execute(request);
//
//        System.out.println("\nSending 'GET' request to URL : " + url);
//        System.out.println("Response Code : " +
//                response.getStatusLine().getStatusCode());
//
//        BufferedReader rd = new BufferedReader(
//                new InputStreamReader(response.getEntity().getContent()));
//
//        StringBuffer result = new StringBuffer();
//        String line = "";
//        while ((line = rd.readLine()) != null) {
//            result.append(line);
//        }
//
//        System.out.println(result.toString());
//
//    }

//        HttpURLConnection connection = null;
//        BufferedReader reader = null;
//        try {
//            URL url = new URL("http://51.38.133.76:90/users/50");
//            connection = (HttpURLConnection) url.openConnection();
//            connection.connect();
//
//            InputStream stream = connection.getInputStream();
//
//            reader = new BufferedReader(new InputStreamReader(stream));
//
//            StringBuffer stringBuffer = new StringBuffer();
//
//            String line = "";
//            while ((line = reader.readLine()) != null) {
//                stringBuffer.append(line + "");
//            }
//            Log.i("TESTOWANIE", line);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            connection.disconnect();
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


//        UserRepository userRepository = new UserRepository();
//
//        try {
//            String s = userRepository.get();
//            Log.i("Rest",s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
