package user.igor.perevod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.poddergka.R;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    // поля
    private EditText textIn // ввод
    private TextView textOut // вывод
    private Button button // перевод текста



    // задание контейнера для словоря

    private Map<String, String> ruFi;

    private String text; // буфферная строка
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    // привязка полей к разметке
        textIn = findViewById(R.id.inputText)
        textOut = findViewById(R.id.outputText)
        button = findViewById(R.id.Button)
        // создание контейнера для данных
        ruFi = new HashMap<> ();
        // инациализачия (запоминание) словоря
        dataInitial();
        setContentView(R.layout.activity_main);
    }
}