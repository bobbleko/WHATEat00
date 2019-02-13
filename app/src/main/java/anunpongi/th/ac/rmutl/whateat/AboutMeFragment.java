package anunpongi.th.ac.rmutl.whateat;

import android.app.Activity;
import android.arch.lifecycle.ViewModelStore;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.arch.lifecycle.ViewModelStore;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class AboutMeFragment extends Fragment {

    private DrawerLayout drawerLayout;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
//        group001 controller
        group001Controller();
//        group002 controller
        group002Controller();
//        group003 controller
        group003Controller();
//        group004 controller
        group004Controller();
//        group005 controller
        group005Controller();
//        group006 controller
        group006Controller();
//        group007 controller
        group007Controller();
//        group008 controller
        group008Controller();
//        group009 controller
        group009Controller();
//        group0010 controller
        group0010Controller();
//        group0011 controller
        group0011Controller();
//        group0012 controller
        group0012Controller();
//        group0013 controller
        group0013Controller();
//        group0014 controller
        group0014Controller();
//        group0015 controller
        group0015Controller();
//        group0016 controller
        group0016Controller();


    }

    private void group0016Controller() {
        Button button = getView().findViewById( R.id.Group0016 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group0015Controller() {
        Button button = getView().findViewById( R.id.Group0015 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group0014Controller() {
        Button button = getView().findViewById( R.id.Group0014 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group0013Controller() {
        Button button = getView().findViewById( R.id.Group0013 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group0012Controller() {
        Button button = getView().findViewById( R.id.Group0012 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group0011Controller() {
        Button button = getView().findViewById( R.id.Group0011 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group0010Controller() {
        Button button = getView().findViewById( R.id.Group0010 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group009Controller() {
        Button button = getView().findViewById( R.id.Group009 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group008Controller() {
        Button button = getView().findViewById( R.id.Group008 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group007Controller() {
        Button button = getView().findViewById( R.id.Group007 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group006Controller() {
        Button button = getView().findViewById( R.id.Group006 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group005Controller() {
        Button button = getView().findViewById( R.id.Group005 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group004Controller() {
        Button button = getView().findViewById( R.id.Group004 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

    private void group003Controller() {
        Button button = getView().findViewById( R.id.Group003 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace( R.id.contentFragmentMain , new InfoFragment() ).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }


    private void group002Controller() {
        Button button = getView().findViewById( R.id.Group002 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.contentFragmentMain, new InfoFragment()).commit();
                drawerLayout.closeDrawers();
        }
        } );
    }

    private void group001Controller() {
        Button button = getView().findViewById( R.id.Group001 );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.contentFragmentMain, new InfoFragment()).commit();
                drawerLayout.closeDrawers();
            }
        } );
    }

}
