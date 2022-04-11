package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private TextView Score;
    private TextView Scorebb1;
    private TextView Scorebb2;
    private TextView b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Random rand = new Random();
    int lol = 666;
    int ochered = 1;
    int[] pole = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] polesurpr = new int[]{rand.nextInt(4), rand.nextInt(4), rand.nextInt(4), rand.nextInt(4), rand.nextInt(4), rand.nextInt(4), rand.nextInt(4), rand.nextInt(4), rand.nextInt(4)};
    int deads = rand.nextInt(9);
    int point1 = 0;
    int point2 = 0;


    public boolean wins(int poles0, int poles1, int poles2, int poles3, int poles4, int poles5, int poles6, int poles7, int poles8) {


        boolean win = false;
        return win;
    }


    public void CLICK10(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        Score = findViewById(R.id.Score);
        Score.setText("Очередь Игрока 1...");
        polesurpr[0] = rand.nextInt(4);
        polesurpr[1] = rand.nextInt(4);
        polesurpr[2] = rand.nextInt(4);
        polesurpr[3] = rand.nextInt(4);
        polesurpr[4] = rand.nextInt(4);
        polesurpr[5] = rand.nextInt(4);
        polesurpr[6] = rand.nextInt(4);
        polesurpr[7] = rand.nextInt(4);
        polesurpr[8] = rand.nextInt(4);
        deads = rand.nextInt(9);
        //polesurpr[deads] = 3;
        ochered = 1;



                b1 = findViewById(R.id.b1);
                b1.setText("\uD83C\uDF81");
        b1 = findViewById(R.id.b2);
        b1.setText("\uD83C\uDF81");
        b1 = findViewById(R.id.b3);
        b1.setText("\uD83C\uDF81");
        b1 = findViewById(R.id.b4);
        b1.setText("\uD83C\uDF81");
        b1 = findViewById(R.id.b5);
        b1.setText("\uD83C\uDF81");
        b1 = findViewById(R.id.b6);
        b1.setText("\uD83C\uDF81");
        b1 = findViewById(R.id.b7);
        b1.setText("\uD83C\uDF81");
        b1 = findViewById(R.id.b8);
        b1.setText("\uD83C\uDF81");
        b1 = findViewById(R.id.b9);
        b1.setText("\uD83C\uDF81");

        point1 = 0;
        point2 = 0;
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);









    }
    public void CLICK1(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        //polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[0] == 0) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[0] == 1) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[0] == 2) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[0] == 3) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }

            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[0] == 0) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[0] == 1) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[0] == 2) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[0] == 3) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);
        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


    }

    public void CLICK2(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[1] == 0) {
                    b1 = findViewById(R.id.b2);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[1] == 1) {
                    b1 = findViewById(R.id.b2);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[1] == 2) {
                    b1 = findViewById(R.id.b2);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[1] == 3) {
                    b1 = findViewById(R.id.b2);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }

            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[1] == 0) {
                    b1 = findViewById(R.id.b2);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[1] == 1) {
                    b1 = findViewById(R.id.b2);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[1] == 2) {
                    b1 = findViewById(R.id.b2);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[1] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[1] == 3) {
                    b1 = findViewById(R.id.b2);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);
        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


    }

    public void CLICK3(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[2] == 0) {
                    b1 = findViewById(R.id.b3);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[2] == 1) {
                    b1 = findViewById(R.id.b3);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[2] == 2) {
                    b1 = findViewById(R.id.b3);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[2] == 3) {
                    b1 = findViewById(R.id.b3);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }

            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[2] == 0) {
                    b1 = findViewById(R.id.b3);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[2] == 1) {
                    b1 = findViewById(R.id.b3);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[2] == 2) {
                    b1 = findViewById(R.id.b3);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[2] == 3) {
                    b1 = findViewById(R.id.b3);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);
        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


    }

    public void CLICK4(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[3] == 0) {
                    b1 = findViewById(R.id.b4);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[3] == 1) {
                    b1 = findViewById(R.id.b4);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[3] == 2) {
                    b1 = findViewById(R.id.b4);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[3] == 3) {
                    b1 = findViewById(R.id.b4);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }

            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[3] == 0) {
                    b1 = findViewById(R.id.b4);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[3] == 1) {
                    b1 = findViewById(R.id.b4);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[3] == 2) {
                    b1 = findViewById(R.id.b4);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[3] == 3) {
                    b1 = findViewById(R.id.b4);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);
        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


    }

    public void CLICK5(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[4] == 0) {
                    b1 = findViewById(R.id.b5);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[4] == 1) {
                    b1 = findViewById(R.id.b5);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[4] == 2) {
                    b1 = findViewById(R.id.b5);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[4] == 3) {
                    b1 = findViewById(R.id.b5);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }

            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[4] == 0) {
                    b1 = findViewById(R.id.b5);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[4] == 1) {
                    b1 = findViewById(R.id.b5);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[4] == 2) {
                    b1 = findViewById(R.id.b5);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[4] == 3) {
                    b1 = findViewById(R.id.b1);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);
        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


    }

    public void CLICK6(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[5] == 0) {
                    b1 = findViewById(R.id.b6);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[5] == 1) {
                    b1 = findViewById(R.id.b6);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[5] == 2) {
                    b1 = findViewById(R.id.b6);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[5] == 3) {
                    b1 = findViewById(R.id.b6);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }

            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[5] == 0) {
                    b1 = findViewById(R.id.b6);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[5] == 1) {
                    b1 = findViewById(R.id.b6);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[5] == 2) {
                    b1 = findViewById(R.id.b6);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[5] == 3) {
                    b1 = findViewById(R.id.b6);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);
        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


    }

    public void CLICK7(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[6] == 0) {
                    b1 = findViewById(R.id.b7);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[6] == 1) {
                    b1 = findViewById(R.id.b7);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[6] == 2) {
                    b1 = findViewById(R.id.b7);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[6] == 3) {
                    b1 = findViewById(R.id.b7);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }

            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[6] == 0) {
                    b1 = findViewById(R.id.b7);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[6] == 1) {
                    b1 = findViewById(R.id.b7);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[6] == 2) {
                    b1 = findViewById(R.id.b7);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[6] == 3) {
                    b1 = findViewById(R.id.b7);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);
        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


    }

    public void CLICK8(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();

        polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[7] == 0) {
                    b1 = findViewById(R.id.b8);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[7] == 1) {
                    b1 = findViewById(R.id.b8);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[7] == 2) {
                    b1 = findViewById(R.id.b8);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[7] == 3) {
                    b1 = findViewById(R.id.b8);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }

            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[7] == 0) {
                    b1 = findViewById(R.id.b8);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[7] == 1) {
                    b1 = findViewById(R.id.b8);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[7] == 2) {
                    b1 = findViewById(R.id.b8);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[7] == 3) {
                    b1 = findViewById(R.id.b8);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);
        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


    }

    public void CLICK9(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();

        polesurpr[deads] = 3;

        if (ochered > 2) {
            ochered = 1;
        }
        if (buttonText.equals("\uD83C\uDF81")) {
            if (ochered == 1) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 2...");
                if (polesurpr[8] == 0) {
                    b1 = findViewById(R.id.b9);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+100;
                }
                if (polesurpr[8] == 1) {
                    b1 = findViewById(R.id.b9);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+200;
                }
                if (polesurpr[8] == 2) {
                    b1 = findViewById(R.id.b9);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = point1+300;
                }
                if (polesurpr[8] == 3) {
                    b1 = findViewById(R.id.b9);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point1 = 0;
                }


            } else if (ochered == 2) {
                Score = findViewById(R.id.Score);
                Score.setText("Очередь Игрока 1...");
                if (polesurpr[8] == 0) {
                    b1 = findViewById(R.id.b9);
                    b1.setText("\uD83D\uDC95");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+100;
                }
                if (polesurpr[8] == 1) {
                    b1 = findViewById(R.id.b9);
                    b1.setText("\uD83C\uDF82");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+200;
                }
                if (polesurpr[8] == 2) {
                    b1 = findViewById(R.id.b9);
                    b1.setText("\uD83D\uDC8E");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = point2+300;
                }
                if (polesurpr[8] == 3) {
                    b1 = findViewById(R.id.b9);
                    b1.setText("\uD83D\uDC80");
                    ochered = ochered + 1;
                    pole[0] = 3;
                    point2 = 0;
                }
            }

        }
        Scorebb1 = findViewById(R.id.bb1);
        Scorebb2 = findViewById(R.id.bb2);
        Scorebb1.setText("Игрок 1: "+point1);
        Scorebb2.setText("Игрок 2: "+point2);

        wins(pole[0], pole[1], pole[2], pole[3], pole[4], pole[5], pole[6], pole[7], pole[8]);


        }

    }







