//package wildbeards.com.bluechat.infrastructure;
//
//
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.HttpClientBuilder;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class UserRepository {
//
//
//
//    public String get() throws IOException {
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet httpGet = new HttpGet("http://51.38.133.76:90/users/50");
//        HttpResponse response = client.execute(httpGet);
//
//// Get the response
//        StringBuilder stringBuilder= new StringBuilder();
//        BufferedReader rd = new BufferedReader
//                (new InputStreamReader(
//                        response.getEntity().getContent()));
//
//        String line = "";
//        while ((line = rd.readLine()) != null) {
//            stringBuilder.append(line);
//        }
//
//
//
//       return stringBuilder.toString();
//
//
//    }
//}
