package com.demo.nicaevent.app;

import android.app.Activity;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

/**
 * Created by Billi on 15/12/2016.
 */
public class MyWelcomeActivity extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.blue)
                .page(new TitlePage(R.drawable.welcome_image,
                        "Nica Event")
                )
                .page(new BasicPage(R.drawable.welcome_image,
                        "¿Estás al tanto de los eventos en Nicaragua?",
                        "Sin duda esta aplicación te ayudará")
                        .background(R.color.orange)
                )
                .page(new BasicPage(R.drawable.welcome_image,
                        "Toda clase de eventos",
                        "Disponible en tu dispositivo")
                )
                .swipeToDismiss(true)
                .build();
    }
}
