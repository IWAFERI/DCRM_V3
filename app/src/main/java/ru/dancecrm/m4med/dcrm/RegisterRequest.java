package ru.dancecrm.m4med.dcrm;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

//класс делает запросы на регу  php файла на сервере и возращает ответ
public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "https://dancecrm.ru/dance_api/api/functions/register_user.php";
    private Map<String, String> params;

    public RegisterRequest(String username, String email, String password, String user_type, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("email", email);
        params.put("password", password);
        params.put("user_type", user_type);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
