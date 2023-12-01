package user.igor.photoaparat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.poddergka.R;

public class MainActivity extends AppCompatActivity {
    // cоздадим поля
    private float palto = 70; // пальто
    private int paltoSkidka = 77; // cкидка на пальто
    private float shlapa = 25; // шляпа
    private int shlapaSkidka = 37; // скидка на шляпу
    private float delKostum = 53; // деловой костюм
    private int delKostumSkidka = 44; // скидка на делвой костюм
    private float surohka = 19; // сурочка
    private float tufli = 41; // туфли
    private int tufliSkidka = 32; // скидка на туфли
    private float account = 312; // баланс
    // вывод на экран полученых значений




        // метод подсчёта стоимости серверного комплекта
        private float calculation() {
            // создание и инициализация переменной подсчёта стоимости
            float count = (palto * (100 - paltoSkidka) + shlapa * (100 - shlapaSkidka)
                    + delKostum * (100 - delKostumSkidka) + tufli * (100 - tufliSkidka)) / 100 + surohka;
            return count; // возврат подсчитанного значения
        }

        // метод определения возможностей бюджета покупки серверного комплекта
        private boolean possibility() {
            if (calculation() <= account) { // если стоимость комплекта меньше имеющихся средств
                return true; // то возврат истинного значения
            } else { // иначе
                return false; // возврат ложного значения
            }
        }

        // метод определения возможной сдачи
        private float balance() {
            if(possibility()) { // если имеется возможность купить серверный комплект
                return account - calculation(); // то возвращается остаток от покупки
            } else { // иначе
                return -1; // возвращается маркер недостатка денежных средств
            }
        }

        // создание дополнительных полей для вывода на экран полученных значений
        private TextView veshi; // поле возможности покупки
        private TextView ostatok; // поле возможного остатка от покупки

        // вывод на экран полученных значений
        @Override
        protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main); // присваивание жизненному циклу активити представления activity_main

            // присваивание переменным активити элементов представления activity_main
            veshi = findViewById(R.id.veshi); // вывод информации о возможности покупки
            ostatok = findViewById(R.id.ostatok); // вывод информации о возможном остатке от покупки

            // запонение экрана
            if (possibility()) { // если имеется возможность купить серверный комплект
                veshi.setText("Имеется достаточно средств для покупки серверного комплекта");
                ostatok.setText("Остаток от покупки " + balance() + " серебрянных монет");
            } else { // иначе
                veshi.setText("Недостаточно средств для покупки серверного комплекта");
                ostatok.setText(" - ");
            }
        }
    }
    }

