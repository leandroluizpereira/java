package br.uninove.uniclima.http;  
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.uninove.uniclima.tempo.Tempo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public class Http {
    //throws se eu tiver algum probrema na linha principal eu vou levantar um erro
    private static String readAll(Reader rd)throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while((cp = rd.read())!=-1){
            sb.append((char)cp);     
        }
        return sb.toString();
    }
    public static Tempo getClima(String cidade){
        try {
            String charset = StandardCharsets.UTF_8.name();
            String url = "http://api.openweathermap.org/data/2.5/weather";
            String appid ="ffcaa0eccfb8709d3fd7dbc9deb24482"; // Colocar o suachave api
            String units ="metric";
            String lang ="pt_br";
            String query = String.format("q=%s&appid=%s&units=%s&lang=%s",
            URLEncoder.encode(cidade, charset),
            URLEncoder.encode(appid, charset),
            URLEncoder.encode(units, charset),
            URLEncoder.encode(lang, charset));
            URLConnection conn = new URL(url +"?"+ query).openConnection();
            conn.setRequestProperty("Accept-Charset",charset);
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded;charset="+charset);
            Tempo t;
            try(InputStream resp = conn.getInputStream()){
            BufferedReader buffer = new BufferedReader(new InputStreamReader(resp, Charset.forName("UTF-8")));
            String json = readAll(buffer);
            Gson gson = new Gson();
            //pega o counteudo do json etransforma em objeto no java
            t = gson.fromJson(json, Tempo.class);
            return t;
            }

        }catch(JsonSyntaxException | IOException E){
        } 
       return null;
    }
        
}
